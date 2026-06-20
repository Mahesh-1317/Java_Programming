package FunMethods;

import java.util.Scanner;

public class Prime {
    public static boolean isPrime(int n) {
        int i = 2;
        while (i < n) {
            if(n % i == 0) {
                return false;
            }
            i++;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = input.nextInt();

        boolean isPrime = isPrime(n);
        if (isPrime) {
            System.out.println("It is a prime number");
        } else {
            System.out.println("It is not a prime number");
        }
        input.close();
    }
}
