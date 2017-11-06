/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TreesHW;

import java.io.BufferedReader;
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
public class BinaryTreeTest {

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
     * Test of getLeftSubtree method, of class BinaryTree.
     */
    @Test
    public void testGetLeftSubtree() {
        System.out.println("getLeftSubtree");

        System.out.println("BinaryTree olusturdum");
        BinaryTree<Integer> bt = new BinaryTree<>(1, new BinaryTree<>(2, new BinaryTree<>(4, null, null),
                new BinaryTree<Integer>(5, new BinaryTree<>(7, null, null), new BinaryTree<>(8, null, null))), new BinaryTree<Integer>(3, null, null));

        System.out.println(bt.toString());
        System.out.println("BinaryTreenin rootun sol alt agaci:");
        BinaryTree result = bt.getLeftSubtree();
        System.out.println(result.toString());
    }

    /**
     * sag alt agaci bulur
     */
    @Test
    public void testGetRightSubtree() {
        System.out.println("getRightSubtree");
        System.out.println("BinaryTree olusturdum");
        BinaryTree<Integer> bt = new BinaryTree<>(1, new BinaryTree<>(2, new BinaryTree<>(4, null, null),
                new BinaryTree<Integer>(5, new BinaryTree<>(7, null, null), new BinaryTree<>(8, null, null))), new BinaryTree<Integer>(3, null, null));

        System.out.println(bt.toString());
        System.out.println("BinaryTreenin rootun sag alt agaci:");
        BinaryTree result = bt.getRightSubtree();
        System.out.println(result.toString());
    }

    /**
     * elemani dondurur
     */
    @Test
    public void testGetData() {
        System.out.println("getData");

        System.out.println("BinaryTree olusturdum");
        BinaryTree<Integer> bt = new BinaryTree<>(1, new BinaryTree<>(2, new BinaryTree<>(4, null, null),
                new BinaryTree<Integer>(5, new BinaryTree<>(7, null, null), new BinaryTree<>(8, null, null))), new BinaryTree<Integer>(3, null, null));

        System.out.println(bt.toString());
        Object result = bt.getData();
        System.out.println("rootun data'si getdata metodu ile : " + result);
        assertEquals(1, result);

    }

    /**
     * kok mu diye bakar
     */
    @Test
    public void testIsLeaf() {
        System.out.println("isLeaf");
        System.out.println("BinaryTree olusturdum");
        BinaryTree<Integer> bt = new BinaryTree<>(1, new BinaryTree<>(2, new BinaryTree<>(4, null, null),
                new BinaryTree<Integer>(5, new BinaryTree<>(7, null, null), new BinaryTree<>(8, null, null))), new BinaryTree<Integer>(3, null, null));
        System.out.println(bt.toString());

        boolean result = bt.isLeaf();

        System.out.println("root leaf mi :" + result);

        BinaryTree rgbt = bt.getRightSubtree();
        result = rgbt.isLeaf();
        System.out.println("rootun rightsubtree'si leaf mi : " + result);
    }

    /**
     * toString metodu
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        System.out.println("BinaryTree olusturdum");
        BinaryTree<Integer> bt = new BinaryTree<>(1, new BinaryTree<>(2, new BinaryTree<>(4, null, null),
                new BinaryTree<Integer>(5, new BinaryTree<>(7, null, null), new BinaryTree<>(8, null, null))), new BinaryTree<Integer>(3, null, null));
        System.out.println(bt.toString());

    }

}
