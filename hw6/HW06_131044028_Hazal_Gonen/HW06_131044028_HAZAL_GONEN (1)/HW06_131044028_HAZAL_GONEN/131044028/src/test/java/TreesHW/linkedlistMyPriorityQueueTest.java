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
public class linkedlistMyPriorityQueueTest {

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
        linkedlistMyPriorityQueue<Integer> linkedListMyPriorityQueue1 = new linkedlistMyPriorityQueue<>(comp);
        boolean result = linkedListMyPriorityQueue1.isEmpty();
        System.out.println("Yeni olusturdugum bir priorityqueuenun isEmpty metodu: " + result);
        for (int i = 0; i < 10; ++i) {

            linkedListMyPriorityQueue1.enqueue(i);
        }
        result = linkedListMyPriorityQueue1.isEmpty();
        System.out.println("10 eleman ekledikten sonra isEmpty metodu: " + result);

    }

    /**
     * kuyruktan eleman cikarir
     */
    @Test
    public void testDequeue() {
        System.out.println("dequeue");
        ComparePG comp = new ComparePG();
        linkedlistMyPriorityQueue<Integer> linkedListMyPriorityQueue1 = new linkedlistMyPriorityQueue<>(comp);
        System.out.println("0den 10a kadar olan priorityqueue olusturdum");
        for (int i = 0; i < 10; ++i) {

            linkedListMyPriorityQueue1.enqueue(i);
        }
        System.out.println("Silmeden once:");
        linkedListMyPriorityQueue1.print();
        System.out.println("dequeue yaptiktan sonra gelen eleman: ");
        System.out.println(linkedListMyPriorityQueue1.dequeue());

        System.out.println("Sildikten sonra:");
        linkedListMyPriorityQueue1.print();
    }

    /**
     * size bulur
     */
    @Test
    public void testSize() {
        System.out.println("size");
        ComparePG comp = new ComparePG();
        linkedlistMyPriorityQueue<Integer> linkedListMyPriorityQueue1 = new linkedlistMyPriorityQueue<>(comp);
        System.out.println("0den 10a kadar olan priorityqueue olusturdum");
        for (int i = 0; i < 10; ++i) {

            linkedListMyPriorityQueue1.enqueue(i);
        }

        int result = linkedListMyPriorityQueue1.size();
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
        linkedlistMyPriorityQueue<Integer> linkedListMyPriorityQueue1 = new linkedlistMyPriorityQueue<>(comp);
        System.out.println("0den 10a kadar olan priorityqueue olusturdum");
        for (int i = 0; i < 10; ++i) {

            linkedListMyPriorityQueue1.enqueue(i);
        }

        linkedListMyPriorityQueue1.print();
    }

}
