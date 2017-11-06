package HW03_131044028_Hazal_Gonen;

import java.util.*;

/**
 *
 * @author hazal gonen
 */
public class HW03_131044028_Hazal_Gonen {

    /**
     *
     * @param args
     */
    public static void main(String[] args) {

        ///////////////////////////////////////////////////////
        System.out.println("---------------------------------------------------");
        System.out.println("---------------------------------------------------");
        StringTest();
        System.out.println("---------------------------------------------------");
        System.out.println("---------------------------------------------------");
        System.out.println("---------------------------------------------------");
        System.out.println("---------------------------------------------------");
        IntegerTest();
        System.out.println("---------------------------------------------------");
        System.out.println("---------------------------------------------------");
        System.out.println("---------------------------------------------------");
        System.out.println("---------------------------------------------------");
        DoubleTest();
        System.out.println("---------------------------------------------------");
        System.out.println("---------------------------------------------------");

    }

    /**
     * String testi
     */
    public static void StringTest() {

        
        SpecList<String> stringList = new SpecList<>();
        Collection<String> stringCollection = new SpecList<>();
              
        SpecList<String> stringList1 = new SpecList<>();
        List<String> stringListIntersection = new SpecList<>();
        List<String> stringListSortDe = new SpecList<>();
        List<String> stringListSortIn = new SpecList<>();
        System.out.println("STRING TIPI ICIN:");

        stringList.add("kalem");
        stringList.add("silgi");
        stringList.add("defter");
        System.out.println("**************************");
        System.out.println("Listede bulunan elemanlar:");
        for (int i = 0; i < stringList.size(); ++i) {
            System.out.println(stringList.get(i));
        }
        System.out.println("**************************");
        System.out.println("Sonradan listenin basina eklenecek elemanlar");
        stringCollection.add("elma");
        stringCollection.add("cilek");
        stringCollection.add("anahtar");
        stringCollection.add("canta");
        Iterator iterator_ = stringCollection.iterator();
        while (iterator_.hasNext()) {
            System.out.println(iterator_.next());
        }
        System.out.println("**************************");
        stringList.addAllAtHead(stringCollection);
        
        System.out.println("Eklemeden sonra:");
        for (int i = 0; i < stringList.size(); ++i) {
            System.out.println(stringList.get(i));
        }
        System.out.println("**************************");
        System.out.println("Kesisim testi icin:\nIlk liste:");
        stringList1.add("kalem");
        stringList1.add("defter");
        stringList1.add("cetvel");
        for (int i = 0; i < stringList1.size(); ++i) {
            System.out.println(stringList1.get(i));
        }
        System.out.println("**************************");
        System.out.println("Ikinci liste:");
        for (int i = 0; i < stringList.size(); ++i) {
            System.out.println(stringList.get(i));
        }
        System.out.println("**************************");
        stringListIntersection = stringList.getIntersectList(stringList1);
        System.out.println("Kesisim kumeleri:");
        for (int i = 0; i < stringListIntersection.size(); ++i) {
            System.out.println(stringListIntersection.get(i));
        }
        System.out.println("**************************");

        System.out.println("Siralanmasini istedigim liste");
        for (int i = 0; i < stringList.size(); ++i) {
            System.out.println(stringList.get(i));
        }
        System.out.println("**************************");

        System.out.println("Buyukten kucuge");
        stringListSortDe = stringList.sortList(0);
        for (int i = 0; i < stringListSortDe.size(); ++i) {
            System.out.println(stringListSortDe.get(i));
        }
        System.out.println("**************************");

        System.out.println("Kucukten buyuge");
        stringListSortIn = stringList.sortList(1);
        for (int i = 0; i < stringListSortIn.size(); ++i) {
            System.out.println(stringListSortIn.get(i));
        }
    }

