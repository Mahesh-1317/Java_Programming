package Loops;

import java.util.Scanner;

public class Occurance {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] arr = ArrayUtility.inputArray(input);
        System.out.print("Enter a number: ");
        int n = input.nextInt();
        int occ = countOcc(arr, n);
        System.out.println(occ);
        
    }

    public static int countOcc(int[] arr,int n) {
        int occ = 0;
        for(int num : arr) {
            if (num == n) {
                occ++;
            }
        }
        return occ;
    }
}
