package OperatorsIfElse;

import java.util.Scanner;

public class MinTernary {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first number ");
        int a = input.nextInt();
        System.out.print("Enter second number ");
        int b = input.nextInt(); 
        
        MinTernary num = new MinTernary();
        int min = num.min(a,b);
        System.out.println("Minimum no is: "+ min);
        input.close();
    }

    public int min(int a,int b) {
        return a < b ? a : b;
    }
}
