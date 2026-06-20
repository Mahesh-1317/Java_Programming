package Array;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] arr = ArrayUtility.inputArray(input);
        boolean isPldrm = isPalindrome(arr);

        if (isPldrm) {
            System.out.print("Array is palindrome");
        } else {
            System.out.print("Array is not palindrome");
        }
    }

    public static boolean isPalindrome(int[] arr) {
        int i = 0;
        while (i < arr.length / 2) {
            if (arr[i] != arr[arr.length - 1 - i]) {
                return false;
            }
            i++;
        }
        return true;
    }
}
