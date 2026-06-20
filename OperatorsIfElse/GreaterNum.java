package OperatorsIfElse;

import java.util.Scanner;

public class GreaterNum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter first number");
        int a = input.nextInt();
        System.out.println("Enter second number");
        int b = input.nextInt();
        System.out.println("Enter third number");
        int c = input.nextInt();

        if (a >= b && a >= c) {
            System.out.println(a + "is the greatest number");
        } else if (b >= c && b >= a) {
            System.out.println(b + "is the greatast number");
        } else {
            System.out.println(c + "is the greatast number");
        }
        input.close();
    }
}
