package Recursion;

import java.util.Scanner;

class Palindrom {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a string to be checked");
        String str = input.next();
        System.out.println("String is "
                +((isPalindrome(str) ? "Palindrom" : "Not Palindrome")));
        input.close();

    }
    public static boolean isPalindrome(String str) {
        if (str.length() <= 1) {
            return true;
        }
        int lastPos = str.length() - 1; 
        if (str.charAt(0) != str.charAt(lastPos)) {
            return false;
        }
        String newStr = str.substring(1, lastPos);
        return isPalindrome(newStr);
    }
}
