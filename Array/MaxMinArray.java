package Array;

import java.util.Scanner;

public class MaxMinArray {
    public static int Max(int[] arr) {
        int max = arr[0];
        int i = 0;
        while (i < arr.length) {
            if(max < arr[i]){
                max = arr[i];
            }
            i++;
        }
        return max;
    }
    public static int Min(int[] arr) {
        int min = 99999;
        int i = 0;
        while (i < arr.length) {
            if(min > arr[i]){
                min = arr[i];
            }
            i++;
        }
        return min;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the size of array: ");
        int size = input.nextInt();

        int arr[] = new int[size];
        int i = 0;
        while (i < size) {
            System.out.print("Enter element no "+(i+1)+": ");
            arr[i] = input.nextInt();
            i++;
        }
        int max = Max(arr);
        int min = Min(arr);
        System.out.println("Minimum element in array is " + min);
        System.out.print("Maximum element in array is " + max);
        input.close();
    }
}
