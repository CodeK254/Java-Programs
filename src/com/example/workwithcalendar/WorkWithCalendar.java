package com.example.workwithcalendar;
import java.util.*;

public class WorkWithCalendar {
    public static void main(String[] args) {
        String []months = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
        GregorianCalendar gc = new GregorianCalendar();
        System.out.println("\nDate => "+gc.get(Calendar.DATE)+"th "+months[gc.get(Calendar.MONTH)]+" year "+gc.get(Calendar.YEAR));

        System.out.println("\nTime => "+gc.get(Calendar.HOUR)+":"+gc.get(Calendar.MINUTE)+":"+gc.get(Calendar.SECOND));

        System.out.println("\nLeap year: "+gc.isLeapYear(gc.get(Calendar.YEAR)));

        // try {
        //     System.out.println("Date now: " + new Date());
        //     Thread.sleep(3000);
        //     System.out.println("Date now: " + new Date());
        // } catch (Exception e){
        //     System.out.println("Error: "+e.toString());
        // }
    }
}
