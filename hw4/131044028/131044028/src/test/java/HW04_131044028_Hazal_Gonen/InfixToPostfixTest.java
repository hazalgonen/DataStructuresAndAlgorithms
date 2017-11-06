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
public class InfixToPostfixTest {

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
     * infixi postfixe cevirir
     *
     * @throws java.lang.Exception
     */
    @Test
    public void testConvert() throws Exception {

        System.out.println("** convert Testi");
        System.out.println("a = 8 isleminin postfix hali: ");

        Expression infix = new Expression();

        infix.add(new Variable("a"));
        infix.add(new Operator("="));

        infix.add(new TemporaryVariable(8));

        InfixToPostfix instance = new InfixToPostfix();
        Expression result = instance.convert(infix);

        for (int i = 0; i < result.size(); ++i) {
            System.out.printf("%s ", result.getExpression(i));
        }
    }

}
