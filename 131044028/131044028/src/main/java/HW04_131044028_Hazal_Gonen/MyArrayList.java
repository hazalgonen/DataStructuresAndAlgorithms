/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HW04_131044028_Hazal_Gonen;

import HW04_131044028_Hazal_Gonen.myException.MyArrayIndexOutOfBoundsException;
import java.util.Arrays;

/**
 *
 * @author hazal
 */
public class MyArrayList<E> {

    /**
     * array
     */
    private E[] myArray;
    /**
     * size
     */
    private int size = 0;
    /**
     * capacity
     */
    private int capacity = 0;

    /**
     * baslangic capacity
     */
    private static final int INIT_CAP = 10;

    /**
     * constructor
     */
    public MyArrayList() {

        capacity = INIT_CAP;
        myArray = (E[]) new Object[capacity];
    }

    /**
     * eleman ekler
     *
     * @param newElement eklenecek eleman
     * @return dogruysa true doner
     */
    public boolean add(E newElement) {
        if (size == capacity) {
            reallocate();
        }

        myArray[size] = newElement;
        size++;
        return true;

    }

    /**
     * eleman ekler
     *
     * @param newElement eklencek eleman
     * @param index bu indexe
     * @throws
     * HW04_131044028_Hazal_Gonen.myException.MyArrayIndexOutOfBoundsException
     */
    public void add(E newElement, int index) throws MyArrayIndexOutOfBoundsException {

        if (index < 0 || index > size) {
            throw new MyArrayIndexOutOfBoundsException("Array sinirlari asildi");
        }
        if (size == capacity) {
            reallocate();
        }

        for (int i = size; i > index; --i) {
            myArray[i] = myArray[i - 1];
        }

        myArray[index] = newElement;
        size++;
    }

    /**
     * eleman siler
     *
     * @param index deki eleman silinir
     * @return
     * @throws
     * HW04_131044028_Hazal_Gonen.myException.MyArrayIndexOutOfBoundsException
     */
    public E remove(int index) throws MyArrayIndexOutOfBoundsException {
        if (index < 0 || index > size) {
            throw new MyArrayIndexOutOfBoundsException("Array sinirlari asildi");
        }

        E old = myArray[index];
        for (int i = index + 1; i < size; i++) {
            myArray[i - 1] = myArray[i];
        }

        size--;
        return old;
    }

    /**
     * getter yapar
     *
     * @param index
     * @return
     * @throws
     * HW04_131044028_Hazal_Gonen.myException.MyArrayIndexOutOfBoundsException
     */
    public E get(int index) throws MyArrayIndexOutOfBoundsException {
        try {
            if (index < 0 || index > size) {
                throw new MyArrayIndexOutOfBoundsException("Array sinirlari asildi");
            }

        } catch (MyArrayIndexOutOfBoundsException ex) {
            ex.getMessage();
            return null;
        }
        return myArray[index];
    }

    /**
     * setter yapar
     *
     * @param newElement
     * @param index
     * @return
     * @throws
     * HW04_131044028_Hazal_Gonen.myException.MyArrayIndexOutOfBoundsException
     */
    public E set(E newElement, int index) throws MyArrayIndexOutOfBoundsException {
        if (index < 0 || index > size) {
            throw new MyArrayIndexOutOfBoundsException("Array sinirlari asildi");
        }

        E old = myArray[index];
        myArray[index] = newElement;
        return old;
    }

    /**
     * reallocate yaparak capacity 2 katina cikar bu fonksiyon normalde private
     */
    public void reallocate() {
        if (size == capacity) {
            capacity = capacity * 2;

            myArray = Arrays.copyOf(myArray, capacity);
        }
    }

    /**
     * arrayin size'i
     *
     * @return
     */
    public int size() {

        return size;
    }

    /**
     * arrayin kapasitesi bu fonksiyon normalde private
     *
     * @return
     */
    public int getCapacity() {
        return capacity;
    }
}
