package Array;

import java.util.Scanner;

public class Arr2Utility {
    public static int[][] inputArray(Scanner input) {
        System.out.print("Enter the number of rows: ");
        int rows = input.nextInt();
        System.out.print("Enter the number of columns: ");
        int columns = input.nextInt();
        System.out.println();

        int[][] arr = new int[rows][columns];
        int i = 0;
        while (i < rows) {
            int j = 0;
            while (j < columns) {
                System.out.print("Enter element of row: " +(i+1) +", column: " +(j+1) +": ");
                arr[i][j] = input.nextInt();
                j++;
            }
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
