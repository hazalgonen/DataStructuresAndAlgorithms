/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TreesHW;

import java.util.Comparator;
import java.util.LinkedList;
import java.util.ListIterator;

/**
 *
 * @author hazal
 * @param <E>
 */
public class linkedlistMyPriorityQueue<E extends Comparable<E>> implements priorityQueue<E> {

    private LinkedList<E> linkedlist_;
    Comparator<E> comparator = null;

    /**
     * Constructor
     *
     * @param cap ne kadarlik veri girilecek
     * @param comp comparator
     */
    public linkedlistMyPriorityQueue(int cap, Comparator< E> comp) {
        if (cap < 1) {
            throw new IllegalArgumentException();
        }
        linkedlist_ = new LinkedList<>();
        comparator = comp;
    }

    /**
     * Constructor
     *
     * @param comp comparator
     */
    public linkedlistMyPriorityQueue(Comparator< E> comp) {

        linkedlist_ = new LinkedList<>();
        comparator = comp;
    }

    /**
     * Constructor
     */
    public linkedlistMyPriorityQueue() {
        linkedlist_ = new LinkedList<>();
    }

    /**
     * linkedListin isEmpty metodu cagirilir
     *
     * @return
     */
    @Override
    public boolean isEmpty() {
        return linkedlist_.isEmpty();
    }

    /**
     * linkedListin getFirst metodu ve removuFirst metodu kullanilir
     *
     * @return silinen eleman
     */
    @Override
    public E dequeue() {
        if (isEmpty()) {
            return null;
        }
        E result = linkedlist_.getFirst();
        linkedlist_.removeFirst();
        return result;

    }

    /**
     * linkedListin size() metodu
     *
     * @return
     */
    @Override
    public int size() {
        return linkedlist_.size();
    }

    /**
     * linkedListi sirali olarak doldurur
     *
     * @param e eklenen eleman
     * @return basariliysa true doner
     */
    @Override
    public boolean enqueue(E e) {
        ListIterator<E> itr = linkedlist_.listIterator();
        while (true) {
            if (itr.hasNext() == false) {
                itr.add(e);
                return (true);
            }
            E elementInList = itr.next();
            if (elementInList.compareTo(e) > 0) {
                itr.previous();
                itr.add(e);
                return (true);
            }
        }
    }

    /**
     * elemanlari ekrana basar
     */
    public void print() {

        System.out.println("Listedeki elemanlar:");
        for (int i = 0; i < linkedlist_.size(); ++i) {
            System.out.println(linkedlist_.get(i));
        }
    }
}
