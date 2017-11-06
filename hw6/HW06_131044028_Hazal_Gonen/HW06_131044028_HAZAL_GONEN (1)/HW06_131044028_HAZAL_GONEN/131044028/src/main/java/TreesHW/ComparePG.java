/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TreesHW;
import java.util.Comparator;

/**
 *
 * @author hazal
 */
public class ComparePG implements Comparator<Integer> {

    /**
     *
     * @param t
     * @param t1
     * @return
     */
    @Override
    public int compare(Integer t, Integer t1) {
        if (t > t1) {
            return 1;
        } else if (t < t1) {
            return -1;
        }
        return 0;
    }

}
