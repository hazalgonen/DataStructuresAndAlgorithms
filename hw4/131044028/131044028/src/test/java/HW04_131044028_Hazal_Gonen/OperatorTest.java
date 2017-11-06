/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HW04_131044028_Hazal_Gonen;

import org.junit.After;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;

/**
 *
 * @author hazal
 */
public class OperatorTest {
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
     * operatoru set eder
     * @throws java.lang.Exception
     */
    @Test
    public void testSetOperator() throws Exception {
        System.out.println("** setOperator Testi **");
        Operator instance = new Operator("+");
        System.out.println(" SetOperator yapilmadan once getOperator " + instance.getOperator());
        instance.setOperator("-");
        System.out.println(" SetOperator yapildiktan sonra getOperator " + instance.getOperator());

    }

    /**
     * operatoru get yapar
     */
    @Test
    public void testGetOperator() {
        System.out.println("** getOperator Testi **");
        Operator instance = new Operator("+");
        char expResult = '+';
        char result = instance.getOperator();
        System.out.println(" Operator " + instance.getOperator());
        assertEquals(expResult, result);

    }

    /**
     * toString metodu
     */
    @Test
    public void testToString() {
        System.out.println("** toString Testi **");
        Operator instance = new Operator("+");
        System.out.println(instance.toString());
    }

}
