package Array;

import java.util.Scanner;

class ArrayUtility {
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
    

    public static void displayArray(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            System.out.print(arr[i] + " ");
            i++;
        }
    }
}