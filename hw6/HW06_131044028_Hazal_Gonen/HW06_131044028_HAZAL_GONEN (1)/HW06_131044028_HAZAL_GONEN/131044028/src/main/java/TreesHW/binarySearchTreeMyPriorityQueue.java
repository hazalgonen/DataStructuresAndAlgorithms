/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TreesHW;

import java.util.Comparator;
import java.util.Iterator;

/**
 *
 * @author hazal
 * @param <E>
 */
public class binarySearchTreeMyPriorityQueue<E extends Comparable<E>> implements priorityQueue<E> {

    //binarySearchTree
    BinarySearchTree<E> bstree;

    //comparator
    Comparator<E> comparator = null;

    /**
     * Constructor
     *
     * @param cap ne kadarlik veri girilecek
     * @param comp comparator
     */
    public binarySearchTreeMyPriorityQueue(int cap, Comparator< E> comp) {
        if (cap < 1) {
            throw new IllegalArgumentException();
        }

        bstree = new BinarySearchTree<>();
        comparator = comp;
    }

    /**
     * Constructor
     */
    public binarySearchTreeMyPriorityQueue() {
        bstree = new BinarySearchTree<>();
    }

    /**
     * Constructor
     *
     * @param comp comparator
     */
    public binarySearchTreeMyPriorityQueue(Comparator< E> comp) {
        bstree = new BinarySearchTree<>();
        comparator = comp;
    }

    /**
     * bossa root nulldir
     *
     * @return
     */
    @Override
    public boolean isEmpty() {
        return bstree.root != null;
    }

    /**
     * binarySeacrhTree nin delete metodunu cagirir
     *
     * @return cikarilan eleman
     */
    @Override
    public E dequeue() {
       // if(bstree.g)
      
        return   bstree.delete(bstree.getData());
    }

    /**
     * binarySeacrhTree nin iteratorle size'ini bulur
     *
     * @return size
     */
    @Override
    public int size() {
        Iterator result = bstree.iterator();

        int size_ = 0;
        while (result.hasNext()) {
            ++size_;
            result.next();

        }
        return size_;
    }

    /**
     * binarySeacrhTree nin add metodunu cagirir
     *
     * @param e eklenecek eleman
     * @return true eger ekleme islemi basariliysa
     */
    @Override
    public boolean enqueue(E e) {
        return bstree.add(e);
    }

    /**
     * elemanlari ekrana basar
     */
    public void print() {

        System.out.println("Listedeki elemanlar:");
        Iterator result = bstree.iterator();

        while (result.hasNext()) {
            System.out.println(result.next());

        }
    }
}
