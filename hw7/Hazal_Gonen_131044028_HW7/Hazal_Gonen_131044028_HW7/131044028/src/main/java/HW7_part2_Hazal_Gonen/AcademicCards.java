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
public class AcademicCards extends Cards {

    /**
     * costructor
     * @param barkod_ 
     */
    public AcademicCards(String barkod_) {

        if (Integer.parseInt(barkod_) > 5000 && Integer.parseInt(barkod_) < 15000) {
            this.barkod = barkod_;
        } else {
            System.out.println("Yanlis academic barkod girildi.");
        }

    }
}
