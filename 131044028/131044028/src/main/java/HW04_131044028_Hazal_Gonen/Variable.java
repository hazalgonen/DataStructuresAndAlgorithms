/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HW04_131044028_Hazal_Gonen;

/**
 * Variable classi degiskenler icindir a , x gibi
 *
 * @author hazal
 */
public class Variable extends Operand {

    /**
     * degiskenin adi
     */
    private String name;

    /**
     * constructor
     * @param name_ degiskenin adi
     * @param value degiskenin degeri
     * @throws HW04_131044028_Hazal_Gonen.myException.MyArrayIndexOutOfBoundsException
     */
    public Variable(String name_, int value) throws MyArrayIndexOutOfBoundsException {
        super(name_, value);
        name = name_;
    }

    /**
     * constructor
     * @param name_ degiskenin adi 
     * @throws HW04_131044028_Hazal_Gonen.myException.MyArrayIndexOutOfBoundsException 
     */
    public Variable(String name_) throws MyArrayIndexOutOfBoundsException {
        super(name_);
        this.name = name_;
    }

    /**
     * toString metodu override edildi
     * @return 
     */
    @Override
    public String toString() {

        String strI = "" + name;
        return strI;
    }
}
