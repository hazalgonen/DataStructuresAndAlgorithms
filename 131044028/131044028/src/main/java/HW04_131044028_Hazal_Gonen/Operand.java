/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HW04_131044028_Hazal_Gonen;

import java.util.ArrayList;

/**
 *
 * @author hazal
 */
public  class Operand extends Expression {

    /**
     * operand adi
     */
    private String name;

    /**
     * operand degeri
     */
    private int value = 0;

    /**
     * operandin register'i
     */
    protected Register register = null;

    /**
     * butun operandlari tutan array
     */
    private static ArrayList<Operand> allVariable = new ArrayList<>();

    /**
     * constructor
     *
     * @param name
     * @throws HW04_131044028_Hazal_Gonen.myException.MyArrayIndexOutOfBoundsException
     */
    public Operand(String name) throws MyArrayIndexOutOfBoundsException {

        this.name = name;
        this.value = 0;

        if (!isRegistered()) {
            if (!name.equals("temp")) {
                register = new Register();
            }
            allVariable.add(this);

        }

    }

    /**
     * constructor
     *
     * @param name
     * @param value
     * @throws HW04_131044028_Hazal_Gonen.myException.MyArrayIndexOutOfBoundsException
     */
    public Operand(String name, int value) throws MyArrayIndexOutOfBoundsException {
        this.name = name;

        this.value = value;

        if (!isRegistered()) {
            if (!name.equals("temp")) {
                register = new Register();
            }
            allVariable.add(this);
        }

    }

    /**
     * constructor
     *
     * @param name
     * @param value
     * @param register_
     */
    public Operand(String name, int value, Register register_) {
        this.name = name;
        this.value = value;
        this.register = register_;
        allVariable.add(this);

    }

    /**
     * name i get eder
     *
     * @return
     */
    public String getName() {
        return name;
    }

    /**
     * registerin indexini get eder
     *
     * @return
     */
    public int getRegisterIndex() throws MyArrayIndexOutOfBoundsException {
        return register.getIndexRegister();
    }

    /**
     * degerini get eder
     *
     * @return
     */
    public int getValue() {
        return value;
    }

    /**
     * degerini set eder
     *
     * @param value_
     */
    public void setValue(int value_) {
        value = value_;
    }

    /**
     * registeri set eder
     *
     * @param register
     */
    public void setRegister(Register register) {
        this.register = register;
    }

    /**
     * register siler
     */
    public void remove() throws MyArrayIndexOutOfBoundsException {
        register.deleted(register.getIndexRegister());
    }

    /**
     * kayitli mi diye bakar
     *
     * @return
     */
    private boolean isRegistered() {
        for (int i = 0; i < allVariable.size(); i++) {
            if (allVariable.get(i).getName().equals(this.name)) {
                this.register = allVariable.get(i).register;
                return true;
            }
        }
        return false;
    }

}
