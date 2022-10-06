package com.example;
import java.util.Scanner;

public class dayone{
    public static int maximum(int []array_name){
        int maxnum = array_name[5];

        for(int value : array_name){
            if(value > maxnum){
                array_name[5] = value;
            }
        }

        return array_name[5];
    }
    public static void main(String args[]){
        int [] student_marks = {98, 56, 78, 42, 31, 78, 35};

        int top_score = maximum(student_marks);

        System.out.println("The highest score is: "+top_score);
    }
}
