/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HW04_131044028_Hazal_Gonen;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author hazal
 */
public class ExpressionsTest {

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
     * Test of convertInfixToPostfix method, of class Expressions.
     *
     * @throws java.lang.Exception
     */
    @Test
    public void testConvertInfixToPostfix() throws Exception {

        System.out.println("** convertInfixToPostfix Testi");

        Expressions e = new Expressions();

        System.out.println(" a = 4 + 7 nin postfix hali:");
        e.addLine("a = 4 + 7");
        e.execute();
        e.convertInfixToPostfix();

    }

    /**
     * Test of convertPostfixToAssembly method, of class Expressions.
     *
     * @throws java.lang.Exception
     */
    @Test
    public void testConvertPostfixToAssembly() throws Exception {

        System.out.println("** convertPostfixToAssembly Testi");

        Expressions e = new Expressions();

        System.out.println(" a = 8 nin postfix hali:");
        e.addLine("a = 8");
        e.execute();
        e.convertInfixToPostfix();
        System.out.println(" a = 8 nin assembly hali:");
        e.convertPostfixToAssembly();
    }

    /**
     * Test of addLine method, of class Expressions.
     */
    @Test
    public void testAddLine() {
        System.out.println("** addLine Testi");

        Expressions e = new Expressions();

        System.out.println(" a = 4 + 7 satiri eklendi");
        e.addLine("a = 4 + 7");

    }

    /**
     * Test of execute method, of class Expressions.
     *
     * @throws java.lang.Exception
     */
    @Test
    public void testExecute() throws Exception {
        System.out.println("** execute Testi");
  Expressions e = new Expressions();

        System.out.println(" a = 8 nin postfix hali:");
        e.addLine("a = 8");
        e.execute();
        System.out.println(" Execute edildi");
    }

}
