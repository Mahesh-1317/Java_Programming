package OperatorsIfElse;

import java.util.Scanner;

public class ChecktheNum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number");
        int a = input.nextInt();

        if(a>0) {
            System.out.println("Postive");
        } else {
            System.out.println("Negative");
        }
        input.close();
    }
}
