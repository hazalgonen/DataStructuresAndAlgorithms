package HW03_131044028_Hazal_Gonen;

import java.util.*;

/**
 *
 * @author hazal Bu class linkedlist'i extend eder ve ona ek olarak 3 fonksiyon
 * ekler
 * @param <E> generic liste olmasi icin
 */
public class SpecList<E extends Comparable<E>> extends LinkedList<E> {

    /**
     * Parametresiz constructor
     */
    public SpecList() {
        super();
    }

    /**
     * Tek parametreli constructor
     *
     * @param clctn eklenecek liste
     */
    public SpecList(Collection<? extends E> clctn) {
        super(clctn);
    }

    /**
     * Bu fonksiyon listenin basina yeni elemanlar ekler
     *
     * @param c eklenecek elemanlari tutan collection
     * @return ekleme islemi basarili ise true doner
     */
    public Boolean addAllAtHead(Collection<? extends E> c) {

        try {
            SpecList<E> newlist = (SpecList<E>) c;
            for (int i = newlist.size() - 1; i >= 0; --i) {
                this.addFirst(newlist.get(i));
            }
        } catch (NullPointerException | IllegalStateException | ClassCastException |
                IllegalArgumentException e) {
            System.out.println("ERRORRR!!! HATA OLUSTU!!");
            e.printStackTrace();
            return false;
        }
        return true;
    }

    /**
     * Bu metod kesisim kumesini bulur
     *
     * @param c kesisim kumesi bulunacak 2. liste
     * @return kesisim kumesini barindiran liste return edilir
     */
    public List<E> getIntersectList(Collection<? extends E> c) {
        SpecList<E> intersectList = new SpecList<>();

        try {
            //collection olarak gelen listeyi Linkedliste cast ettim
            SpecList<E> castLinkedList = (SpecList<E>) c;

            //kesisim kumesini iceren linkedList
            for (int i = 0; i < this.size(); i++) { //objenin elemanlarina bakilir
                for (int j = 0; j < castLinkedList.size(); j++) {//2. c'nin elemanlarina bakilir
                    if (this.get(i).equals(castLinkedList.get(j))) { //eger esitlerse
                        if (isElement(intersectList, this.get(i)) == false) {//daha once eklenmemisse
                            intersectList.add(this.get(i));//ekler
                        }
                    }
                }
            }

        } catch (UnsupportedOperationException | ClassCastException |
                NullPointerException | IllegalArgumentException |
                IllegalStateException e) {
            System.out.println("ERRORRR!!! HATA OLUSTU!!");
            e.printStackTrace();
        }
        return intersectList;
    }

    /**
     * Diziyi siralar eger 0 girilirse buyukten kucuge 1 girilirse kucukten
     * buyuge bunlar disinda birsey girilirse islem yapmaz
     *
     * @param decreasing_or_increasing 0 veya 1 girilir
     * @return siralanmis liste return edilir
     */
    public List<E> sortList(int decreasing_or_increasing) {
        boolean swapped;

        //siralanmis olan liste
        SpecList<E> newSortList = new SpecList<>();

        try {
            //butun elemanlari listeye ekledim
            newSortList.addAll(this);

            do {
                swapped = false;
                for (int i = 0; i <= newSortList.size() - 2; i++) {
                    if (((decreasing_or_increasing == 1 && (newSortList.get(i).compareTo(newSortList.get(i + 1))) > 0)
                            || decreasing_or_increasing == 0 && (newSortList.get(i).compareTo(newSortList.get(i + 1))) < 0)) {
                        E temp = newSortList.get(i);
                        newSortList.set(i, newSortList.get(i + 1));
                        newSortList.set(i + 1, temp);
                        swapped = true;
                    }

                }
                if (!swapped) {
                    break;
                }
                swapped = false;
                for (int i = newSortList.size() - 2; i >= 0; i--) {

                    if ((decreasing_or_increasing == 1 && (newSortList.get(i).compareTo(newSortList.get(i + 1))) > 0)
                            || (decreasing_or_increasing == 0 && (newSortList.get(i).compareTo(newSortList.get(i + 1))) < 0)) {
                        E temp = newSortList.get(i);
                        newSortList.set(i, newSortList.get(i + 1));
                        newSortList.set(i + 1, temp);
                        swapped = true;
                    }
                }
            } while (swapped);
        } catch (UnsupportedOperationException | ClassCastException |
                NullPointerException | IllegalArgumentException |
                IllegalStateException e) {
            System.out.println("ERRORRR!!! HATA OLUSTU!!");
            e.printStackTrace();
        }
        return newSortList;
    }

    /**
     * Listede o eleman var mi diye bakar
     *
     * @param list_ bakilacak liste
     * @param element aranilan eleman
     * @return eger eleman varsa true yoksa false doner
     */
    private boolean isElement(SpecList<E> list_, E element) {
        for (int i = 0; i < list_.size(); ++i) {
            if (list_.get(i).equals(element)) {
                return true;
            }
        }
        return false;
    }
}
