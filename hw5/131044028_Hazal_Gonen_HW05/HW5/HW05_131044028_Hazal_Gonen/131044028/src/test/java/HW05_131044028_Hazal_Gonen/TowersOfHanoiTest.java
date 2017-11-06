/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HW05_131044028_Hazal_Gonen;

import java.util.Stack;
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
public class TowersOfHanoiTest {

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
     * Test of TowerOfHanoi method, of class TowersOfHanoi.
     */
    @Test
    public void testTowerOfHanoi() {
        System.out.println("TowerOfHanoi");

        System.out.println("3 tane disk varsa :");
        int num_of_disks = 3;

        Stack<Integer> src = new Stack<>();
        Stack<Integer> dest = new Stack<>();
        Stack<Integer> aux = new Stack<>();

        TowersOfHanoi t = new TowersOfHanoi();
        t.TowerOfHanoi(num_of_disks, src, dest, aux);

    }

}
