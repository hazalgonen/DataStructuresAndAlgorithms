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
public class CombineCards {

    //academic card
    private AcademicCards academicCard;
    //studentcard
    private StudentCards studentCard;
    
    private int combine = -1;

    /**
     * constructor iki karti combinliyor
     * @param academicCard
     * @param studentCard 
     */
    public CombineCards(AcademicCards academicCard, StudentCards studentCard) {
        this.academicCard = academicCard;
        this.studentCard = studentCard;

    }

    /**
     * equals metodu override yapildi
     * @param o
     * @return 
     */
    @Override
    public boolean equals(Object o) {
      
        if (o instanceof CombineCards) {
            CombineCards onew = (CombineCards) o;

            if (combine == onew.combine) {
                return true;
            }
        }
        return false;
    }

    /**
     * hashlemeyi iki kart idsinin barkodlarinin hashcodelarini 31 ile carpip topluyorum
     * @return 
     */
    @Override
    public int hashCode() {
        int hashCode = 31 * academicCard.barkod.hashCode() + 31 * studentCard.barkod.hashCode();
        combine=hashCode;
        return hashCode;
    }
}
