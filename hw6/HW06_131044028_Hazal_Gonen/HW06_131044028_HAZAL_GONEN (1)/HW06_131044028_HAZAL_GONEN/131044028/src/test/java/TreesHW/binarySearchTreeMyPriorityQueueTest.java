/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TreesHW;

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
public class binarySearchTreeMyPriorityQueueTest {

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
     * Test of isEmpty method, of class binarySearchTreeMyPriorityQueue.
     */
    @Test
    public void testIsEmpty() {
        System.out.println("isEmpty");
        ComparePG comp = new ComparePG();
        binarySearchTreeMyPriorityQueue<Integer> binarySearchMyPriorityQueue1 = new binarySearchTreeMyPriorityQueue<>(comp);
        boolean result = binarySearchMyPriorityQueue1.isEmpty();
        System.out.println("Yeni olusturdugum bir priorityqueuenun isEmpty metodu: " + result);
        for (int i = 0; i < 10; ++i) {

            binarySearchMyPriorityQueue1.enqueue(i);
        }
        result = binarySearchMyPriorityQueue1.isEmpty();
        System.out.println("10 eleman ekledikten sonra isEmpty metodu: " + result);

    }

    /**
     * kuyruktan eleman cikarir
     */
    @Test
    public void testDequeue() {
        System.out.println("dequeue");
        ComparePG comp = new ComparePG();
        binarySearchTreeMyPriorityQueue<Integer> binarySearchMyPriorityQueue1 = new binarySearchTreeMyPriorityQueue<>(comp);
        System.out.println("0den 10a kadar olan priorityqueue olusturdum");
        for (int i = 0; i < 10; ++i) {

            binarySearchMyPriorityQueue1.enqueue(i);
        }
        System.out.println("Silmeden once:");
        binarySearchMyPriorityQueue1.print();
        System.out.println("dequeue yaptiktan sonra gelen eleman: ");
        System.out.println(binarySearchMyPriorityQueue1.dequeue());

        System.out.println("Sildikten sonra:");
        binarySearchMyPriorityQueue1.print();
    }

    /**
     * size bulur
     */
    @Test
    public void testSize() {
        System.out.println("size");
        ComparePG comp = new ComparePG();
        binarySearchTreeMyPriorityQueue<Integer> binarySearchMyPriorityQueue2 = new binarySearchTreeMyPriorityQueue<>(comp);
        System.out.println("0den 10a kadar olan priorityqueue olusturdum");
        for (int i = 0; i < 10; ++i) {

            binarySearchMyPriorityQueue2.enqueue(i);
        }

        int result = binarySearchMyPriorityQueue2.size();
        System.out.println("size() metodu: " + result);
        assertEquals(10, result);

    }

    /**
     * Test of enqueue method, of class arraylistMyPriorityQueue.
     */
    @Test
    public void testEnqueue() {
        System.out.println("enqueue");
        ComparePG comp = new ComparePG();
        binarySearchTreeMyPriorityQueue<Integer> binarySearchMyPriorityQueue1 = new binarySearchTreeMyPriorityQueue<>(comp);
        System.out.println("0den 10a kadar olan priorityqueue olusturdum");
        for (int i = 0; i < 10; ++i) {

            binarySearchMyPriorityQueue1.enqueue(i);
        }
    
       binarySearchMyPriorityQueue1.print();
    }

}
