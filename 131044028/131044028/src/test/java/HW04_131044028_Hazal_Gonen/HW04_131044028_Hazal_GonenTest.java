/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HW04_131044028_Hazal_Gonen;

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
public class HW04_131044028_Hazal_GonenTest {
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
     * Test of main method, of class HW04_131044028_Hazal_Gonen.
     */
    @Test
    public void testMain() throws Exception {
        System.out.println("main");
        String[] args = null;
        HW04_131044028_Hazal_Gonen.main(args);
       
    }
    
}
