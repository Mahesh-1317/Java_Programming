package Loops;

import java.util.Scanner;

public class ArrayUtility {
    public static int[] inputArray(Scanner input) {
        System.out.print("Enter the size of array: ");
        int size = input.nextInt();
        int[] arr = new int[size];
        int i = 0;
        while (i < size) {
            System.out.print("Enter element no "+ (i+1) + ": ");
            arr[i] = input.nextInt();
            i++;
        }
        return arr;
    }
}