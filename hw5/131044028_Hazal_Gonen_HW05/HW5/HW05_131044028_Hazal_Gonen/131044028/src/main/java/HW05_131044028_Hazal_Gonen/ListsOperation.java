package HW05_131044028_Hazal_Gonen;

import java.util.ArrayList;
import java.util.List;

/**
 * Bu class 3 tane recursive list islemi yapar bunlar intersection union ve
 * isSubsettir
 *
 * @author hazal_gonen
 * @param <E> generic
 */
public class ListsOperation<E extends Comparable<E>> implements Interface_ListsOperation {

    //birinci list
    private List<E> list1;
    //ikinci list
    private List<E> list2;

    /**
     * no parameter Constructor
     */
    public ListsOperation() {
        list1 = new ArrayList<>();
        list2 = new ArrayList<>();
    }

    /**
     * Constructor parametre olarak girilen listler assign edilir
     *
     * @param list1_ ilk list
     * @param list2_ ikinci list
     */
    public ListsOperation(List<E> list1_, List<E> list2_) {
        list1 = new ArrayList<>();
        list2 = new ArrayList<>();
        list1.addAll(list1_); //butun listeyi kopyaladi
        list2.addAll(list2_); //butun listeyi kopyaladi
    }

    /**
     * kesisim icin wrapper metod hangi listenin daha kucuk olduguna bakar ve
     * list2 mutlaka daha kucuk olmali
     *
     * @return kesisim listesi
     */
    @Override
    public List<E> intersectionOfLists() {

        if (list2.size() > list1.size()) {

            return sort((ArrayList<E>) intersectionOfLists(list2, list1));
        }
        return sort((ArrayList<E>) intersectionOfLists(list1, list2));
    }

    /**
     * bu fonksiyon iki listenin kesisimini alir ve return eder recursive olarak
     * calisir fonksiyon her zaman firstList >=secondList olarak gonderilir eger
     * ayni elemandan iki tane varsa kesisim olsugu icin iki eleman da alinir
     *
     * @param firstList :ilk liste
     * @param secondList :ikinci liste
     * @param indexOfFirstList:ilk listenin indexi
     * @param indexOfSecondList:ikinci listenin indexi
     * @return kesisim listesi return edilir
     */
    private List<E> intersectionOfLists(List<E> firstList, List< E> secondList) {

        //sonucu bu arraylist tutar
        ArrayList<E> result = new ArrayList<>();

        if (secondList.isEmpty()) {
            return secondList;
        } else {
            if (isElementOfList(firstList, secondList.get(0))) {
                result.add(secondList.get(0));
            }
            result.addAll(intersectionOfLists(firstList, secondList.subList(1, secondList.size())));
            return result;
        }

    }

    /**
     ** iki listenin birlesimini return eden wrapper
     *
     * @return birlesim listesi
     */
    @Override
    public List<E> unionOfLists() {
        ArrayList<E> result = new ArrayList<>();
        if (list2.size() > list1.size()) {

            return sort((ArrayList<E>) unionOfLists(list2, list1, 0, 0, result));
        } else {

            return sort((ArrayList<E>) unionOfLists(list1, list2, 0, 0, result));
        }
    }

    /**
     * yardimci sort fonksiyonu
     *
     * @param list siralanacak liste
     * @return siralanmis liste
     */
    private List<E> sort(ArrayList<E> list) {

        if (list.size() > 1) // check if the number of orders is larger than 1
        {
            for (int x = 0; x < list.size(); x++) // bubble sort outer loop
            {
                for (int i = 0; i < list.size() - i; i++) {
                    if (list.get(i).compareTo(list.get(i + 1)) > 0) {
                        E temp;
                        temp = list.get(i);
                        list.set(i, list.get(i + 1));
                        list.set(i + 1, temp);
                    }
                }
            }
        }
        return list;
    }

    /**
     * iki listenin birlesimini return eder ayni elemanlari listeye eklemez
     *
     * @param firstList ilk liste
     * @param secondList ikinci liste
     * @param indexOfFirstList ilk listenin indexi
     * @param indexOfSecondList ikinci listenin indexi
     * @return result
     */
    private List<E> unionOfLists(List<E> firstList, List< E> secondList, int indexOfFirstList, int indexOfSecondList, List<E> result) {

        //sonucu bu arraylist tutar
        if (secondList.isEmpty()) {
            return firstList;
        } else if (indexOfFirstList == firstList.size()) {
            return result;
        } else if (indexOfSecondList == secondList.size()) {
            indexOfSecondList = 0;
            ++indexOfFirstList;
            unionOfLists(firstList, secondList, indexOfFirstList, indexOfSecondList, result);
        } else {
            if (firstList.get(indexOfFirstList).equals(secondList.get(indexOfSecondList))) {
                if (result.indexOf(firstList.get(indexOfFirstList)) == -1) {
                    result.add(firstList.get(indexOfFirstList));
                }

            } else {
                if (result.indexOf(secondList.get(indexOfSecondList)) == -1) {
                    result.add(secondList.get(indexOfSecondList));
                }
                if (result.indexOf(firstList.get(indexOfFirstList)) == -1) {
                    result.add(firstList.get(indexOfFirstList));
                }
            }

        }
        unionOfLists(firstList, secondList, indexOfFirstList, indexOfSecondList + 1, result);

        return result;
    }

    /**
     * alt kumesi mi diye
     *
     * @return alt kumeyse true doner
     */
    @Override
    public boolean isSubset() {
        return isSubset(list1, list2);
    }

    /**
     * alt kumesi mi diye bakar
     *
     * @param firstList ilk liste
     * @param secondList ikinci liste
     * @param indexOfFirstList ilk listenin indexi
     * @param indexOfSecondList ikinci listenin indexi
     * @return alt kumeyse true doner
     */
    private boolean isSubset(List<E> firstList, List< E> secondList) {

        if (secondList.isEmpty()) {
            return true;
        } else if (isElementOfList(firstList, secondList.get(0))) {
            return isSubset(firstList, secondList.subList(1, secondList.size()));
        } else if (!isElementOfList(firstList, secondList.get(0))) {
            return false;
        }
        return false;
    }

    /**
     * helper fonksiyon
     *
     * @param firstList liste
     * @param element aranan eleman
     * @return varsa true doner
     */
    private boolean isElementOfList(List<E> firstList, E element) {

        if (firstList.isEmpty()) {
            return false;
        } else if (firstList.get(0).equals(element)) {
            return true;
        }
        return isElementOfList(firstList.subList(1, firstList.size()), element);

    }

}
