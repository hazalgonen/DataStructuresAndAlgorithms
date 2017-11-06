/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HW04_131044028_Hazal_Gonen;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author hazal
 */
public class Operator extends Expression {

    private static final String ADDITION = "+";
    private static final String SUBTRACTION = "-";
    private static final String MULTIPLICATION = "*";
    private static final String DIVISION = "/";
    private static final String ASSIGNMENT = "=";

    public int presendence_;
    private String operator;

    /**
     * Constructor
     *
     * @param op
     */
    public Operator(String op) {
        try {
            setOperator(op);
        } catch (MyInvalidOperator ex) {
            ex.getMessage();
        }
    }

    /**
     * setter
     *
     * @param op
     * @throws HW04_131044028_Hazal_Gonen.myException.MyInvalidOperator
     */
    public void setOperator(String op) throws MyInvalidOperator {
        if (op.compareTo(ADDITION) == 0) {
            operator = ADDITION;
            presendence_ = 1;
        } else if (op.compareTo(SUBTRACTION) == 0) {
            operator = SUBTRACTION;
            presendence_ = 1;
        } else if (op.compareTo(MULTIPLICATION) == 0) {
            operator = MULTIPLICATION;
            presendence_ = 2;
        } else if (op.compareTo(DIVISION) == 0) {
            operator = DIVISION;
            presendence_ = 2;
        } else if (op.compareTo(ASSIGNMENT) == 0) {
            operator = ASSIGNMENT;
            presendence_ = 0;
        } else {
            throw new MyInvalidOperator("Beklenmeyen operator girildi");
        }

        if (op.length() != 1) {
            throw new MyInvalidOperator("Beklenmeyen operator girildi");
        }
    }

    /**
     * getter
     *
     * @return
     */
    public char getOperator() {

        return operator.charAt(0);
    }

    /* toString methodu override yapildi
     *
     * @return
     */
    @Override
    public String toString() {
        String strI = "" + operator;
        return strI;
    }

}
