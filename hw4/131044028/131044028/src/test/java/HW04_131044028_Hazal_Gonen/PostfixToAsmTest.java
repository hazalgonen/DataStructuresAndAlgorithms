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
public class PostfixToAsmTest {

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
     * postfixi asseöblye cevirir
     * @throws java.lang.Exception
     */
    @Test
    public void testConvert() throws Exception {
        System.out.println("** convert Testi **");
        Expression postfix = new Expression();

        postfix.add(new Variable("a"));
        postfix.add(new TemporaryVariable(4));

        postfix.add(new Operator("="));

        System.out.println(postfix.toString());
        PostfixToAsm instance = new PostfixToAsm();

        instance.convert(postfix);
    }

}
