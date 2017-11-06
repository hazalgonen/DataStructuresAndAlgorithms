/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HW7_part1_Hazal_Gonen;
/**
 *
 * @author hazal
 * @param <E>
 */
public interface priorityQueue<E> {

    /**
     * prioritysi yuksek olan elemani cikarir
     *
     * @return cikan eleman
     */
    public E dequeue();

    /**
     * sizei bulur
     *
     * @return size
     */
    public int size();

    /**
     * bos mu diye bakar
     *
     * @return bossa true
     */
    public boolean isEmpty();

    /**
     * eleman ekler
     *
     * @param e eklenen eleman
     * @return basariliyse true
     */
    public boolean enqueue(E e);
}