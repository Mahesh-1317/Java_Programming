package Array;

import java.util.Scanner;

class AvgSum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int size = input.nextInt();
        int[] arr = new int[size];
        int i=0;
        while (i < size) {
            System.out.print("Enter element no "+(i+1) + ": ");
            arr[i] = input.nextInt();
            i++;
        }
        int sum = sum(arr);
        double avg = avg(arr);
        System.out.println("Sum of numbers is: "+ sum);
        System.out.print("Average of numbers is: "+ avg);
        input.close();
    }

    public static int sum(int[] arr) {
        int sum = 0;
        int i = 0;
        while (i < arr.length) {
            sum += arr[i];
            i++;
        }
        return sum;
    }

    public static double avg(int[] arr) {
        double sum = sum(arr);
        return (sum / arr.length);
    }
}