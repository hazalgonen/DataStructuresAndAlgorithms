/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HW04_131044028_Hazal_Gonen;

import HW04_131044028_Hazal_Gonen.myException.MyArrayIndexOutOfBoundsException;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

/**
 *
 * @author hazal
 */
public class PostfixToAsm extends Exception {

    /**
     *
     */
    private static MyArrayList<TemporaryVariable> tempVariables;
    private Stack<Operand> operandStack;
    private MyArrayList<Operand> allop;

    public PostfixToAsm() throws IOException {
        allop = new MyArrayList<>();
        tempVariables = new MyArrayList<>();
    }

    private void writer(String str) throws IOException {
        try {
            String filename = "output.asm";
            FileWriter fw = new FileWriter(filename, true);

            fw.append(str);
            fw.append("\n");
            fw.close();
        } catch (IOException ioe) {
            System.err.println("IOException: " + ioe.getMessage());
        }
    }

    public Exception convert(Expression postfix) throws MyArrayIndexOutOfBoundsException {
        try {

            operandStack = new Stack<>();
            boolean bool = true;
            if (postfix.size() == 3) {
                if (postfix.getExpression(1) instanceof TemporaryVariable) {

                    Operand temp = (Operand) postfix.getExpression(0);
                    operandStack.push(temp);
                    Operand temp1 = (Operand) postfix.getExpression(1);
                    operandStack.push(temp1);

                    temp = assignment();
                    bool = false;
                }
            }
            if (postfix.getExpression(0) instanceof printClass) {
                printfunction(postfix.getExpression(1));
            }
            if (bool) {
                for (int i = 0; i < postfix.size(); ++i) {
                    if (postfix.getExpression(i) instanceof Operand) {
                        Operand temp = (Operand) postfix.getExpression(i);

                        if (temp instanceof TemporaryVariable) {
                            TemporaryVariable temp1 = (TemporaryVariable) temp;
                            // if (!isRegisteredTemporary(temp1)) {

                            if (temp1.register == null) {
                                Register register_ = new Register();
                                temp1.register = register_;
                            }

                            tempVariables.add(temp1);

                            //}
                            String str = "li $" + temp1.register.getRegister() + ", " + temp1.getValue();
                            // out.append("li $" + temp1.register.getRegister() + ", " + temp1.getValue());
                            writer(str);
                            System.out.println("li $" + temp1.register.getRegister() + ", " + temp1.getValue());
                            operandStack.push(temp1);
                        } else if (temp instanceof Variable) {
                            Variable temp1 = (Variable) temp;
                            operandStack.push(temp1);
                        }

                    } else if (postfix.getExpression(i) instanceof Operator) {
                        Operator temp = (Operator) postfix.getExpression(i);

                        eval(temp);

                    }

                }
            }
            for (int i = 0; i < tempVariables.size(); ++i) {
                tempVariables.get(i).remove();

            }
            writer("\n");
        } catch (IOException e) {
        }

        return null;
    }

    private void printfunction(Expression exp) throws IOException {

        String str = "";
        Operand temp = (Operand) exp;
        System.out.println("move $" + "a0 $" + temp.register.getRegister());
        System.out.println("li $" + "v0 ," + "1");
        System.out.println("syscall");

        str = "move $" + "a0 $" + temp.register.getRegister();
        writer(str);
        str = "li $" + "v0 ," + "1";

        writer(str);
        str = "syscall";
        writer(str);
    }

    private Operand assignment() throws IOException {
        Operand rhs = operandStack.pop();
        Operand lhs = operandStack.pop();

        lhs.setValue(rhs.getValue());

        allop.add(lhs);
        System.out.println("li $" + lhs.register.getRegister() + ", " + lhs.getValue());
        String str = "li $" + lhs.register.getRegister() + ", " + lhs.getValue();
        writer(str);

        return lhs;

    }

