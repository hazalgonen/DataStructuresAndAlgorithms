package HW05_131044028_Hazal_Gonen;

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
public class LinkedListRecTest<E> {

   

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
     * Verilen elemani listeden komple kaldirir
     */
    @Test
    public void testRemove() {
        System.out.println("\n** remove metodu testi **");
        System.out.println("Bu testte 3 ornek var");
        System.out.println("------------------------");
        System.out.println("Ilk ornek icin liste:");

        int outData = 1;

        //list1 doldurulur
        LinkedListRec list1 = new LinkedListRec<>();
        list1.add(1);
        list1.add(5);
        list1.add(4);
        list1.add(6);
        list1.add(7);
        list1.add(1);

        System.out.println(list1);
        System.out.println("\nVerilen listeden " + outData + " elemanini sil");
        //silindi
        list1.remove(outData);
        System.out.println("\nSilme isleminden sonra: ");
        System.out.println(list1);

        //list2 doldurulur
        LinkedListRec list2 = new LinkedListRec<>();
        list2.add(6);
        list2.add(6);
        list2.add(6);
        list2.add(5);
        list2.add(6);
        list2.add(6);
        outData = 6;
        System.out.println("------------------------");
        System.out.println("Ikinci ornek icin liste:");
        System.out.println(list2);
        System.out.println("\nVerilen listeden " + outData + " elemanini sil");
        list2.remove(outData);
        System.out.println("\nSilme isleminden sonra: ");
        System.out.println(list2);

        //list3 doldurulur
        LinkedListRec list3 = new LinkedListRec<>();
        outData = 4;
        list3.add(1);
        list3.add(2);
        list3.add(3);

        System.out.println("------------------------");
        System.out.println("Ucuncu ornek icin liste:");
        System.out.println(list3);
        System.out.println("\nVerilen listeden " + outData + " elemanini sil");
        list3.remove(outData);
        System.out.println("\nSilme isleminden sonra: ");
        System.out.println(list3);

    }

    /**
     * Listenin size'ini doner
     */
    @Test
    public void testSize() {
        System.out.println("\n** size metodu testi **");
        LinkedListRec list1 = new LinkedListRec<>();

        list1.add(1);
        list1.add(5);
        list1.add(4);
        list1.add(6);
        list1.add(7);
        list1.add(1);
        System.out.println(list1);

        int result = list1.size();
        System.out.println("Verilen listin size'i:" + result);
        assertEquals(6, result);

    }

    /**
     * Listeye eleman ekler
     */
    @Test
    public void testAdd() {
        System.out.println("\n** add metodu testi **");
        LinkedListRec<String> instance = new LinkedListRec();
        System.out.println("Listeye 4 eleman eklendi bunlar:");
        instance.add("a");
        instance.add("b");
        instance.add("c");
        instance.add("d");

        System.out.println(instance);
    }

    /**
     * toString metodu
     */
    @Test
    public void testToString() {
        System.out.println("\n** toString metodu testi **");
        LinkedListRec<Double> instance = new LinkedListRec();
        instance.add(6.4);
        instance.add(2.0);
        instance.add(8.1);
        instance.add(0.5);
        String result = instance.toString();
        System.out.println(result);
    }

}
