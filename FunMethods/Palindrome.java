package FunMethods;

import java.util.Scanner;

public class Palindrome {
    public static boolean isPalindrome(int n) {
        return n == reverse(n);
    }
    public static int reverse(int n) {
        int newNum = 0;
        while (n > 0) {
            int ld = n % 10;
            newNum = newNum * 10 + ld;
            n /= 10;
        }
        return newNum;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = input.nextInt();
        boolean isPalindrome = isPalindrome(n);

        if (isPalindrome) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }
        input.close();
    }
}