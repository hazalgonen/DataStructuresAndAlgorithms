/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HW7_part2_Hazal_Gonen;

import java.util.Hashtable;

/**
 *
 * @author hazal
 */
public class Cards {

    //ilk barkod "yok"
    protected String barkod = "yok";
    
    //cardid kisilere ozel cardid dir
    protected int cardID = -1;

    
    /**
     * equals metodunu override yaptim
     * @param o karsilastirilacak obje 
     * @return esitse true doner
     */
    @Override
    public boolean equals(Object o) {

        if (cardID != -1) {
            if (o instanceof StudentCards) {
                StudentCards st = (StudentCards) o;
                if (this.cardID == st.cardID) {
                    return true;
                }
            }
            if (o instanceof AcademicCards) {
                AcademicCards ac = (AcademicCards) o;
                if (this.cardID == ac.cardID) {
                    return true;
                }
            }
        }
        return false;
    }

    /**
     * hashcode metodunu override yaptım
     * hashlemeyi cardidsine gore yapiyorum
     * @return 
     */
    @Override
    public int hashCode() {

        int hashCode = cardID;

        return hashCode;
    }

    /**
     * id'yi set eder
     * @param id 
     */
    public void setID(int id) {
        this.cardID = id;
    }
}
