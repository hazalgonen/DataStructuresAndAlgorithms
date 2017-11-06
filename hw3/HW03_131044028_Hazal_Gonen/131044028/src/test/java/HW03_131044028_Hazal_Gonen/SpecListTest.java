package HW03_131044028_Hazal_Gonen;

import java.util.Iterator;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;
import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.BeforeClass;

/**
 *
 * @author hazal
 */
public class SpecListTest {

    /**
     *
     */
    @Before
    public void setUpClass() {
        System.out.println("\n\n Test metodu çağrılacak.");
    }

    /**
     *
     */
    @After
    public void tearDownClass() {
        System.out.println(" Test metodu bitti.");
    }

    /**
     * Listenin basina elemanlari ekler
     */
    @Test
    public void testAddAllAtHead() {
        System.out.println("\n----addAllAtHead Testi");
        System.out.println("********************************");
        System.out.println("Asil listemde ki elemanlar:");
        SpecList list_ = new SpecList();
        list_.add(9);
        Iterator iteratorList = list_.iterator();
        while (iteratorList.hasNext()) {
            System.out.println(iteratorList.next());
        }
        System.out.println("********************************");
        Collection<Integer> c = new SpecList<Integer>();
        System.out.println("Collection olusturdum\n4 eleman ekledim\nBunlar:");
        c.add(1);
        c.add(4);
        c.add(0);
        c.add(-1);

        Iterator iterator_ = c.iterator();
        while (iterator_.hasNext()) {
            System.out.println(iterator_.next());
        }

        System.out.println("********************************");
        System.out.println("Asil listeye collection listesini ekledikten sonra:");

        list_.addAllAtHead(c);
        Iterator iteratorList1 = list_.iterator();
        while (iteratorList1.hasNext()) {
            System.out.println(iteratorList1.next());
        }
        System.out.println("********************************");
    }

    /**
     * Kesisim kumesi bulur
     */
    @Test

    public void testGetIntersectList() {
        System.out.println("\n----getIntersectList");
        System.out.println("********************************");
        System.out.println("Asil listemde ki elemanlar:");
        SpecList<Integer> list_ = new SpecList<>();
        list_.add(9);
        list_.add(-1);
        list_.add(6);
        list_.add(2);
        list_.add(4);
        list_.add(4);
        Iterator iteratorList = list_.iterator();
        while (iteratorList.hasNext()) {
            System.out.println(iteratorList.next());
        }
        iteratorList.remove();
        System.out.println("********************************");
        Collection<Integer> c = new SpecList<Integer>();
        System.out.println("Collection olusturdum\n4 eleman ekledim\nBunlar:");
        c.add(1);
        c.add(4);
        c.add(0);
        c.add(-1);
        c.add(2);
        Iterator iterator_ = c.iterator();
        while (iterator_.hasNext()) {
            System.out.println(iterator_.next());
        }

        System.out.println("********************************");

        List<Integer> newList = new SpecList<>();
        newList = list_.getIntersectList(c);

        System.out.println("Iki listenin kesisim kumesi:");
        for (int i = 0; i < newList.size(); ++i) {
            System.out.println(newList.get(i));
        }
        System.out.println("********************************");

    }

    /**
     * Listeyi siralar
     */
     @Test
    public void testSortList() {
        System.out.println("\n----sortList");
        SpecList list_ = new SpecList();
        List<Integer> sortList_ = new SpecList();
        List<Integer> sortList1_ = new SpecList();
        list_.add(9);
        list_.add(-1);
        list_.add(6);
        list_.add(2);
        list_.add(4);
        list_.add(4);
        Iterator iteratorList = list_.iterator();
        System.out.println("Siralamadan once ki liste:");
        while (iteratorList.hasNext()) {
            System.out.println(iteratorList.next());
        }
        System.out.println("********************************");

        sortList_ = list_.sortList(0);
        Iterator iteratorSortList = sortList_.iterator();
        System.out.println("0 parametresiyle buyukten kucuge:");
        while (iteratorSortList.hasNext()) {
            System.out.println(iteratorSortList.next());
        }
        System.out.println("********************************");

        sortList1_ = list_.sortList(1);
        Iterator iteratorSortList1 = sortList1_.iterator();
        System.out.println("1 parametresiyle kucukten buyuge:");
        while (iteratorSortList1.hasNext()) {
            System.out.println(iteratorSortList1.next());
        }
        System.out.println("********************************");
    }

}
