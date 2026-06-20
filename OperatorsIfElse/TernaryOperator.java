package OperatorsIfElse;

import java.util.Scanner;

public class TernaryOperator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first number ");
        int a = input.nextInt();
        System.out.print("Enter second number ");
        int b = input.nextInt();

        // int greaterNum;
        // if (a > b) {
        //     greaterNum = a;
        // } else {
        //     greaterNum = b;
        // }

        int greaterNum = a > b ? a : b;
        System.out.println(greaterNum + " is the greatest number");
        input.close();
    }
}
