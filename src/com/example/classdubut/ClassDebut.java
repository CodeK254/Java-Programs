package com.example.classdubut;
import java.util.*;

class Area{
    public double calcArea(double height, double base){
        return 0.5 * base * height;
    }

    public static int calcArea(int length, int width){
        return length * width;
    }

    public static double calcArea(double height, double p_length_one, double p_length_two){
        return 0.5 * (p_length_one + p_length_two) * height;
    }

    public static double calcArea(double radius){
        return 22/7 * radius * radius;
    }
}

public class ClassDebut {
    public static void main(String[] args) {
        String []data = {"Square / Rectangle", "Trapezium", "Triangle", "Circle"};

        int length, width, choose;
        double height, base, radius, p_one, p_two, answer;

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the Area field you want to calculate: ");
        System.out.print("\n1). Square / Rectangle");
        System.out.print("\n2). Trapezium");
        System.out.print("\n3). Triangle");
        System.out.print("\n4). Circle\n\n");

        choose = scan.nextInt();
        Area objOne = new Area();

        try{
            switch (choose){
                case 1:
                    System.out.print("\nLength: ");
                    length = scan.nextInt();
                    System.out.print("\nWidth: ");
                    width = scan.nextInt();
                    answer = objOne.calcArea(length, width);
                    break;

                case 2:
                    System.out.print("\nParallel length one: ");
                    p_one = scan.nextDouble();
                    System.out.print("\nParallel length two: ");
                    p_two = scan.nextDouble();
                    System.out.print("\nVertical Height: ");
                    height = scan.nextDouble();
                    answer = objOne.calcArea(height, p_one, p_two);
                    break;

                case 3:
                    System.out.print("\nEnter height: ");
                    height = scan.nextDouble();
                    System.out.print("\nEnter base: ");
                    base = scan.nextDouble();
                    answer = objOne.calcArea(height, base);
                    break;

                case 4:
                    System.out.print("\nRadius of circle: ");
                    radius = scan.nextDouble();
                    answer = objOne.calcArea(radius);
                    break;

                default:
                    System.out.println("\nInvalid input. Choose a number between 1 - 4 next time.");
                    answer = 0;
                    break;
            }

            System.out.println("\nThe area of the "+data[choose-1]+" is "+answer);
        } catch(Exception e){
            System.out.println("\nError: "+e);
        }
    }

}
