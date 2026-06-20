package OperatorsIfElse;

import java.util.Scanner;

public class AbsoluteTernary {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = input.nextInt();
 
        int result = num >= 0 ? num : -num;
        System.out.println(result);
        input.close();
    }
}
