/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HW7_part2_Hazal_Gonen;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Hashtable;
import java.util.StringTokenizer;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author hazal
 */
public class MealService {

    //bu hash asistan ve combine kard tutar
    Hashtable table_ = new Hashtable();
    
    //bu hash kardlari ve ait olduklari idleri tutar
    Hashtable allCard = new Hashtable();

    /**
     * constructor
     *
     * @throws IOException
     */
    public MealService() throws IOException {

        readTxt("data3.txt");
    }

    /**
     * dosyadaki verileri okur ve hashtable'i doldurur
     *
     * @param path
     * @throws IOException
     */
    private void readTxt(String path) throws IOException {

        //dosya okuma
        File file = new File(path);
        BufferedReader reader;
        try {
            int id = 0;
            reader = new BufferedReader(new FileReader(file));

            //ilk satir okundu
            String satir = reader.readLine();

            while (satir != null) {

                //her satir context'e eklendi
                StringTokenizer dosyaTokens = new StringTokenizer(satir);

                //hala parcalanabiliyor mu?
                while (dosyaTokens.hasMoreTokens()) {

                    //parcalama islemi yapiliyor
                    String name = dosyaTokens.nextToken(); //isim
                    String stBarkod = dosyaTokens.nextToken();//studentbarkod
                    String acBarkod = dosyaTokens.nextToken();//academicbarkod

                    StudentCards studentCards1 = new StudentCards(stBarkod);
                    AcademicCards academicCards1 = new AcademicCards(acBarkod);
                    //ikisinden combine kard olusturuldu
                    CombineCards combine = new CombineCards(academicCards1, studentCards1);
                    ResearchAsistant asistant = new ResearchAsistant(name);
                    System.out.println("name:  " + name + "   studentCard:" + stBarkod + "   academicCard:" + acBarkod);

                    //butun kardlari ekliyorum v e burada id tutarak her kartin kisiye ozel olmasini sagladim
                    allCard.put(studentCards1.barkod, id);
                    allCard.put(academicCards1.barkod, id);

                    //asistan ve combine kart hashlemesi yapildi
                    table_.put(combine, asistant);

                }
                ++id;
                satir = reader.readLine();

            }

        } catch (FileNotFoundException ex) {
            ex.getMessage();
        }

    }

    /**
     * TEST
     */
    public void test() {

        System.out.println("**********************************************************");
        System.out.println("PART1 TEST");

        StudentCards studentCards1 = new StudentCards("1002");
        AcademicCards academicCards1 = new AcademicCards("7003");
        //     

        System.out.println("**********************************************************");
        System.out.println("Iki kart olusturdum");

        System.out.println("Ilkinin barkodu:    " + studentCards1.barkod);

        System.out.println("Ikincinin barkodu:  " + academicCards1.barkod);

        System.out.println("Ikisinin barkodu ayni kisiye mi ait?");

        if (allCard.containsKey(studentCards1.barkod) && allCard.containsKey(academicCards1.barkod)) {
            studentCards1.setID((int) allCard.get(studentCards1.barkod));
            academicCards1.setID((int) allCard.get(academicCards1.barkod));
            if (((Cards) studentCards1).equals((Cards) academicCards1)) {
                System.out.println("true");
                CombineCards c = new CombineCards(academicCards1, studentCards1);
                ResearchAsistant researchAsistant = (ResearchAsistant) table_.get(c);
                System.out.println("Name: " + researchAsistant.getName());
            } else {
                System.out.println("false");
            }
        } else {
            System.out.println("false");
        }

        System.out.println("**********************************************************");
        StudentCards studentCards2 = new StudentCards("1001");
        AcademicCards academicCards2 = new AcademicCards("5041");

        System.out.println("Iki kart olusturdum");

        System.out.println("Ilkinin barkodu:    " + studentCards2.barkod);

        System.out.println("Ikincinin barkodu:  " + academicCards2.barkod);

        if (allCard.containsKey(studentCards2.barkod) && allCard.containsKey(academicCards2.barkod)) {
            studentCards2.setID((int) allCard.get(studentCards2.barkod));
            academicCards2.setID((int) allCard.get(academicCards2.barkod));
            if (((Cards) studentCards2).equals((Cards) academicCards2)) {
                System.out.println("true");
                CombineCards c = new CombineCards(academicCards2, studentCards2);
                ResearchAsistant researchAsistant = (ResearchAsistant) table_.get(c);
                System.out.println("Name: " + researchAsistant.getName());
            } else {
                System.out.println("false");
            }
        } else {
            System.out.println("false");
        }
        System.out.println("**********************************************************");

        StudentCards studentCards3 = new StudentCards("1001");
        AcademicCards academicCards3 = new AcademicCards("5001");
        System.out.println("**********************************************************");

        System.out.println("Iki kart olusturdum");

        System.out.println("Ilkinin barkodu:    " + studentCards3.barkod);

        System.out.println("Ikincinin barkodu:  " + academicCards3.barkod);
        if (allCard.containsKey(studentCards3.barkod) && allCard.containsKey(academicCards3.barkod)) {
            studentCards3.setID((int) allCard.get(studentCards3.barkod));
            academicCards3.setID((int) allCard.get(academicCards3.barkod));
            if (((Cards) studentCards3).equals((Cards) academicCards3)) {
                System.out.println("true");
                CombineCards c = new CombineCards(academicCards3, studentCards3);
                ResearchAsistant researchAsistant = (ResearchAsistant) table_.get(c);
                System.out.println("Name: " + researchAsistant.getName());
            } else {
                System.out.println("false");
            }
        } else {
            System.out.println("false");
        }

        System.out.println("**********************************************************");
        StudentCards studentCards4 = new StudentCards("1079");
        AcademicCards academicCards4 = new AcademicCards("5018");
        System.out.println("Iki kart olusturdum");
        System.out.println("Ilkinin barkodu:    " + studentCards4.barkod);

        System.out.println("Ikincinin barkodu:  " + academicCards4.barkod);
        if (allCard.containsKey(studentCards4.barkod) && allCard.containsKey(academicCards4.barkod)) {
            studentCards4.setID((int) allCard.get(studentCards4.barkod));
            academicCards4.setID((int) allCard.get(academicCards4.barkod));
            if (((Cards) studentCards4).equals((Cards) academicCards4)) {
                System.out.println("true");
                CombineCards c = new CombineCards(academicCards4, studentCards4);
                ResearchAsistant researchAsistant = (ResearchAsistant) table_.get(c);
                System.out.println("Name: " + researchAsistant.getName());
            } else {
                System.out.println("false");
            }
        } else {
            System.out.println("false");
        }

    }

}
