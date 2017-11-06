/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HW04_131044028_Hazal_Gonen;

/**
 *
 * @author hazal
 */
import HW04_131044028_Hazal_Gonen.myException.MyClassCastException;
import HW04_131044028_Hazal_Gonen.myException.MyInvalidClass;
import java.util.*;

public class InfixToPostfix {

    /**
     * The operator stack
     */
    private Stack< Operator> operatorStack;

    /**
     * postfix hali
     */
    Expression postfix;

    /**
     * constructor
     */
    public InfixToPostfix() {
        postfix = new Expression();
    }

    /**
     *
     * @param infix cevrilecek olan expression
     * @return cevrilen expression return edilir
     * @throws HW04_131044028_Hazal_Gonen.myException.MyInvalidClass
     * @throws HW04_131044028_Hazal_Gonen.myException.MyClassCastException
     */
    public Expression convert(Expression infix) throws MyInvalidClass, MyClassCastException {

        operatorStack = new Stack<>();
        try {
            for (int i = 0; i < infix.size(); ++i) {

                if (infix.getExpression(i) instanceof Operand) {
                    postfix.add(infix.getExpression(i));
                } else if (infix.getExpression(i) instanceof Operator) {
                    Operator op = (Operator) infix.getExpression(i);
                    processOperator(op);
                } else if (infix.getExpression(i) instanceof printClass) {
                    printClass p = (printClass) infix.getExpression(i);
                    postfix.add(p);
                } else {
                    throw new MyInvalidClass("Beklenmeyen bir expression girildi");
                }
            }
            while (!operatorStack.empty()) {
                postfix.add(operatorStack.pop());
            }
        } catch (myException.MyArrayIndexOutOfBoundsException | MyInvalidClass ex) {
            ex.getMessage();
        } catch (Exception ex) {
            if (ex instanceof ClassCastException) {
                throw new MyClassCastException("Hatali cast yapildi");
            }
        }

        return postfix;

    }

    /**
     * gelen operatorun islemi yapilir
     *
     * @param op
     */
    private void processOperator(Operator op) {
        if (operatorStack.empty()) {
            operatorStack.push(op);

        } else {
            Operator topOp = operatorStack.peek();

            if (op.presendence_ > topOp.presendence_) {
                operatorStack.push(op);

            } else {

                while (!operatorStack.empty() && (op.presendence_ <= topOp.presendence_)) {
                    operatorStack.pop();

                    postfix.add(topOp);
                    if (!operatorStack.empty()) {

                        topOp = operatorStack.peek();
                    }
                }
                operatorStack.push(op);
            }
        }
    }
}
