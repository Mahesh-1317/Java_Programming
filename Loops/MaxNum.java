package Loops;

import java.util.Scanner;

public class MaxNum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] arr = ArrayUtility.inputArray(input);

        int max = Integer.MIN_VALUE;
        for(int n: arr) {
            if (max < n) {
                max = n;
            }
        }
        System.out.println("Maximum number is "+ max);
        input.close();
    }
}
