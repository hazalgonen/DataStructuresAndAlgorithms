/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TreesHW;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author hazal
 */
public class ComparePGTest {

    /**
     *
     */
    @Before
    public void setUpClass() {
        System.out.println("\n\n*********************************************");
        System.out.println("Test metodu çağrılacak.");
    }

    /**
     *
     */
    @After
    public void tearDownClass() {
        System.out.println("\nTest metodu bitti.");
        System.out.println("*********************************************");
    }

    /**
     * ilki kucukse -1 buyukse 1 esitse 0
     */
    @Test
    public void testCompare() {
        System.out.println("compare");
        Integer t = 1;
        Integer t1 = 2;
        ComparePG instance = new ComparePG();
        int expResult = -1;
        int result = instance.compare(t, t1);
        System.out.println(result);
         assertEquals(expResult, result);

    }

}
