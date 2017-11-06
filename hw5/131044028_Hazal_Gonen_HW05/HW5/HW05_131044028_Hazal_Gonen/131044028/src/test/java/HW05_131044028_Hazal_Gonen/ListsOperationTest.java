/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HW05_131044028_Hazal_Gonen;

import java.util.ArrayList;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;

import org.junit.Before;
import org.junit.BeforeClass;

import org.junit.Test;


/**
 *
 * @author hazal
 */
public class ListsOperationTest {



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
     * Test of intersectionOfLists method, of class ListsOperation.
     */
    @Test
    public void testIntersectionOfLists() {
        System.out.println("\n** intersectionOfLists metodu testi **");
        System.out.println("Bu testte 3 ornek var");
        System.out.println("------------------------");
        System.out.println("Ilk ornek icin liste:");

        List<Integer> list1 = new ArrayList();
        List<Integer> list2 = new ArrayList();
        List<Integer> result = new ArrayList();

        list1.add(3);
        list1.add(5);
        list1.add(7);
        list1.add(9);

        list2.add(3);
        list2.add(4);
        list2.add(5);
        list2.add(6);

        System.out.println("Ilk liste: ");
        System.out.println(list1);
        System.out.println("Ikinci liste: ");
        System.out.println(list2);

        ListsOperation operation = new ListsOperation(list1, list2);
        result = operation.intersectionOfLists();
        System.out.println("Kesisimleri: ");
        System.out.println(result);

        System.out.println("------------------------");
        System.out.println("Ikinci ornek icin liste:");
        List<String> list1_s = new ArrayList();
        List<String> list2_s = new ArrayList();
        List<String> result_s = new ArrayList();

        list2_s.add("x");
        list2_s.add("y");
        list2_s.add("z");
        list1_s.add("x");
        System.out.println("Ilk liste: ");
        System.out.println(list1_s);
        System.out.println("Ikinci liste: ");
        System.out.println(list2_s);
        ListsOperation operation1 = new ListsOperation(list1_s, list2_s);
        result_s = operation1.intersectionOfLists();
        System.out.println("Kesisimleri: ");
        System.out.println(result_s);

        System.out.println("------------------------");
        System.out.println("Ucuncu ornek icin liste:");
        List<Integer> list1_i = new ArrayList();
        List<Integer> list2_i = new ArrayList();
        List<Integer> result_i = new ArrayList();
        list2_i.add(1);
        list2_i.add(2);
        list2_i.add(3);
        list1_i.add(4);
        System.out.println("Ilk liste: ");
        System.out.println(list1_i);
        System.out.println("Ikinci liste: ");
        System.out.println(list2_i);
        ListsOperation operation2 = new ListsOperation(list1_i, list2_i);
        result_i = operation2.intersectionOfLists();
        System.out.println("Kesisimleri: ");
        System.out.println(result_i);

    }

    /**
     * Test of unionOfLists method, of class ListsOperation.
     */
    @Test
    public void testUnionOfLists() {
        System.out.println("\n** unionOfLists metodu testi **");
        System.out.println("Bu testte 3 ornek var");
        System.out.println("------------------------");
        System.out.println("Ilk ornek icin liste:");

        List list1 = new ArrayList();
        List list2 = new ArrayList();
        List result = new ArrayList();

        list1.add(3);
        list1.add(5);
        list1.add(7);
        list1.add(9);

        list2.add(3);
        list2.add(4);
        list2.add(5);
        list2.add(6);

        System.out.println("Ilk liste: ");
        System.out.println(list1);
        System.out.println("Ikinci liste: ");
        System.out.println(list2);

        ListsOperation operation = new ListsOperation(list1, list2);
        result = operation.unionOfLists();
        System.out.println("Birlesimleri: ");
        System.out.println(result);

        System.out.println("------------------------");
        System.out.println("Ikinci ornek icin liste:");
        list1.clear();
        list2.clear();
        result.clear();
        list2.add("x");
        list2.add("y");
        list2.add("z");
        list1.add("x");

        System.out.println("Ilk liste: ");
        System.out.println(list1);
        System.out.println("Ikinci liste: ");
        System.out.println(list2);
        ListsOperation operation1 = new ListsOperation(list1, list2);
        result = operation1.unionOfLists();
        System.out.println("Birlesimleri: ");
        System.out.println(result);

        System.out.println("------------------------");
        System.out.println("Ucuncu ornek icin liste:");
        list1.clear();
        list2.clear();
        result.clear();
        list2.add("1");
        list2.add("2");
        list2.add("3");
        list1.add("4");
        System.out.println("Ilk liste: ");
        System.out.println(list1);
        System.out.println("Ikinci liste: ");
        System.out.println(list2);
        ListsOperation operation2 = new ListsOperation(list1, list2);
        result = operation2.unionOfLists();
        System.out.println("Birlesimleri: ");
        System.out.println(result);

    }

    /**
     * Altkumesi mi ona bakilir
     */
    @Test
    public void testIsSubset() {
        System.out.println("\n** isSubset metodu testi **");
        System.out.println("Bu testte 3 ornek var");
        System.out.println("------------------------");
        System.out.println("Ilk ornek icin liste:");

        List list1 = new ArrayList();
        List list2 = new ArrayList();
        boolean result;

        list1.add(3);
        list1.add(5);
        list1.add(7);
        list1.add(9);

        list2.add(3);
        list2.add(4);
        list2.add(5);
        list2.add(6);

        System.out.println("Ilk liste: ");
        System.out.println(list1);
        System.out.println("Ikinci liste: ");
        System.out.println(list2);

        ListsOperation operation = new ListsOperation(list1, list2);
        result = operation.isSubset();

        System.out.println("IsSubset ? : " + result);

        System.out.println("------------------------");
        System.out.println("Ikinci ornek icin liste:");
        list1.clear();
        list2.clear();
        list1.add("x");
        list1.add("y");
        list1.add("z");
        list2.add("x");

        System.out.println("Ilk liste: ");
        System.out.println(list1);
        System.out.println("Ikinci liste: ");
        System.out.println(list2);
        ListsOperation operation1 = new ListsOperation(list1, list2);
        result = operation1.isSubset();

        System.out.println("IsSubset ? : " + result);

        System.out.println("------------------------");
        System.out.println("Ucuncu ornek icin liste:");
        list1.clear();
        list2.clear();
        list2.add("1");
        list2.add("2");
        list2.add("3");
        list1.add("4");
        System.out.println("Ilk liste: ");
        System.out.println(list1);
        System.out.println("Ikinci liste: ");
        System.out.println(list2);
        ListsOperation operation2 = new ListsOperation(list1, list2);
        result = operation2.isSubset();

        System.out.println("IsSubset ? : " + result);

    }

}
