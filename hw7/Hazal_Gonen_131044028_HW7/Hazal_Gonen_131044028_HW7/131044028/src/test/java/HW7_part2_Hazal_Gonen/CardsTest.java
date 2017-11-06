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
public class CardsTest {

    @Before
    public void setUpClass() {
        System.out.println("\n\n Test metodu çağrılacak.");
    }

    @After
    public void tearDownClass() {
        System.out.println(" Test metodu bitti.");
    }

    /**
     * Test of equals method, of class Cards.
     */
    @Test
    public void testEquals() {
        StudentCards studentCards3 = new StudentCards("1001");
        AcademicCards academicCards3 = new AcademicCards("5001");
        System.out.println("**********************************************************");

        System.out.println("Iki kart olusturdum");

        System.out.println("Ilkinin barkodu:    " + studentCards3.barkod);

        System.out.println("Ikincinin barkodu:  " + academicCards3.barkod);

        studentCards3.setID(3);
        academicCards3.setID(3);
        if (((Cards) studentCards3).equals((Cards) academicCards3)) {
            System.out.println("true");

        } else {
            System.out.println("false");
        }

    }

    /**
     * Test of hashCode method, of class Cards.
     */
    @Test
    public void testHashCode() {
        System.out.println("hashCode");

        Cards studentCards3 = new StudentCards("1001");

        int result = studentCards3.hashCode();

    }

    /**
     * Test of setID method, of class Cards.
     */
    @Test
    public void testSetID() {
        System.out.println("setID");
        Cards studentCards3 = new StudentCards("1001");
        studentCards3.setID(5);

    }

}
