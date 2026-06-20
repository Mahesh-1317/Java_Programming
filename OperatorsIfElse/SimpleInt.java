package OperatorsIfElse;

import java.util.Scanner;

public class SimpleInt {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter principle amount: ");
        float P = input.nextFloat();
        System.out.print("Enter rate: ");
        float R = input.nextFloat();
        System.out.print("Enter time: ");
        float T = input.nextFloat();

        float si = (P*R*T)/100;
        System.out.print("The simple interest is: " + si);
        input.close();
    }
}
