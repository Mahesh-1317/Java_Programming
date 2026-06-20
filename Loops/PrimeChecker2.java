package Loops;

import java.util.Scanner;

public class PrimeChecker2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = input.nextInt();
        System.out.println("Number is " +
            (isPrime(n) ? "Prime" : "Not Prime"));
            input.close();
    }

    public static boolean isPrime(int n) {
        for(int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
    
}
