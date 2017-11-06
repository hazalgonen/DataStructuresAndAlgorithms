/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HW7_part1_Hazal_Gonen;

import java.util.ArrayList;
import java.util.Comparator;

/**
 *
 * @author hazal
 * @param <E> generic
 */
public class myPriorityQueue<E> implements priorityQueue<E> {

    //kullandigim arraylist
    private ArrayList<E> arrList;

    //comparator
    Comparator<E> comparator = null;

    /**
     * Constructor
     *
     * @param cap ne kadarlik veri girilecek
     * @param comp comparator
     */
    public myPriorityQueue(int cap, Comparator< E> comp) {
        if (cap < 1) {
            throw new IllegalArgumentException();
        }
        arrList = new ArrayList<>(cap + 1);
        comparator = comp;
    }

    /**
     * Constructor
     *
     * @param comp comparator
     */
    public myPriorityQueue(Comparator< E> comp) {

        arrList = new ArrayList<>();
        comparator = comp;
    }

    /**
     * Constructor
     */
    public myPriorityQueue() {
        arrList = new ArrayList<>();
    }

    /**
     * bos mu kontrolu yapilir
     *
     * @return bossa true doner
     */
    @Override
    public boolean isEmpty() {
        return arrList.isEmpty();
    }

    /**
     * dequeue islemi priortysi yuksek olani cikarma islemidir
     *
     * @return cikan eleman
     */
    @Override
    public E dequeue() {
        //eger bossa null return eder
        if (isEmpty()) {
            return null;
        }

        //ilk eleman result
        E result = arrList.get(0);

        //eger size 1se ilk elemani remove yapar
        if (arrList.size() == 1) {
            arrList.remove(0);
            return result;
        }

        //arraylistin sonuncu elemanini ilk eleman yaparsam ilk elemani silmis olurum
        arrList.set(0, arrList.remove(arrList.size() - 1));
        //ama priority ozelligini tekrar saglatmak icin donguye sokmaliyim
        int parent = 0;
        while (true) {

            int leftChild = 2 * parent + 1;
            if (leftChild >= arrList.size()) {
                break; //donguden cikar
            }
            int rightChild = leftChild + 1;
            int minChild = leftChild; 

            if (rightChild < arrList.size() && compare(arrList.get(leftChild), arrList.get(rightChild)) > 0) {
                minChild = rightChild;
            }

           
            if (compare(arrList.get(parent),
                    arrList.get(minChild)) > 0) {
                swap(parent, minChild);
                parent = minChild;
            } else { 
                break;
            }
        }
        return result;
    }

    /**
     * size'i return eder
     * @return size
     */
    @Override
    public int size() {
        return arrList.size();
    }

    /**
     * enqueue islemi yapar
     * @param e eklenecek eleman
     * @return eklendiyse true doner
     */
    @Override
    public boolean enqueue(E e) {
        // sona eklenir
        arrList.add(e);
        // en son eklenen child oldu
        int child = arrList.size() - 1;
        int parent = (child - 1) / 2; // childin parenti
       
        //childa uygun yer bulana kadar swap yapilir
        while (parent >= 0 && compare(arrList.get(parent),
                arrList.get(child)) > 0) {
            swap(parent, child);
            child = parent;
            parent = (child - 1) / 2;
        }
        return true;
    }

    /**
     * iki eleman karsilastirirlir
     * @param left sol
     * @param right sag
     * @return kucukse -1 buyukse 1 esitse 0
     */
    private int compare(E left, E right) {
        if (comparator != null) {
            return comparator.compare(left, right);

        } else {
            return ((Comparable<E>) left).compareTo(right);
        }
    }

    /**
     * yer degistirme yapar
     * @param i. eleman
     * @param j. eleman
     */
    private void swap(int i, int j) {
        E temp = arrList.get(i);
        arrList.set(i, arrList.get(j));
        arrList.set(j, temp);

    }
    
    public E peek(){
        return arrList.get(0);
    }

    /**
     * listeyi print eder
     */
    public void print() {

        System.out.println("Listedeki elemanlar:");
        for (int i = 0; i < arrList.size(); ++i) {
            System.out.println(arrList.get(i));
        }
    }
}