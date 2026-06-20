package OperatorsIfElse;

import java.util.Scanner;

public class OddEvenTernary {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = input.nextInt();

        String result = num % 2 == 0 ? "Even" : "Odd";
        System.out.println("Number is "+ result);
        input.close();
    }
}
