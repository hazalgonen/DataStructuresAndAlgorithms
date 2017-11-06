package HW05_131044028_Hazal_Gonen;

/**
 * Bu class linkedListRec classidir Verilen datayi butun listeden silen
 * recursive remove fonksiyonu icerir Diger metodlar da recursive olarak yazilir
 *
 * @author hazal_gonen
 * @param <E> generic
 */
public class LinkedListRec<E> {

    //listenin basini tutar
    private Node<E> head = null;

    /**
     * inner Node classi
     *
     * @param <E> generic type
     */
    private static class Node<E> {

        private E data;//data
        private Node<E> next;//Node'un nexti

        /**
         * constructor data'yi sona ekler
         *
         * @param dataItem eklenecek data
         */
        private Node(E dataItem) {
            data = dataItem;
            next = null;
        }

        /**
         * constructor node'a data'yi ekler
         *
         * @param dataItem eklenecek data
         * @param noderef eklenecek node
         */
        private Node(E dataItem, Node<E> noderef) {
            data = dataItem;
            next = noderef;
        }
    }

    /**
     * remove fonksiyonu verilen data'yi butun listeden siler
     *
     * @param head node'un basi
     * @param pred node'un basinin bir oncesi
     * @param outData silinecek data
     * @return eger silinemezse false doner
     */
    private boolean remove(Node< E> head, Node< E> pred, E outData) {
        //head nullsa yani liste bossa false donsun
        if (head == null) {
            return false;
        } else if (head.data.equals(outData)) {
            //eger data head'e esitse recursive fonksiyon cagirilir
            //head bir ilerletilmis oldu
            remove(head.next, head, outData);
            //predin nextine headin nexti atanir
            pred.next = head.next;
            return true;
        } else {
            //remove fonksiyonu cagirilir
            return remove(head.next, head, outData);
        }

    }

    /**
     * wrapper remove fonksiyonu kullanici yalnizca silinecek datayi girer
     *
     * @param outData silinecek data
     * @return hatali islem false doner
     */
    public boolean remove(E outData) {
        //head null sa false return eder
        if (head == null) {
            return false;
            //en bastaki silme islemi burada recursive yapilir
        } else if (head.data.equals(outData)) {
            head = head.next;
            return remove(outData);
        } else {
            //digerleri icin private remove fonksiyonu cagirilir
            return remove(head.next, head, outData);
        }

    }

    /**
     * listin size'ini doner recursive
     *
     * @param head en bastaki node
     * @return size
     */
    private int size(Node<E> head) {
        if (head == null) {
            return 0;
        } else {
            //recursive kol
            return 1 + size(head.next);
        }
    }

    /**
     * wrapper size fonksiyonu
     *
     * @return size
     */
    public int size() {
        return size(head);
    }

    /**
     * recursive add yapar
     *
     * @param head eklenecek node
     * @param data eklenecek data
     */
    private void add(Node<E> head, E data) {
        if (head.next == null) {
            head.next = new Node<>(data);
        } else {
            add(head.next, data);
        }
    }

    /**
     * wrapper add fonksiyonu
     *
     * @param data eklenecek data
     */
    public void add(E data) {
        if (head == null) {
            head = new Node<>(data);
        } else {
            add(head, data);
        }
    }

    /**
     * toString metodu recursive
     *
     * @param head goruntulenecek head
     * @return string
     */
    private String toString(Node<E> head) {
        if (head == null) {
            return "";
        } else if (head.next == null) {
            return head.data + "";
        } else {
            return head.data + " -> " + toString(head.next);
        }
    }

    /**
     * wrapper toString
     *
     * @return string
     */
    @Override
    public String toString() {
        System.out.println("");
        return toString(head);
    }

}
