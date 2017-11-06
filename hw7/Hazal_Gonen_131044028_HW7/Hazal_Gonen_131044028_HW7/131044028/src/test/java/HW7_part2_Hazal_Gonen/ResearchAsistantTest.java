/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HW7_part2_Hazal_Gonen;

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
public class ResearchAsistantTest {

    @Before
    public void setUpClass() {
        System.out.println("\n\n Test metodu çağrılacak.");
    }

    @After
    public void tearDownClass() {
        System.out.println(" Test metodu bitti.");
    }

    /**
     * Test of getName method, of class ResearchAsistant.
     */
    @Test
    public void testGetName() {
        System.out.println("getName");
        ResearchAsistant instance = new ResearchAsistant("hazal");
        String expResult = "hazal";
        String result = instance.getName();
        assertEquals(expResult, result);

    }

}
