/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TreesHW;

import java.util.Comparator;
import java.util.Vector;

/**
 *
 * @author hazal
 * @param <E>
 */
public class unsortedVectorMyPriorityQueue<E> implements priorityQueue<E> {

    //vector
    private Vector<E> vectorList;
    //comparator
    Comparator<E> comparator = null;

    /**
     * Constructor
     *
     * @param cap ne kadarlik veri girilecek
     * @param comp comparator
     */
    public unsortedVectorMyPriorityQueue(int cap, Comparator< E> comp) {
        if (cap < 1) {
            throw new IllegalArgumentException();
        }
        vectorList = new Vector<>(cap + 1);
        comparator = comp;
    }

    /**
     * Constructor
     *
     * @param comp comparator
     */
    public unsortedVectorMyPriorityQueue(Comparator< E> comp) {
        vectorList = new Vector<>();
        comparator = comp;
    }

    /**
     * Constructor
     */
    public unsortedVectorMyPriorityQueue() {
        vectorList = new Vector<>();
    }

    /**
     * bos mu kontrolu yapilir
     *
     * @return bossa true doner
     */
    @Override
    public boolean isEmpty() {
        return vectorList.isEmpty();
    }

    /**
     * eleman cikarilir
     *
     * @return cikan eleman
     */
    @Override
    public E dequeue() {
        if (isEmpty()) {
            return null;
        }
        E min = vectorList.get(0);
        for (E vectorList1 : vectorList) {
            if (compare(vectorList1, min) < 0) {
                min = vectorList1;
            }
        }
        for (int i = vectorList.indexOf(min); i < vectorList.size() - 1; ++i) {
            vectorList.set(i, vectorList.get(i + 1));
        }
        vectorList.setSize(vectorList.size()-1);
        return min;
    }

    /**
     * size return edilir
     *
     * @return size
     */
    @Override
    public int size() {
        return vectorList.size();
    }

    /**
     * eleman eklenir
     *
     * @param e eklenen eleman
     * @return basariliysa true
     */
    @Override
    public boolean enqueue(E e) {
        vectorList.add(e);
        return true;
    }

    /**
     * karsilastirma yapilir
     *
     * @param left sol eleman
     * @param right sag eleman
     * @return
     */
    private int compare(E left, E right) {
        if (comparator != null) {
            return comparator.compare(left, right);

        } else {
            return ((Comparable<E>) left).compareTo(right);
        }
    }

    /**
     * elemanlari ekrana basar
     */
    public void print() {

        System.out.println("Listedeki elemanlar:");
        for (int i = 0; i < vectorList.size(); ++i) {
            System.out.println(vectorList.get(i));
        }
    }
}
