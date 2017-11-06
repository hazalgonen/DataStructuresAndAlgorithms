/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HW04_131044028_Hazal_Gonen;


/**
 *
 * @author hazal
 */
public class HW04_131044028_Hazal_Gonen {

    public static void main(String[] args) throws Exception {

        Expressions exp = new Expressions("input.txt");

        exp.execute();
        exp.convertInfixToPostfix();

        exp.convertPostfixToAssembly();
    }
}
