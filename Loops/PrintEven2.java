package Loops;

import java.util.Scanner;

public class PrintEven2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] arr = ArrayUtility.inputArray(input);

        for(int n : arr) {
            if (n % 2 != 0) {
                continue;
            }
            System.out.println(n);
        }
    }
}
