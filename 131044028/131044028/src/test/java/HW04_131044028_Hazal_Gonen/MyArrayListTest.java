/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HW04_131044028_Hazal_Gonen;

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
public class MyArrayListTest {

    @Before
    public void setUpClass() {
        System.out.println("\n\n-------------------------------");
        System.out.println(" Test metodu çağrılacak.\n");
    }

    @After
    public void tearDownClass() {
        System.out.println("\n Test metodu bitti.");
        System.out.println("-------------------------------");
    }
    /**
     * Test of add method, of class MyArrayList.
     * @throws HW04_131044028_Hazal_Gonen.myException.MyArrayIndexOutOfBoundsException
     */
    @Test
    public void testAdd_GenericType() throws myException.MyArrayIndexOutOfBoundsException {
        System.out.println("** add Testi **");
        Operand newElement = new Variable("a");
        MyArrayList instance = new MyArrayList();
        System.out.println(" Eklemeden once size: " + instance.size());
        System.out.println(" Arrayin sonuna a elemani ekledim");
        boolean result = instance.add(newElement);
        System.out.println(" Eklemeden sonra size: " + instance.size());
        boolean expResult = true;
        assertEquals(expResult, result);

    } 

    /**
     * Test of add method, of class MyArrayList.
     *
     * @throws java.lang.Exception
     */
    @Test
    public void testAdd_GenericType_int() throws Exception {
        System.out.println("** add Testi **");

        Operand newElement = new Variable("a");

        MyArrayList instance = new MyArrayList();
        System.out.println(" Eklemeden once size: " + instance.size());
        System.out.println(" Arrayin 0. indexine a elemani ekledim");
        instance.add(newElement, 0);
        System.out.println(" Eklemeden sonra size: " + instance.size());

    }

    /**
     * Test of remove method, of class MyArrayList.
     * @throws java.lang.Exception
     */
    @Test
    public void testRemove() throws Exception {
        System.out.println("** remove Testi **");

        Operand newElement = new Variable("a");

        MyArrayList instance = new MyArrayList();
        System.out.println(" Eklemeden once size: " + instance.size());
        System.out.println(" Arrayin 0. indexine a elemani ekledim");
        instance.add(newElement, 0);
        System.out.println(" Eklemeden sonra size: " + instance.size());
        instance.remove(0);
        System.out.println(" Sildikten sonra size: " + instance.size());

    }

    /**
     * Test of get method, of class MyArrayList.
     *
     * @throws java.lang.Exception
     */
    @Test
    public void testGet() throws Exception {
        System.out.println("** get Testi **");

        Operand newElement = new Variable("a");

        MyArrayList instance = new MyArrayList();

        instance.add(newElement);

        System.out.println(" Arrayin sonuna a elemani ekledim\n get(0) " + instance.get(0));
        Object result = instance.get(0);

        assertEquals(newElement, result);
    }

    /**
     * Test of set method, of class MyArrayList.
     * @throws java.lang.Exception
     */
    @Test
    public void testSet() throws Exception {
        System.out.println("** set Testi **");

        Operand oldElement = new Variable("a");

        System.out.println(" Arrayin 0.indexine a elemani ekledim daha sonra set yaparak b ekledim");
        MyArrayList instance = new MyArrayList();
        instance.add(oldElement);

        System.out.println(" Set etmeden once get(0) " + instance.get(0));

        Operand newElement = new Variable("b");
        Object expResult = oldElement;
        Object result = instance.set(newElement, 0);

        System.out.println(" Set ettikten sonra get(0) " + instance.get(0));

        assertEquals(expResult, result);

    }

    /**
     * Test of reallocate method, of class MyArrayList.
     */
    @Test
    public void testReallocate() {
        System.out.println("** reallocate Testi **");

        MyArrayList<Integer> instance = new MyArrayList();

        instance.add(1);
        System.out.println("Arrayin baslangic kapasitesi : " + instance.getCapacity());
        for (int i = 0; i < 10; ++i) {
            instance.add(i);
            instance.reallocate();
        }

        System.out.println("reallocate yaptiktan sonra kapasite: " + instance.getCapacity());
    }

    /**
     * Test of size method, of class MyArrayList.
     * @throws HW04_131044028_Hazal_Gonen.myException.MyArrayIndexOutOfBoundsException
     */
    @Test
    public void testSize() throws myException.MyArrayIndexOutOfBoundsException {
        System.out.println("** size Testi **");

        Operand newElement = new Variable("a");
        MyArrayList instance = new MyArrayList();
        System.out.println(" Eklemeden once size: " + instance.size());
        System.out.println(" Arrayin sonuna a elemani ekledim");
        boolean result = instance.add(newElement);
        System.out.println(" Eklemeden sonra size: " + instance.size());

    }

    /**
     * kapasiteyi return eder
     */
    @Test
    public void testGetCapacity() {
        System.out.println("** getCapacity Testi **");

        MyArrayList<Integer> instance = new MyArrayList();

        instance.add(1);
        int result = instance.getCapacity();
        assertEquals(10, result);

    }

}
