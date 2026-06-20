package OperatorsIfElse;

import java.util.Scanner;

public class BitwiseAnd {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = input.nextInt();

        if((num & 1) == 1) {
            System.out.println("Number is odd");
        } else {
            System.out.println("Number is even");
        }
        input.close();
    }
}
