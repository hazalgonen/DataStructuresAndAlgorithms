/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HW04_131044028_Hazal_Gonen;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;

/**
 *
 * @author hazal
 */
public class OperandTest {
    @Before
    public void setUpClass() {
        System.out.println("\n\n-------------------------------");
        System.out.println(" Test metodu çağrılacak.\n");
    }

    @After
    public void tearDownClass() {
        System.out.println("\n Test metodu bitti.");
        System.out.println("-------------------------------");
    }
    /**
     * operandin name'ini return eder
     *
     * @throws
     * HW04_131044028_Hazal_Gonen.myException.MyArrayIndexOutOfBoundsException
     */
    @Test
    public void testGetName() throws myException.MyArrayIndexOutOfBoundsException {
        System.out.println("** getName Testi **");
        Operand instance = new Variable("x");
        String expResult = "x";
        String result = instance.getName();
        System.out.println(" x'in name'i: " + result);
        assertEquals(expResult, result);

    }

    /**
     * register indexivi return eder
     *
     * @throws
     * HW04_131044028_Hazal_Gonen.myException.MyArrayIndexOutOfBoundsException
     */
    @Test
    public void testGetRegisterIndex() throws myException.MyArrayIndexOutOfBoundsException {
        System.out.println("** getRegisterIndex Testi **");
        Operand instance = new Variable("x");
        Operand instance1 = new Variable("y");
        int result = instance.getRegisterIndex();
        System.out.println(" x'in register indexi: " + result);
        System.out.println(" y'nin register indexi: " + instance1.getRegisterIndex());

    }

    /**
     * degerini return eder
     *
     * @throws
     * HW04_131044028_Hazal_Gonen.myException.MyArrayIndexOutOfBoundsException
     */
    @Test
    public void testGetValue() throws myException.MyArrayIndexOutOfBoundsException {
        System.out.println("** getValue Testi **");
        Operand instance = new Variable("x", 5);
        int expResult = 5;
        int result = instance.getValue();
        System.out.println(" x in degeri : " + instance.getValue());
        assertEquals(expResult, result);
    }

    /**
     * degerini set eder
     *
     * @throws
     * HW04_131044028_Hazal_Gonen.myException.MyArrayIndexOutOfBoundsException
     */
    @Test
    public void testSetValue() throws myException.MyArrayIndexOutOfBoundsException {
        System.out.println("** setValue Testi **");

        int value_ = 8;
        Operand instance = new Variable("x", 5);
        System.out.println(" Operand eski value degeri: " + instance.getValue());
        instance.setValue(value_);
        System.out.println(" Operand set(8) yapildiktan sonra yeni value degeri: " + instance.getValue());

    }

    /**
     * registeri set eder
     * @throws HW04_131044028_Hazal_Gonen.myException.MyArrayIndexOutOfBoundsException
     */
    @Test
    public void testSetRegister() throws myException.MyArrayIndexOutOfBoundsException {
        System.out.println("** setRegister Testi **");
        Operand instance = new Variable("z", 5);
        System.out.println(" Operand eski registeri: " + instance.register.getRegister());
        Register register = new Register();

        instance.setRegister(register);

        System.out.println(" Operand setRegister(register) yapildiktan sonra yeni registeri: " + instance.register.getRegister());

    }

    /**
     * operandi siler
     * @throws HW04_131044028_Hazal_Gonen.myException.MyArrayIndexOutOfBoundsException
     */
    @Test
    public void testRemove() throws myException.MyArrayIndexOutOfBoundsException {
        System.out.println("** remove Testi **");
        Operand instance = new TemporaryVariable(5);
        Register register = new Register();
        instance.setRegister(register);
        System.out.println(" Silmeden once register indexi " + instance.register.getUnUsedRegister());
        instance.remove();
        if (instance.register == null) {
            System.out.println(" Basariyla silindi ");
        }
        System.out.println(" Silmeden once register indexi " + instance.register.getUnUsedRegister());

    }

}