    /**
     * Integer testi
     */
    public static void IntegerTest() {
        SpecList<Integer> intList = new SpecList<>();

        Collection<Integer> intCollection = new SpecList<>();

        SpecList<Integer> intList1 = new SpecList<>();
        List<Integer> intListIntersection = new SpecList<>();
        List<Integer> intListSortDe = new SpecList<>();
        List<Integer> intListSortIn = new SpecList<>();
        System.out.println("Integer TIPI ICIN:");

        intList.add(5);
        intList.add(10);
        intList.add(-9);
        System.out.println("**************************");
        System.out.println("Listede bulunan elemanlar:");
        for (int i = 0; i < intList.size(); ++i) {
            System.out.println(intList.get(i));
        }
        System.out.println("**************************");
        System.out.println("Sonradan listenin basina eklenecek elemanlar");
        intCollection.add(6);
        intCollection.add(8);
        intCollection.add(-1);
        intCollection.add(3);
        Iterator iterator_ = intCollection.iterator();
        while (iterator_.hasNext()) {
            System.out.println(iterator_.next());
        }
        System.out.println("**************************");
        intList.addAllAtHead(intCollection);
        System.out.println("Eklemeden sonra:");
        for (int i = 0; i < intList.size(); ++i) {
            System.out.println(intList.get(i));
        }
        System.out.println("**************************");
        System.out.println("Kesisim testi icin:\nIlk liste:");
        intList1.add(-1);
        intList1.add(10);
        intList1.add(5);
        intList1.add(-7);
        intList1.add(18);
        for (int i = 0; i < intList1.size(); ++i) {
            System.out.println(intList1.get(i));
        }
        System.out.println("**************************");
        System.out.println("Ikinci liste:");
        for (int i = 0; i < intList.size(); ++i) {
            System.out.println(intList.get(i));
        }
        System.out.println("**************************");
        intListIntersection = intList.getIntersectList(intList1);
        System.out.println("Kesisim kumeleri:");
        for (int i = 0; i < intListIntersection.size(); ++i) {
            System.out.println(intListIntersection.get(i));
        }
        System.out.println("**************************");

        System.out.println("Siralanmasini istedigim liste");
        for (int i = 0; i < intList.size(); ++i) {
            System.out.println(intList.get(i));
        }
        System.out.println("**************************");

        System.out.println("Buyukten kucuge");
        intListSortDe = intList.sortList(0);
        for (int i = 0; i < intListSortDe.size(); ++i) {
            System.out.println(intListSortDe.get(i));
        }
        System.out.println("**************************");

        System.out.println("Kucukten buyuge");
        intListSortIn = intList.sortList(1);
        for (int i = 0; i < intListSortIn.size(); ++i) {
            System.out.println(intListSortIn.get(i));
        }
    }

    /**
     * Double testi
     */
    public static void DoubleTest() {

        SpecList<Double> doubleList = new SpecList<>();
        Collection<Double> doubleCollection = new SpecList<>();
        SpecList<Double> doubleList1 = new SpecList<>();
        List<Double> doubleListIntersection = new SpecList<>();
        List<Double> doubleListSortDe = new SpecList<>();
        List<Double> doubleListSortIn = new SpecList<>();
        System.out.println("Double TIPI ICIN:");

        doubleList.add(5.4);
        doubleList.add(10.6);
        doubleList.add(-9.5);
        doubleList.add(10.4);
        System.out.println("**************************");
        System.out.println("Listede bulunan elemanlar:");
        for (int i = 0; i < doubleList.size(); ++i) {
            System.out.println(doubleList.get(i));
        }
        System.out.println("**************************");
        System.out.println("Sonradan listenin basina eklenecek elemanlar");
        doubleCollection.add(6.5);
        doubleCollection.add(9.1);
        doubleCollection.add(-1.6);
        doubleCollection.add(3.9);
        Iterator iterator_ = doubleCollection.iterator();
        while (iterator_.hasNext()) {
            System.out.println(iterator_.next());
        }
        System.out.println("**************************");
        doubleList.addAllAtHead(doubleCollection);
        System.out.println("Eklemeden sonra:");
        for (int i = 0; i < doubleList.size(); ++i) {
            System.out.println(doubleList.get(i));
        }
        System.out.println("**************************");
        System.out.println("Kesisim testi icin:\nIlk liste:");
        doubleList1.add(-1.5);
        doubleList1.add(10.5);
        doubleList1.add(3.9);
        doubleList1.add(-7.0);
        doubleList1.add(6.5);
        for (int i = 0; i < doubleList1.size(); ++i) {
            System.out.println(doubleList1.get(i));
        }
        System.out.println("**************************");
        System.out.println("Ikinci liste:");
        for (int i = 0; i < doubleList.size(); ++i) {
            System.out.println(doubleList.get(i));
        }
        System.out.println("**************************");
        doubleListIntersection = doubleList.getIntersectList(doubleList1);
        System.out.println("Kesisim kumeleri:");
        for (int i = 0; i < doubleListIntersection.size(); ++i) {
            System.out.println(doubleListIntersection.get(i));
        }
        System.out.println("**************************");

        System.out.println("Siralanmasini istedigim liste");
        for (int i = 0; i < doubleList.size(); ++i) {
            System.out.println(doubleList.get(i));
        }
        System.out.println("**************************");

        System.out.println("Buyukten kucuge");
        doubleListSortDe = doubleList.sortList(0);
        for (int i = 0; i < doubleListSortDe.size(); ++i) {
            System.out.println(doubleListSortDe.get(i));
        }
        System.out.println("**************************");

        System.out.println("Kucukten buyuge");
        doubleListSortIn = doubleList.sortList(1);
        for (int i = 0; i < doubleListSortIn.size(); ++i) {
            System.out.println(doubleListSortIn.get(i));
        }
    }
}
