/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HW7_part1_Hazal_Gonen;

import java.sql.Time;
import java.util.Date;

/**
 *
 * @author hazal
 */
public class Customer {

    private Time arrivalTime;
    private int priority;
    private int serviceTime;
    public Time exitTime;

    /**
     * constructor
     * @param arrivalTime
     * @param serviceTime
     * @param priority 
     */
    public Customer(Time arrivalTime, int serviceTime, int priority) {
        this.arrivalTime = arrivalTime;
        this.priority = priority;
        this.serviceTime = serviceTime;

        Time s = new Time(0, serviceTime, 0);
        int hour = arrivalTime.getHours() + s.getHours();

        int min = arrivalTime.getMinutes() + s.getMinutes();

        int sec = arrivalTime.getSeconds() + s.getSeconds();
        exitTime = new Time(hour, min, sec);
    }

    public Time getArrivalTime() {
        return arrivalTime;
    }

    public int getServiceTime() {
        return serviceTime;
    }

    public int getPriority() {
        return priority;
    }

    public void setArrivalTime(Time arrivalTime) {
        this.arrivalTime = arrivalTime;
    }

    public void setServiceTime(int serviceTime) {
        this.serviceTime = serviceTime;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }
}
