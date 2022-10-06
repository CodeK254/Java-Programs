package com.example.breaknested;

public class BreakNested {
    public static void main(String[] args) {
        outer: for (int a = 0; a < 10; a++){
            inner: for (int b = 0; b < 10; b++){
                System.out.println("A = "+a+", B = "+b);
                if(a == 5){
                    break outer;
                }

                if(b == 5){
                    break inner;
                }
            }
            System.out.println("\nTake: "+(a+1));
        }
    }
}
