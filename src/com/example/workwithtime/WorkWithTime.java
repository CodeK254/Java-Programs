package com.example.workwithtime;
import java.text.SimpleDateFormat;
import java.util.Scanner;
import java.util.Date;

public class WorkWithTime {
    public static void register(Date date){
        Scanner myScanner = new Scanner(System.in);
        String fname, lname, reg_no, grade;
        int age;
        double score;

        System.out.println("Enter your first name: ");
        fname = myScanner.nextLine();

        System.out.println("Enter your last name: ");
        lname = myScanner.nextLine();

        System.out.println("Enter your registration number: ");
        reg_no = myScanner.nextLine();

        System.out.println("Enter your last attained grade: ");
        grade = myScanner.nextLine();

        System.out.println("Enter your last attained marks: ");
        score = myScanner.nextDouble();

        System.out.println("Enter your age: ");
        age = myScanner.nextInt();

        //---------------Printing Student Data--------------------
        System.out.println("\nStudent Data: \n");
        System.out.println("Names: "+fname.concat(" "+lname));
        System.out.println("Reg_No: "+reg_no);
        System.out.println("Grade - Score: "+grade.concat(" - "+score));
        System.out.println("Aged: "+age);
        System.out.println("\nRegistration Date is on "+date);
    }
    public static void main(String[] args) {
        Date date_now = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("dd MM yyyy HH:mm:ss z");

        register(date_now);
    }
}
