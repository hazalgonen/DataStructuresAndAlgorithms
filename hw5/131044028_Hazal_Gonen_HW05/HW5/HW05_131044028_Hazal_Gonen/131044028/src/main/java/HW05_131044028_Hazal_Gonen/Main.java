/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HW05_131044028_Hazal_Gonen;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 *
 * @author hazal
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        ////////////////////////////////////////////////
        int num_of_disks = 3;
        Stack<Integer> src = new Stack<>();
        Stack<Integer> dest = new Stack<>();
        Stack<Integer> aux = new Stack<>();

        TowersOfHanoi t = new TowersOfHanoi();
        t.TowerOfHanoi(num_of_disks, src, aux, dest);

        ////////////////////////////////////////////////
        LinkedListRec<Integer> a = new LinkedListRec<>();

        a.add(6);
        a.add(6);
        a.add(3);
        a.add(7);
        a.add(8);
        a.add(6);
        a.add(6);
        a.add(6);
        a.add(6);
        a.add(2);
        a.add(6);

        System.out.println("listenin ilk hali");
        System.out.println(a.toString());
        a.remove(6);
        System.out.println("listeden 6 silindikten sonra");
        System.out.println(a.toString());

        ////////////////////////////////////////////////
        List<Integer> n = new ArrayList<>();
        n.add(1);
        n.add(3);
        n.add(3);
        n.add(4);
        n.add(10);

        System.out.println("----INTERSECTION----");
        System.out.println("Ilk liste:");
        System.out.println(n);
        List<Integer> m = new ArrayList<>();
        m.add(1);
        m.add(3);
        m.add(4);
        m.add(6);
        System.out.println("Ikinci liste:");
        System.out.println(m);
        System.out.println("Intersection liste:");
        ListsOperation op = new ListsOperation(n, m);
        System.out.println(op.intersectionOfLists());

        ////////////////////////////////////////////////
        System.out.println("----   UNION    ----");

        System.out.println("Union liste:");
        System.out.println(op.unionOfLists());

        ////////////////////////////////////////////////
        System.out.println("2. liste 1. listenin");
        if (op.isSubset()) {
            System.out.println("altkumesidir");
        } else {
            System.out.println("altkumesi degildir");
        }
    }

}
