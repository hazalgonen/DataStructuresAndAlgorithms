/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HW04_131044028_Hazal_Gonen;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 *
 * @author hazal
 */
public class TemporaryVariableTest {

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
     * toString metodu
     * @throws HW04_131044028_Hazal_Gonen.myException.MyArrayIndexOutOfBoundsException
     */
    @Test
    public void testToString() throws myException.MyArrayIndexOutOfBoundsException {
        System.out.println("** toString Testi **");
        TemporaryVariable instance = new TemporaryVariable(5);
        String result = instance.toString();
        System.out.println(" Yeni temporaryVariable olusturdum : " + result);
    }

}
