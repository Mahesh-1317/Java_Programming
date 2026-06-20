package OperatorsIfElse;

import java.util.Scanner;

public class AreaofTriangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter base of triangle: ");
        double B = input.nextDouble();
        System.out.print("Enter height of triangle: ");
        double H = input.nextDouble();

        double A = 0.5*B*H;
        System.out.print("Area of triangle is: " + A);
        input.close();
    }
    
}