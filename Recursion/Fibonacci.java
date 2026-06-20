package Recursion;

import java.util.Scanner;

class Fibonacci {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number of elements to be printed");
        int n = input.nextInt();

        for(int i = 1; i <= n; i++) {
            System.out.println(fib(i) + " ");
        }
        input.close();
    }

    public static int fib(int position) {
        if (position == 1) {
            return 0;
        } 
        if (position == 2) {
            return 1;
        }
        return fib(position - 1) + fib(position - 2);
    }
}
