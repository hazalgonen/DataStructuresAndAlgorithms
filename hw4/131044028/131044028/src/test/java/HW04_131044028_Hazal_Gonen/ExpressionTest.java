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
public class ExpressionTest {

    @Before
    public void setUpClass() {
        System.out.println("\n\n Test metodu çağrılacak.\n");
    }

    @After
    public void tearDownClass() {
        System.out.println("\n Test metodu bitti.\n");
    }

    /**
     * Verilen satiri Expression tipine donusturur
     *
     * @throws java.lang.Exception
     */
    @Test
    public void testConvertExpression() throws Exception {
        System.out.println("** convertExpression Testi");
        String satir = "a = 5 + 7";
        Expression instance = new Expression();
        instance.convertExpression(satir);

        for (int i = 0; i < instance.size(); ++i) {
            System.out.printf("%s \n", instance.getExpression(i));

        }

    }

    /**
     * expressionun getter'ini yapar
     *
     * @throws java.lang.Exception
     */
    @Test
    public void testGetExpression() throws Exception {
        System.out.println("** getExpression Testi");
        int i = 0;
        String satir = "a = 5 + 7";

        System.out.println("a = 5 + 7  expressionunun 0. elemani :");
        Expression instance = new Expression();
        instance.convertExpression(satir);
        Expression result = instance.getExpression(i);
        System.out.printf("%s\n", result);
    }

    /**
     * yeni expression ekler
     *
     * @throws HW04_131044028_Hazal_Gonen.myException.MyInvalidOperator
     * @throws
     * HW04_131044028_Hazal_Gonen.myException.MyArrayIndexOutOfBoundsException
     */
    @Test
    public void testAdd() throws myException.MyInvalidOperator, myException.MyArrayIndexOutOfBoundsException {
        System.out.println("** add Testi");
        String satir = "a = 5 + 7";

        System.out.println("b = 9  expressionunu ekledim :");
        Expression instance = new Expression();
        instance.convertExpression(satir);

        Expression ex = new Expression();
        ex.convertExpression("b = 9");

        instance.add(ex);
    }

    /**
     * expressionun size'ini bulur
     *
     * @throws HW04_131044028_Hazal_Gonen.myException.MyInvalidOperator
     * @throws
     * HW04_131044028_Hazal_Gonen.myException.MyArrayIndexOutOfBoundsException
     */
    @Test
    public void testSize() throws myException.MyInvalidOperator, myException.MyArrayIndexOutOfBoundsException {
        System.out.println("** size Testi");
        int i = 0;
        String satir = "a = 5 + 7";

        System.out.println("a = 5 + 7  expressionunun size'i :");
        Expression instance = new Expression();
        instance.convertExpression(satir);

        int result = instance.size();
        System.out.println(result);
    }

    /**
     * Test of toString method, of class Expression.
     *
     * @throws HW04_131044028_Hazal_Gonen.myException.MyInvalidOperator
     * @throws
     * HW04_131044028_Hazal_Gonen.myException.MyArrayIndexOutOfBoundsException
     */
    @Test
    public void testToString() throws myException.MyInvalidOperator, myException.MyArrayIndexOutOfBoundsException {
        System.out.println("toString");
        String satir = "a = 5 + 7";

        Expression instance = new Expression();
        instance.convertExpression(satir);

    }

}
