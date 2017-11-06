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
public class unsortedVectorMyPriorityQueueTest {

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
     * bos mu dolu mu
     */
    @Test
    public void testIsEmpty() {
        System.out.println("isEmpty");

        ComparePG comp = new ComparePG();
        unsortedVectorMyPriorityQueue<Integer> unsortedVectorMyPriorityQueue1 = new unsortedVectorMyPriorityQueue<>(comp);
        boolean result = unsortedVectorMyPriorityQueue1.isEmpty();
        System.out.println("Yeni olusturdugum bir priorityqueuenun isEmpty metodu: " + result);
        for (int i = 0; i < 10; ++i) {

            unsortedVectorMyPriorityQueue1.enqueue(i);
        }
        result = unsortedVectorMyPriorityQueue1.isEmpty();
        System.out.println("10 eleman ekledikten sonra isEmpty metodu: " + result);

    }

    /**
     * kuyruktan eleman cikarir
     */
    @Test
    public void testDequeue() {
        System.out.println("dequeue");
        ComparePG comp = new ComparePG();
        unsortedVectorMyPriorityQueue<Integer> unsortedVectorMyPriorityQueue1 = new unsortedVectorMyPriorityQueue<>(comp);
        System.out.println("0den 10a kadar olan priorityqueue olusturdum");
        for (int i = 0; i < 10; ++i) {

            unsortedVectorMyPriorityQueue1.enqueue(i);
        }
        System.out.println("Silmeden once:");
        unsortedVectorMyPriorityQueue1.print();
        System.out.println("dequeue yaptiktan sonra gelen eleman: ");
        System.out.println(unsortedVectorMyPriorityQueue1.dequeue());

        System.out.println("Sildikten sonra:");
        unsortedVectorMyPriorityQueue1.print();
    }

    /**
     * size bulur
     */
    @Test
    public void testSize() {
        System.out.println("size");
        ComparePG comp = new ComparePG();
        unsortedVectorMyPriorityQueue<Integer> unsortedVectorMyPriorityQueue1 = new unsortedVectorMyPriorityQueue<>(comp);
        System.out.println("0den 10a kadar olan priorityqueue olusturdum");
        for (int i = 0; i < 10; ++i) {

            unsortedVectorMyPriorityQueue1.enqueue(i);
        }

        int result = unsortedVectorMyPriorityQueue1.size();
        System.out.println("size() metodu: " + result);
        assertEquals(10, result);

    }

    /**
     * eleman ekler
     */
    @Test
    public void testEnqueue() {
        System.out.println("enqueue");
        ComparePG comp = new ComparePG();
        unsortedVectorMyPriorityQueue<Integer> unsortedVectorMyPriorityQueue1 = new unsortedVectorMyPriorityQueue<>(comp);
        System.out.println("0den 10a kadar olan priorityqueue olusturdum");
        for (int i = 0; i < 10; ++i) {

            unsortedVectorMyPriorityQueue1.enqueue(i);
        }

        unsortedVectorMyPriorityQueue1.print();
    }

}
