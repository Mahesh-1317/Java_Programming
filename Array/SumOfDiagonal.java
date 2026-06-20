package Array;

import java.util.Scanner;

public class SumOfDiagonal {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[][] arr = Arr2Utility.inputArray(input);
        
        int SoD = sumOfDaigonals(arr);
        System.out.println("Sum of array is: " + SoD);
    }
    public static int sumOfDaigonals(int[][] arr) {
        int ls = sumOfLD(arr);
        int rs = sumOfRD(arr);
        int sum = ls + rs;
        if(arr.length % 2 != 0) {
            int idx = arr.length / 2;
            sum -= arr[idx][idx];
        }
        return sum;
    }
    public static int sumOfLD(int[][] arr) {
        int sum = 0;
        int i = 0;
        while (i < arr.length) {
            sum += arr[i][i];
            i++;
        }
        return sum;
    }
    public static int sumOfRD(int[][] arr) {
        int sum = 0;
        int i = 0;
        while (i < arr.length) {
            int col = arr.length - 1 - i;
            sum += arr[i][col];
            i++;
        }
        return sum;
    }
}
