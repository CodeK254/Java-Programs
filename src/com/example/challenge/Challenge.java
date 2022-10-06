package com.example.challenge;

public class Challenge {
    public static void main(String[] args) {
        for(int a = 0; a < 10; a++){
            for(int b = 0, c = 0; b < a; b++, c += a){
                System.out.print("\t"+c);
            }
            System.out.println("\n");
        }
    }
}
