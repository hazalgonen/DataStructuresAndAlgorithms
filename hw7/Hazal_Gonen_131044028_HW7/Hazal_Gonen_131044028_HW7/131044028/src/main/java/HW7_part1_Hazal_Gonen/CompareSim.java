/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HW7_part1_Hazal_Gonen;

import java.util.Comparator;

/**
 *
 * @author hazal
 */
public class CompareSim implements Comparator<Customer> {

    /**
     *
     * @param customer1
     * @param customer2
     * @return
     */
    @Override
    public int compare(Customer customer1, Customer customer2) {

        if (customer1.getPriority() > customer2.getPriority()) {
        
            return -1;
        }
        if (customer1.getPriority() < customer2.getPriority()) {

            return 1;
        }
        if (customer1.getPriority() == customer2.getPriority()) {
          
            return 0;
        }
        return 0;
    }

}
