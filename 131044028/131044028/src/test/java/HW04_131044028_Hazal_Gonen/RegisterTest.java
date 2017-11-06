/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HW04_131044028_Hazal_Gonen;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;


/**
 *
 * @author hazal
 */
public class RegisterTest {
    @Before
    public void setUpClass() {
        System.out.println("\n\n-------------------------------");
        System.out.println(" Test metodu çağrılacak.\n");
    }

    @After
    public void tearDownClass() {
        System.out.println("\n Test metodu bitti.");
        System.out.println("-------------------------------");
    }

    /**
     * registeri get yapar
     *
     * @throws
     * HW04_131044028_Hazal_Gonen.myException.MyArrayIndexOutOfBoundsException
     */
    @Test
    public void testGetRegister() throws myException.MyArrayIndexOutOfBoundsException {
        System.out.println("** getRegister Testi **");
        Register instance = new Register();
        System.out.println(" Yeni bir register olusturdum");
        String result = instance.getRegister();
        System.out.println(" Olusturdugum register : " + result);

    }

    /**
     * register indexini get yapar
     *
     * @throws
     * HW04_131044028_Hazal_Gonen.myException.MyArrayIndexOutOfBoundsException
     */
    @Test
    public void testGetIndexRegister() throws myException.MyArrayIndexOutOfBoundsException {
        System.out.println("** getIndexRegister Testi **");
        Register instance = new Register();
        System.out.println(" Yeni bir register olusturdum");
        int result = instance.getIndexRegister();
        System.out.println(" Olusturdugum registerin indexi : " + result);

    }

    /**
     * register siler
     *
     * @throws
     * HW04_131044028_Hazal_Gonen.myException.MyArrayIndexOutOfBoundsException
     */
    @Test
    public void testDeleted() throws myException.MyArrayIndexOutOfBoundsException {
        System.out.println("** deleted Testi **");
        int in = 0;
        Register instance = new Register();
        System.out.println(" Kullanilan register indexi: " + instance.getUnUsedRegister());
        instance.deleted(instance.getIndexRegister());
        System.out.println(" Silme isleminden sonra kullanilan register indexi: " + instance.getUnUsedRegister());
    }

    /**
     * kullanilmayan register indexini verir
     *
     * @throws
     * HW04_131044028_Hazal_Gonen.myException.MyArrayIndexOutOfBoundsException
     */
    @Test
    public void testGetUnUsedRegister() throws myException.MyArrayIndexOutOfBoundsException {
        System.out.println("** getUnUsedRegister Testi **");
        Register instance = new Register();

        int result = instance.getUnUsedRegister();
        System.out.println(" Kullanilmayan register indexi: " + result);
    }

    /**
     * registeri set
     * @throws HW04_131044028_Hazal_Gonen.myException.MyArrayIndexOutOfBoundsException
     */
    @Test
    public void testSetRegister() throws myException.MyArrayIndexOutOfBoundsException {
        System.out.println("** setRegister Testi **");

        Register instance = new Register();
        instance.setRegister();
    }

}
