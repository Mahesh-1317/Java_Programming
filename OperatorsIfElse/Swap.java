package OperatorsIfElse;

import java.util.Scanner;

public class Swap {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the value of a: ");
        int a = input.nextInt();
        System.out.println("Enter the value of b: ");
        int b = input.nextInt();
        
        int c = a;
        a = b;
        b = c;
        System.out.println("After swaping");
        System.out.println("Value of a is: " + a);
        System.out.println("Value of b is: " + b);
        input.close();
    }
}
