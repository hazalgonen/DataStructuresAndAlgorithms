/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TreesHW;

import java.util.Random;

/**
 *
 * @author hazal
 */
public class Driver {

    /**
     *
     * @param args
     */
    public static void main(String[] args) {

        ComparePG comp = new ComparePG();
        Random randomnum = new Random();

        /*   System.out.println("**********************************************");
         System.out.println("ArrayList Test:");
         System.out.println("**********************************************");
         arraylistMyPriorityQueue<Integer> arraylistMyPriorityQueue1 = new arraylistMyPriorityQueue<>(comp);

         System.out.println("Veri boyutu :1");
         long start = System.nanoTime();
         for (int i = 0; i < 1; ++i) {
         int a = randomnum.nextInt(1000);
         arraylistMyPriorityQueue1.enqueue(a);
         }
         Long end = System.nanoTime();
         Long result = end - start;
         System.out.println("Enqueue calisma suresi: " + result + " nanosaniye");

         start = System.nanoTime();
         for (int i = 0; i < 1; ++i) {
         arraylistMyPriorityQueue1.dequeue();
         }
         end = System.nanoTime();
         result = end - start;
         System.out.println("Dequeue calisma suresi: " + result + " nanosaniye");

         arraylistMyPriorityQueue<Integer> arraylistMyPriorityQueue2 = new arraylistMyPriorityQueue<>(comp);
         System.out.println("Veri boyutu :10");
         start = System.nanoTime();

         for (int i = 0; i < 10; ++i) {
         int a = randomnum.nextInt(1000);
         arraylistMyPriorityQueue2.enqueue(a);
         }
         end = System.nanoTime();
         result = end - start;

         System.out.println("Enqueue calisma suresi: " + result + " nanosaniye");

         start = System.nanoTime();
         for (int i = 0; i < 10; ++i) {
         arraylistMyPriorityQueue2.dequeue();
         }
         end = System.nanoTime();
         result = end - start;
         System.out.println("Dequeue calisma suresi: " + result + " nanosaniye");

         arraylistMyPriorityQueue<Integer> arraylistMyPriorityQueue3 = new arraylistMyPriorityQueue<>(comp);

         System.out.println("Veri boyutu :100");
         start = System.nanoTime();

         for (int i = 0; i < 100; ++i) {
         int a = randomnum.nextInt(1000);
         arraylistMyPriorityQueue3.enqueue(a);
         }
         end = System.nanoTime();
         result = end - start;

         System.out.println("Enqueue calisma suresi: " + result + " nanosaniye");

         start = System.nanoTime();
         for (int i = 0; i < 100; ++i) {
         arraylistMyPriorityQueue3.dequeue();
         }
         end = System.nanoTime();
         result = end - start;
         System.out.println("Dequeue calisma suresi: " + result + " nanosaniye");

         priorityQueue<Integer> arraylistMyPriorityQueue4 = new arraylistMyPriorityQueue<>(comp);

         System.out.println("Veri boyutu :1000");
         start = System.currentTimeMillis();

         for (int i = 0; i < 1000; ++i) {
         int a = randomnum.nextInt(10000);
         arraylistMyPriorityQueue4.enqueue(a);
         }
         end = System.currentTimeMillis();
         result = end - start;

         System.out.println("Enqueue calisma suresi: " + result + " nanosaniye");

         start = System.currentTimeMillis();
         for (int i = 0; i < 1000; ++i) {
         arraylistMyPriorityQueue4.dequeue();
         }
         end = System.currentTimeMillis();
         result = end - start;
         System.out.println("Dequeue calisma suresi: " + result + " nanosaniye");

         priorityQueue<Integer> arraylistMyPriorityQueue5 = new arraylistMyPriorityQueue<>(comp);

         System.out.println("Veri boyutu :10000");
         start = System.currentTimeMillis();

         for (int i = 0; i < 10000; ++i) {
         int a = randomnum.nextInt(100000);
         arraylistMyPriorityQueue5.enqueue(a);
         }
         end = System.currentTimeMillis();
         result = end - start;

         System.out.println("Enqueue calisma suresi: " + result + " nanosaniye");

         start = System.currentTimeMillis();
         for (int i = 0; i < 10000; ++i) {
         arraylistMyPriorityQueue5.dequeue();
         }
         end = System.currentTimeMillis();
         result = end - start;
         System.out.println("Dequeue calisma suresi: " + result + " nanosaniye");

         priorityQueue<Integer> arraylistMyPriorityQueue6 = new arraylistMyPriorityQueue<>(comp);

         System.out.println("Veri boyutu :100000");
         start = System.currentTimeMillis();

         for (int i = 0; i < 100000; ++i) {
         int a = randomnum.nextInt(1000000);
         arraylistMyPriorityQueue6.enqueue(a);
         }
         end = System.currentTimeMillis();
         result = end - start;

         System.out.println("Enqueue calisma suresi: " + result + " nanosaniye");

         start = System.currentTimeMillis();
         for (int i = 0; i < 100000; ++i) {
         arraylistMyPriorityQueue6.dequeue();
         }
         end = System.currentTimeMillis();
         result = end - start;
         System.out.println("Dequeue calisma suresi: " + result + " nanosaniye");

         priorityQueue<Integer> arraylistMyPriorityQueue7 = new arraylistMyPriorityQueue<>(comp);

         System.out.println("Veri boyutu :1000000");
         start = System.currentTimeMillis();

         for (int i = 0; i < 1000000; ++i) {
         int a = randomnum.nextInt(10000000);
         arraylistMyPriorityQueue7.enqueue(a);
         }
         end = System.currentTimeMillis();
         result = end - start;
         System.out.println("Enqueue calisma suresi: " + result + " nanosaniye");

         start = System.currentTimeMillis();
         for (int i = 0; i < 1000000; ++i) {
         arraylistMyPriorityQueue7.dequeue();
         }
         end = System.currentTimeMillis();
         result = end - start;
         System.out.println("Dequeue calisma suresi: " + result + " nanosaniye");
         /*
         System.out.println("**********************************************");
         System.out.println("LinkedList Test:");
         System.out.println("**********************************************");
         linkedlistMyPriorityQueue<Integer> linkedlistMyPriorityQueue1 = new linkedlistMyPriorityQueue<>(comp);

         System.out.println("Veri boyutu :1");
         start = System.nanoTime();
         for (int i = 0; i < 1; ++i) {
         int a = randomnum.nextInt(1000);
         linkedlistMyPriorityQueue1.enqueue(a);
         }
         end = System.nanoTime();
         result = end - start;
         System.out.println("Enqueue calisma suresi: " + result + " nanosaniye");

         start = System.nanoTime();
         for (int i = 0; i < 1; ++i) {
         linkedlistMyPriorityQueue1.dequeue();
         }
         end = System.nanoTime();
         result = end - start;
         System.out.println("Dequeue calisma suresi: " + result + " nanosaniye");

         linkedlistMyPriorityQueue<Integer> linkedlistMyPriorityQueue2 = new linkedlistMyPriorityQueue<>(comp);
         System.out.println("Veri boyutu :10");
         start = System.nanoTime();

         for (int i = 0; i < 10; ++i) {
         int a = randomnum.nextInt(1000);
         linkedlistMyPriorityQueue2.enqueue(a);
         }
         end = System.nanoTime();
         result = end - start;

         System.out.println("Enqueue calisma suresi: " + result + " nanosaniye");

         start = System.nanoTime();
         for (int i = 0; i < 10; ++i) {
         linkedlistMyPriorityQueue2.dequeue();
         }
         end = System.nanoTime();
         result = end - start;
         System.out.println("Dequeue calisma suresi: " + result + " nanosaniye");

         linkedlistMyPriorityQueue<Integer> linkedlistMyPriorityQueue3 = new linkedlistMyPriorityQueue<>(comp);

         System.out.println("Veri boyutu :100");
         start = System.nanoTime();

         for (int i = 0; i < 100; ++i) {
         int a = randomnum.nextInt(1000);
         linkedlistMyPriorityQueue3.enqueue(a);
         }
         end = System.nanoTime();
         result = end - start;

         System.out.println("Enqueue calisma suresi: " + result + " nanosaniye");

         start = System.nanoTime();
         for (int i = 0; i < 100; ++i) {
         linkedlistMyPriorityQueue3.dequeue();
         }
         end = System.nanoTime();
         result = end - start;
         System.out.println("Dequeue calisma suresi: " + result + " nanosaniye");

         /*linkedlistMyPriorityQueue<Integer> linkedlistMyPriorityQueue4 = new linkedlistMyPriorityQueue<>(comp);

         System.out.println("Veri boyutu :1000");
         start = System.currentTimeMillis();

         for (int i = 0; i < 1000; ++i) {
         int a = randomnum.nextInt(10000);
         linkedlistMyPriorityQueue4.enqueue(a);
         }
         end = System.currentTimeMillis();
         result = end - start;

         System.out.println("Enqueue calisma suresi: " + result + " nanosaniye");

         start = System.currentTimeMillis();
         for (int i = 0; i < 1000; ++i) {
         linkedlistMyPriorityQueue4.dequeue();
         }
         end = System.currentTimeMillis();
         result = end - start;
         System.out.println("Dequeue calisma suresi: " + result + " nanosaniye");

         linkedlistMyPriorityQueue<Integer> linkedlistMyPriorityQueue5 = new linkedlistMyPriorityQueue<>(comp);

         System.out.println("Veri boyutu :10000");
         start = System.currentTimeMillis();

         for (int i = 0; i < 10000; ++i) {
         int a = randomnum.nextInt(100000);
         linkedlistMyPriorityQueue5.enqueue(a);
         }
         end = System.currentTimeMillis();
         result = end - start;

         System.out.println("Enqueue calisma suresi: " + result + " nanosaniye");

         start = System.currentTimeMillis();
         for (int i = 0; i < 10000; ++i) {
         linkedlistMyPriorityQueue5.dequeue();
         }
         end = System.currentTimeMillis();
         result = end - start;
         System.out.println("Dequeue calisma suresi: " + result + " nanosaniye");

         linkedlistMyPriorityQueue<Integer> linkedlistMyPriorityQueue6 = new linkedlistMyPriorityQueue<>(comp);

         System.out.println("Veri boyutu :100000");
         start = System.currentTimeMillis();

         for (int i = 0; i < 100000; ++i) {
         int a = randomnum.nextInt(1000000);
         linkedlistMyPriorityQueue6.enqueue(a);
         }
         end = System.currentTimeMillis();
         result = end - start;

         System.out.println("Enqueue calisma suresi: " + result + " nanosaniye");

         start = System.currentTimeMillis();
         for (int i = 0; i < 100000; ++i) {
         linkedlistMyPriorityQueue6.dequeue();
         }
         end = System.currentTimeMillis();
         result = end - start;
         System.out.println("Dequeue calisma suresi: " + result + " nanosaniye");

         linkedlistMyPriorityQueue<Integer> linkedlistMyPriorityQueue7 = new linkedlistMyPriorityQueue<>(comp);

         System.out.println("Veri boyutu :1000000");
         start = System.currentTimeMillis();

         for (int i = 0; i < 1000000; ++i) {
         int a = randomnum.nextInt(10000000);
         linkedlistMyPriorityQueue7.enqueue(a);
         }
         end = System.currentTimeMillis();
         result = end - start;
         System.out.println("Enqueue calisma suresi: " + result + " nanosaniye");

         start = System.currentTimeMillis();
         for (int i = 0; i < 1000000; ++i) {
         linkedlistMyPriorityQueue7.dequeue();
         }
         end = System.currentTimeMillis();
         result = end - start;
         System.out.println("Dequeue calisma suresi: " + result + " nanosaniye");

         */
        /*      System.out.println("**********************************************");
         System.out.println("UnsortedVector Test:");
         System.out.println("**********************************************");
         unsortedVectorMyPriorityQueue<Integer> unsortedVectorMyPriorityQueue1 = new unsortedVectorMyPriorityQueue<>(comp);

         System.out.println("Veri boyutu :1");
         start = System.nanoTime();
         for (int i = 0; i < 1; ++i) {
         int a = randomnum.nextInt(1000);
         unsortedVectorMyPriorityQueue1.enqueue(a);
         }
         end = System.nanoTime();
         result = end - start;
         System.out.println("Enqueue calisma suresi: " + result + " nanosaniye");

         start = System.nanoTime();
         for (int i = 0; i < 1; ++i) {
         unsortedVectorMyPriorityQueue1.dequeue();
         }
         end = System.nanoTime();
         result = end - start;
         System.out.println("Dequeue calisma suresi: " + result + " nanosaniye");

         unsortedVectorMyPriorityQueue<Integer> unsortedVectorMyPriorityQueue2 = new unsortedVectorMyPriorityQueue<>(comp);
         System.out.println("Veri boyutu :10");
         start = System.nanoTime();

         for (int i = 0; i < 10; ++i) {
         int a = randomnum.nextInt(1000);
         unsortedVectorMyPriorityQueue2.enqueue(a);
         }
         end = System.nanoTime();
         result = end - start;

         System.out.println("Enqueue calisma suresi: " + result + " nanosaniye");

         start = System.nanoTime();
         for (int i = 0; i < 10; ++i) {
         unsortedVectorMyPriorityQueue2.dequeue();
         }
         end = System.nanoTime();
         result = end - start;
         System.out.println("Dequeue calisma suresi: " + result + " nanosaniye");

         unsortedVectorMyPriorityQueue<Integer> unsortedVectorMyPriorityQueue3 = new unsortedVectorMyPriorityQueue<>(comp);

         System.out.println("Veri boyutu :100");
         start = System.nanoTime();

         for (int i = 0; i < 100; ++i) {
         int a = randomnum.nextInt(1000);
         unsortedVectorMyPriorityQueue3.enqueue(a);
         }
         end = System.nanoTime();
         result = end - start;

         System.out.println("Enqueue calisma suresi: " + result + " nanosaniye");

         start = System.nanoTime();
         for (int i = 0; i < 100; ++i) {
         unsortedVectorMyPriorityQueue3.dequeue();
         }
         end = System.nanoTime();
         result = end - start;
         System.out.println("Dequeue calisma suresi: " + result + " nanosaniye");

         /*unsortedVectorMyPriorityQueue<Integer> unsortedVectorMyPriorityQueue4 = new unsortedVectorMyPriorityQueue<>(comp);
        
         System.out.println("Veri boyutu :1000");
         start = System.currentTimeMillis();

         for (int i = 0; i < 1000; ++i) {
         int a = randomnum.nextInt(10000);
         unsortedVectorMyPriorityQueue4.enqueue(a);
         }
         end = System.currentTimeMillis();
         result = end - start;

         System.out.println("Enqueue calisma suresi: " + result + " nanosaniye");

         start = System.currentTimeMillis();
         for (int i = 0; i < 1000; ++i) {
         unsortedVectorMyPriorityQueue4.dequeue();
         }
         end = System.currentTimeMillis();
         result = end - start;
         System.out.println("Dequeue calisma suresi: " + result + " nanosaniye");

         unsortedVectorMyPriorityQueue<Integer> unsortedVectorMyPriorityQueue5 = new unsortedVectorMyPriorityQueue<>(comp);

         System.out.println("Veri boyutu :10000");
         start = System.currentTimeMillis();

         for (int i = 0; i < 10000; ++i) {
         int a = randomnum.nextInt(100000);
         unsortedVectorMyPriorityQueue5.enqueue(a);
         }
         end = System.currentTimeMillis();
         result = end - start;

         System.out.println("Enqueue calisma suresi: " + result + " nanosaniye");

         start = System.currentTimeMillis();
         for (int i = 0; i < 10000; ++i) {
         unsortedVectorMyPriorityQueue5.dequeue();
         }
         end = System.currentTimeMillis();
         result = end - start;
         System.out.println("Dequeue calisma suresi: " + result + " nanosaniye");

         unsortedVectorMyPriorityQueue<Integer> unsortedVectorMyPriorityQueue6 = new unsortedVectorMyPriorityQueue<>(comp);

         System.out.println("Veri boyutu :100000");
         start = System.currentTimeMillis();

         for (int i = 0; i < 100000; ++i) {
         int a = randomnum.nextInt(1000000);
         unsortedVectorMyPriorityQueue6.enqueue(a);
         }
         end = System.currentTimeMillis();
         result = end - start;

         System.out.println("Enqueue calisma suresi: " + result + " nanosaniye");

         start = System.currentTimeMillis();
         for (int i = 0; i < 100000; ++i) {
         unsortedVectorMyPriorityQueue6.dequeue();
         }
         end = System.currentTimeMillis();
         result = end - start;
         System.out.println("Dequeue calisma suresi: " + result + " nanosaniye");

         unsortedVectorMyPriorityQueue<Integer> unsortedVectorMyPriorityQueue7 = new unsortedVectorMyPriorityQueue<>(comp);

         System.out.println("Veri boyutu :1000000");
         start = System.currentTimeMillis();

         for (int i = 0; i < 1000000; ++i) {
         int a = randomnum.nextInt(10000000);
         unsortedVectorMyPriorityQueue7.enqueue(a);
         }
         end = System.currentTimeMillis();
         result = end - start;
         System.out.println("Enqueue calisma suresi: " + result + " nanosaniye");

         start = System.currentTimeMillis();
         for (int i = 0; i < 1000000; ++i) {
         unsortedVectorMyPriorityQueue7.dequeue();
         }
         end = System.currentTimeMillis();
         result = end - start;
         System.out.println("Dequeue calisma suresi: " + result + " nanosaniye");
         */
        System.out.println("**********************************************");
        System.out.println("BinarySearchTree Test:");
        System.out.println("**********************************************");

        binarySearchTreeMyPriorityQueue<Integer> binarySearchTreeMyPriorityQueue1 = new binarySearchTreeMyPriorityQueue<>(comp);
        System.out.println("Veri boyutu :1");
        Long start = System.nanoTime();

        for (int i = 0; i < 1; ++i) {
            int a = randomnum.nextInt(1000);
            binarySearchTreeMyPriorityQueue1.enqueue(a);
        }
        Long end = System.nanoTime();
        Long result = end - start;

        System.out.println("Enqueue calisma suresi: " + result + " nanosaniye");

        start = System.nanoTime();
        for (int i = 0; i < 1; ++i) {
            binarySearchTreeMyPriorityQueue1.dequeue();
        }
        end = System.nanoTime();
        result = end - start;
        System.out.println("Dequeue calisma suresi: " + result + " nanosaniye");
        binarySearchTreeMyPriorityQueue<Integer> binarySearchTreeMyPriorityQueue2 = new binarySearchTreeMyPriorityQueue<>(comp);
        System.out.println("Veri boyutu :10");
        start = System.nanoTime();

        for (int i = 0; i < 10; ++i) {
            int a = randomnum.nextInt(1000);
            binarySearchTreeMyPriorityQueue2.enqueue(a);
        }
        end = System.nanoTime();
        result = end - start;

        System.out.println("Enqueue calisma suresi: " + result + " nanosaniye");

        start = System.nanoTime();
        for (int i = 0; i < 10; ++i) {
            binarySearchTreeMyPriorityQueue2.dequeue();
        }
        end = System.nanoTime();
        result = end - start;
        System.out.println("Dequeue calisma suresi: " + result + " nanosaniye");
        binarySearchTreeMyPriorityQueue<Integer> binarySearchTreeMyPriorityQueue3 = new binarySearchTreeMyPriorityQueue<>(comp);
        System.out.println("Veri boyutu :100");
        start = System.nanoTime();

        for (int i = 0; i < 100; ++i) {
            int a = randomnum.nextInt(1000);
            binarySearchTreeMyPriorityQueue3.enqueue(a);
        }
        end = System.nanoTime();
        result = end - start;

        System.out.println("Enqueue calisma suresi: " + result + " nanosaniye");

        start = System.nanoTime();
        for (int i = 0; i < 100; ++i) {
            binarySearchTreeMyPriorityQueue3.dequeue();
        }
        end = System.nanoTime();
        result = end - start;
        System.out.println("Dequeue calisma suresi: " + result + " nanosaniye");
        binarySearchTreeMyPriorityQueue<Integer> binarySearchTreeMyPriorityQueue4 = new binarySearchTreeMyPriorityQueue<>(comp);

        System.out.println("Veri boyutu :1000");
        start = System.currentTimeMillis();

        for (int i = 0; i < 1000; ++i) {
            int a = randomnum.nextInt(10000);
            binarySearchTreeMyPriorityQueue4.enqueue(a);
        }
        end = System.currentTimeMillis();
        result = end - start;

        System.out.println("Enqueue calisma suresi: " + result + " milisaniye");

        start = System.currentTimeMillis();

        for (int i = 0; i < 1000; ++i) {
            binarySearchTreeMyPriorityQueue4.dequeue();
        }
        end = System.currentTimeMillis();
        result = end - start;
        System.out.println("Dequeue calisma suresi: " + result + " milisaniye");
        binarySearchTreeMyPriorityQueue<Integer> binarySearchTreeMyPriorityQueue5 = new binarySearchTreeMyPriorityQueue<>(comp);

        System.out.println("Veri boyutu :10000");
        start = System.currentTimeMillis();

        for (int i = 0; i < 10000; ++i) {
            int a = randomnum.nextInt(100000);
            binarySearchTreeMyPriorityQueue5.enqueue(a);
        }
        end = System.currentTimeMillis();
        result = end - start;
        System.out.println("Enqueue calisma suresi: " + result + " milisaniye");

        start = System.currentTimeMillis();

        for (int i = 0; i < 10000; ++i) {
            binarySearchTreeMyPriorityQueue5.dequeue();
        }
        end = System.currentTimeMillis();
        result = end - start;

        System.out.println("Dequeue calisma suresi: " + result + " milisaniye");
        binarySearchTreeMyPriorityQueue<Integer> binarySearchTreeMyPriorityQueue6 = new binarySearchTreeMyPriorityQueue<>(comp);

        System.out.println("Veri boyutu :100000");
        start = System.currentTimeMillis();

        for (int i = 0; i < 100000; ++i) {
            int a = randomnum.nextInt(1000000);
            binarySearchTreeMyPriorityQueue6.enqueue(a);
        }
        end = System.currentTimeMillis();
        result = end - start;
        System.out.println("Enqueue calisma suresi: " + result + " milisaniye");

        start = System.currentTimeMillis();

        for (int i = 0; i < 100000; ++i) {
            binarySearchTreeMyPriorityQueue6.dequeue();
        }
        end = System.currentTimeMillis();
        result = end - start;
        System.out.println("Dequeue calisma suresi: " + result + " milisaniye");

        binarySearchTreeMyPriorityQueue<Integer> binarySearchTreeMyPriorityQueue7 = new binarySearchTreeMyPriorityQueue<>(comp);

        System.out.println("Veri boyutu :1000000");
        start = System.currentTimeMillis();

        for (int i = 0; i < 1000000; ++i) {
            int a = randomnum.nextInt(10000000);
            binarySearchTreeMyPriorityQueue7.enqueue(a);
        }
        end = System.currentTimeMillis();
        result = end - start;
        System.out.println("Enqueue calisma suresi: " + result + " milisaniye");

        start = System.currentTimeMillis();

        for (int i = 0; i < 1000000; ++i) {
            binarySearchTreeMyPriorityQueue7.dequeue();
        }
        end = System.currentTimeMillis();
        result = end - start;
        System.out.println("Dequeue calisma suresi: " + result + " milisaniye");

    }
}
