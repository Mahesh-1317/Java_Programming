package FunMethods;

import java.util.Scanner;

public class Fibonacci {
    public static void Fib(int n) {
        if(n < 0) return;
        System.out.print("0 ");
        if(n == 0) return;
        System.out.print("1 ");

        int first = 0,second = 1;
        while (first  + second <= n) {
            int third = first + second;
            System.out.print(third + " ");
            first = second;
            second = third;
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number up to which you want to print the fibonacci series");
        int n = input.nextInt();
        Fib(n);
        input.close();
    }
}