    /**
     *
     * @param operator
     * @return
     * @throws IOException
     */
    private Operand eval(Operator operator) throws IOException, ArrayIndexOutOfBoundsException {
        try {
            Operand rhs = operandStack.pop();
            Operand lhs = operandStack.pop();

            if (lhs instanceof Variable) {
                for (int i = 0; i < allop.size(); ++i) {
                    if (lhs.register.getRegister().equals(allop.get(i).register.getRegister())) {
                        lhs.setValue(allop.get(i).getValue());
                    }
                }
            }

            if (rhs instanceof Variable) {
                for (int i = 0; i < allop.size(); ++i) {
                    if (rhs.register.getRegister().equals(allop.get(i).register.getRegister())) {
                        rhs.setValue(allop.get(i).getValue());
                    }
                }
            }

            int result = 0;
            if (operator.getOperator() == '*') {

                System.out.println("mult $" + lhs.register.getRegister() + ", $" + rhs.register.getRegister());
                String str = "mult $" + lhs.register.getRegister() + ", $" + rhs.register.getRegister();
                writer(str);
                result = rhs.getValue() * lhs.getValue();

            }
            if (operator.getOperator() == '/') {
                System.out.println("div $" + lhs.register.getRegister() + ", $" + rhs.register.getRegister());
                String str = "div $" + lhs.register.getRegister() + ", $" + rhs.register.getRegister();
                writer(str);
                if (lhs.getValue() != 0) {
                    result = lhs.getValue() / rhs.getValue();
                }
            }
            if (operator.getOperator() == '/' || operator.getOperator() == '*') {

                Operand temp = new TemporaryVariable(result);
                temp.setValue(result);
                if (lhs instanceof TemporaryVariable) {
                    if (lhs.register != null) {
                        temp.setRegister(lhs.register);

                    }
                } else if (rhs instanceof TemporaryVariable) {
                    if (rhs.register != null) {
                        temp.setRegister(rhs.register);

                    }
                } else {
                    Register re = new Register();
                    temp.setRegister(re);

                }
                tempVariables.add((TemporaryVariable) temp);
                System.out.println("mflo $" + temp.register.getRegister());
                String str = "mflo $" + temp.register.getRegister();
                writer(str);
                operandStack.push(temp);
                return temp;
            }

            if (operator.getOperator() == '-') {
                result = lhs.getValue() - rhs.getValue();
                Operand temp = new TemporaryVariable(result);

                Register tempRegister = new Register();
                temp.register = tempRegister;
                temp.setValue(result);

                operandStack.push(temp);

                System.out.println("sub $" + temp.register.getRegister() + ", $" + lhs.register.getRegister() + ", $" + rhs.register.getRegister());

                String str = "sub $" + temp.register.getRegister() + ", $" + lhs.register.getRegister() + ", $" + rhs.register.getRegister();
                writer(str);
                tempVariables.add((TemporaryVariable) temp);

                return temp;
            }

            if (operator.getOperator() == '=') {
                lhs.setValue(rhs.getValue());

                if (lhs instanceof Variable) {
                    for (int i = 0; i < allop.size(); ++i) {
                        if (lhs.register.getRegister().equals(allop.get(i).register.getRegister())) {
                            allop.get(i).setValue(lhs.getValue());
                        }
                    }
                }

                System.out.println("move $" + lhs.register.getRegister() + ", $" + rhs.register.getRegister());

                String str = "move $" + lhs.register.getRegister() + ", $" + rhs.register.getRegister();
                writer(str);
                return lhs;
            }

            if (operator.getOperator() == '+') {
                result = lhs.getValue() + rhs.getValue();
                Operand temp = new TemporaryVariable(result);
                Register tempRegister = new Register();
                temp.register = tempRegister;
                temp.setValue(result);
                operandStack.push(temp);
                System.out.println("add $" + temp.register.getRegister() + ", $" + lhs.register.getRegister() + ", $" + rhs.register.getRegister());

                String str = "add $" + temp.register.getRegister() + ", $" + lhs.register.getRegister() + ", $" + rhs.register.getRegister();
                writer(str);
                tempVariables.add((TemporaryVariable) temp);

                return temp;
            }
        } catch (MyArrayIndexOutOfBoundsException | IOException ex) {
            ex.getMessage();
        }
        return null;

    }
}
