/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HW7_part1_Hazal_Gonen;

import HW7_part2_Hazal_Gonen.MealService;
import java.io.IOException;
import java.text.ParseException;
import java.util.ArrayList;

/**
 *
 * @author hazal
 */
public class HW07_131044028_Hazal_Gonen {

    public static void main(String[] args) throws myException.MyIOException, ParseException, IOException, InterruptedException {
        MealService meal= new MealService();
        meal.test();
        simulation si= new simulation("data1.txt");
        System.out.println("**********************************************");
        simulation sim1= new simulation("data2.txt");
        
    }

}
