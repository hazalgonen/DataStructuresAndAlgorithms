/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TreesHW;

import java.util.Iterator;
import static org.junit.Assert.*;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 *
 * @author hazal
 */
public class BinarySearchTreeTest {

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
     * Iteretor metodunu test ettim
     */
    @Test
    public void testIterator() {
        System.out.println("iterator testi");

        BinarySearchTree<Integer> Btree = new BinarySearchTree<>();
        Btree.add(2);
        Btree.add(1);
        Btree.add(12);
        Btree.add(20);
        Btree.add(11);
        Btree.add(0);

        Iterator result = Btree.iterator();
        System.out.println("iterator ile binarySearchTreeyi ekrana bastim");
        while (result.hasNext()) {
            System.out.println(result.next());

        }
    }

    /**
     * aranan deger bulunur yoksa null doner
     */
    @Test
    public void testFind() {
        System.out.println("find testi");
        BinarySearchTree<Integer> Btree = new BinarySearchTree<>();
        Btree.add(2);
        Btree.add(1);
        Btree.add(12);
        Btree.add(20);
        Btree.add(11);
        Btree.add(0);
        Iterator result = Btree.iterator();
        System.out.println("iterator ile binarySearchTreeyi ekrana bastim");
        while (result.hasNext()) {
            System.out.println(result.next());

        }

        System.out.println("2 degerini find metodunu gonderdim");
        System.out.println(Btree.find(2));

        System.out.println("13 degerini find metodunu gonderdim");
        System.out.println(Btree.find(13));

    }

    /**
     * ekleme metodu
     */
    @Test
    public void testAdd() {
        System.out.println("add");
        BinarySearchTree<Integer> Btree = new BinarySearchTree<>();

        System.out.println("BinarySearchTree olusturdum sirasiyla 2,1,12 ekledim");
        Btree.add(2);
        Btree.add(1);
        Btree.add(12);
        Iterator result = Btree.iterator();
        System.out.println("iterator ile binarySearchTreeyi ekrana bastim");
        while (result.hasNext()) {
            System.out.println(result.next());

        }

        System.out.println("Daha buyuk bir BinarySearchTree olusturdum");
        BinarySearchTree<Integer> Btree1 = new BinarySearchTree<>();
        Btree1.add(2);
        Btree1.add(1);
        Btree1.add(12);
        Btree1.add(20);
        Btree1.add(11);
        Btree1.add(0);
        Iterator result1 = Btree1.iterator();
        System.out.println("iterator ile binarySearchTreeyi ekrana bastim");
        while (result1.hasNext()) {
            System.out.println(result1.next());

        }
    }

    /**
     * silme metodu
     */
    @Test
    public void testDelete() {
        System.out.println("delete");

        BinarySearchTree<Integer> Btree = new BinarySearchTree<>();

        System.out.println("BinarySearchTree olusturdum sirasiyla 2,1,12 ekledim");
        Btree.add(2);
        Btree.add(1);
        Btree.add(12);
        Iterator result = Btree.iterator();
        System.out.println("iterator ile binarySearchTreeyi ekrana bastim");
        while (result.hasNext()) {
            System.out.println(result.next());

        }
        System.out.println("2 degerini sildim");
        Object expResult = 2;
        Object result1 = Btree.delete(2);

        Iterator result2 = Btree.iterator();
        System.out.println("iterator ile binarySearchTreeyi ekrana bastim");
        while (result2.hasNext()) {
            System.out.println(result2.next());

        }
        assertEquals(expResult, result1);
    }
}
