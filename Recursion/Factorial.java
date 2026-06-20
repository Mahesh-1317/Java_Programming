package Recursion;

import java.util.Scanner;

class Factorial {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = input.nextInt();
        long fact = factorial(n);
        System.out.println("The factorial of given number is "+ fact);
        input.close();
    }

    public static long factorial(int n) {
        if (n == 1) {
            return 1;
        }
        return n *factorial(n-1);
    }
}
