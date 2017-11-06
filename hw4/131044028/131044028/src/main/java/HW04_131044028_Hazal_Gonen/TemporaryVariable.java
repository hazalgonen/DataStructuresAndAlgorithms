/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HW04_131044028_Hazal_Gonen;

/**
 * Gecici degiskenler icindir
 *
 * @author hazal
 */
public class TemporaryVariable extends Operand {

    /**
     * degiskenin degeri
     */
    private int value;

    /**
     * constructor
     *
     * @param value degiskenin degeri
     */
    public TemporaryVariable(int value) throws MyArrayIndexOutOfBoundsException {

        super("temp", value);
        this.value = value;
    }

    /**
     * toString metodu override edildi
     *
     * @return
     */
    @Override
    public String toString() {
        String strI = "" + value;
        return strI;
    }
}
