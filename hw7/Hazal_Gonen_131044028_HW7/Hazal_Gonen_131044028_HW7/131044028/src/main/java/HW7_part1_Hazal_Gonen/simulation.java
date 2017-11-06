/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HW7_part1_Hazal_Gonen;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.security.AllPermission;
import java.sql.Time;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.StringTokenizer;

/**
 *
 * @author hazal
 */
public class simulation extends myException {

    private Time startTime;
    CompareSim comp;

    private myPriorityQueue<Customer> customers;

    private ArrayList<Customer> all = new ArrayList();

    /**
     * constructor
     *
     * @param txt
     * @throws HW7_part1_Hazal_Gonen.myException.MyIOException
     * @throws ParseException
     * @throws InterruptedException
     */
    public simulation(String txt) throws MyIOException, ParseException, InterruptedException {

        comp = new CompareSim();
        customers = new myPriorityQueue(comp);
        readTxt(txt);
        System.out.println(customers.size());
        startTime = new Time(all.get(0).getArrivalTime().getHours(), all.get(0).getArrivalTime().getMinutes(), all.get(0).getArrivalTime().getSeconds());

        runSimulation();
    }

    /**
     * simulation calisir
     *
     * @return
     */
    private int runSimulation() {

        // customers.enqueue(all.get(0));
        int next = 0;
        Time tot = new Time(all.get(all.size() - 1).getArrivalTime().getHours() - all.get(0).getArrivalTime().getHours(), all.get(all.size() - 1).getArrivalTime().getMinutes() - all.get(0).getArrivalTime().getMinutes(), all.get(all.size() - 1).getArrivalTime().getSeconds() - all.get(0).getArrivalTime().getSeconds());
        Customer currentCustomer = null;
        Customer old;
        Time totalservis = new Time(0, 0, 0);
        /* for (int i = 1; i < all.size(); ++i) {
         totalservis.setMinutes(tot.getMinutes()+all.get(i).getServiceTime());
         }
        
         if(tot.compareTo(totalservis)<0){
         // tot=startTime;
         //  tot.setMinutes(totalservis.getMinutes());
         }
         */
        Time wait = new Time(startTime.getHours(), startTime.getMinutes(), startTime.getSeconds());
        wait.setMinutes(all.get(0).getServiceTime() + wait.getMinutes());
        Time end = new Time(all.get(all.size() - 1).getArrivalTime().getHours(), all.get(all.size() - 1).getArrivalTime().getMinutes() - 1, all.get(all.size() - 1).getArrivalTime().getSeconds());
        while ((startTime.compareTo(end)) < 0 && all.get(next).getArrivalTime().compareTo(end) <= 0) {

            System.out.println("*************************");
            // while(customers)
            if (customers.isEmpty()) {
                customers.enqueue(all.get(next));
                //     System.out.println("*eklendi" + all.get(next).getArrivalTime());
                currentCustomer = customers.dequeue();

            } else {
                currentCustomer = customers.peek();
            }

            int nextnext = next + 1;

            // System.out.println(wait.getMinutes() + all.get(nextnext).getArrivalTime().getMinutes());
            while (wait.compareTo(all.get(nextnext).getArrivalTime()) >= 0) {
                customers.enqueue(all.get(nextnext));

                //       System.out.println("eklendi" + all.get(nextnext).getArrivalTime());
                nextnext++;

            }
            //  System.out.println(wait);
            /* if ((wait.compareTo(end)) < 0) {
             wait.setMinutes(wait.getMinutes() + customers.peek().getServiceTime());
             } else {
             break;
             }*/
            customers.dequeue();

            System.out.println("Siradaki : " + currentCustomer.getArrivalTime());
            next++;
            startTime.setMinutes(startTime.getMinutes() + 1);

        }

        return 1;
    }

    /**
     * okuma yapilir
     * @param path
     * @throws HW7_part1_Hazal_Gonen.myException.MyIOException
     * @throws ParseException
     * @throws InterruptedException 
     */
    private void readTxt(String path) throws MyIOException, ParseException, InterruptedException {

        int serviceTime = 0;
        int priority = 0;
        try {
            //dosya okuma
            File file = new File(path);
            BufferedReader reader = new BufferedReader(new FileReader(file));

            //ilk satir okundu
            String firstSatir = reader.readLine();
            String satir = reader.readLine();

            while (satir != null) {
                //  System.out.println("okudu :" + satir);
                //her satir context'e eklendi
                StringTokenizer dosyaTokens = new StringTokenizer(satir);

                //hala parcalanabiliyor mu?
                while (dosyaTokens.hasMoreTokens()) {

                    //nextToken stringine bir sonraki eleman atanir
                    String nextToken = dosyaTokens.nextToken();

                    //   System.out.println(nextToken);
                    int hour = Integer.parseInt(nextToken.substring(0, 2));
                    int minute = Integer.parseInt(nextToken.substring(3, 5));

                    Time a = new Time(hour, minute, 0);

                    nextToken = dosyaTokens.nextToken();
                    serviceTime = Integer.parseInt(nextToken);

                    nextToken = dosyaTokens.nextToken();
                    if (nextToken.equals("Customer")) {
                        priority = Integer.parseInt(dosyaTokens.nextToken());
                        //      System.out.println("priority: " + priority);
                    }

                    //     System.out.println("time: " + a + " serviceTime" + serviceTime + " Customer" + priority);
                    Customer customer = new Customer(a, serviceTime, priority);
                    all.add(customer);

                }
                satir = reader.readLine();

            }
        } catch (IOException | NumberFormatException e) {
            if (e instanceof IOException) {
                throw new MyIOException("Dosya okunamadi");

            }

        }
    }
}
