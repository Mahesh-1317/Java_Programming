package Array;

import java.util.Scanner;

public class Searching {
    public static void main(String[] args) {
        int[] arr = {4,45,23,87,59,17,6,80,47};
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number you want to search: ");
        int n = input.nextInt();
        boolean isFound = isFound(arr, n);
        if(isFound) {
            System.out.println("Element is found");
        } else {
            System.out.println("Element is not found");
        }
        input.close();
    }
    public static boolean isFound(int[] arr,int n) {
        int i = 0;
        while (i < arr.length) {
            if(arr[i] == n) {
                return true;
            }
            i++;
        }
        return false;
    }
}
