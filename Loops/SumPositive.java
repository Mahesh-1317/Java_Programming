package Loops;

import java.util.Scanner;

public class SumPositive {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] arr = ArrayUtility.inputArray(input);

        int sum = 0;
        for(int n : arr) {
            if(n < 0) {
                continue;
            }
            sum += n;
        }
        System.out.println("Sum of positive numbers is: " + sum);
    }
}
