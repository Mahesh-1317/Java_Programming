package Array;

import java.util.Scanner;

public class Occurance {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the size of array: ");
        int size = input.nextInt();

        int[] arr = new int[size];
        int i = 0;
        while (i < size) {
            System.out.print("Enter element no "+(i+1) + ": ");
            arr[i] = input.nextInt();
            i++;
        }

        System.out.print("Enter a number to find occurances: ");
        int n = input.nextInt();

        int occ = Occ(arr, n);
        System.out.print("The number " + n + " occurs " + occ + " times");
        input.close();
    }

    public static int Occ(int[] arr,int n) {
        int occ = 0;
        int i = 0;
        while (i < arr.length) {
            if(arr[i] == n) {
                occ++;
            }
            i++;
        }
        return occ;
    }
}
