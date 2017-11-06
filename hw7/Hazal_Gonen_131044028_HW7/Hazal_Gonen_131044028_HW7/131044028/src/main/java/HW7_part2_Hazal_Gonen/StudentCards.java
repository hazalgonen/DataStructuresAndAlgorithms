/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HW7_part2_Hazal_Gonen;


/**
 *
 * @author hazal
 */
public class StudentCards extends Cards {

   

    /**
     * constructor
     * @param barkod_ 
     */
    public StudentCards(String barkod_) {

        if (barkod_.equals("yok") || ((Integer.parseInt(barkod_)) >= 1000) && ((Integer.parseInt(barkod_)) <= 5000)) {
            this.barkod = barkod_;
        } else {
            System.out.println("Yanlis studnt barkod girildi.");
        }
    }

}
