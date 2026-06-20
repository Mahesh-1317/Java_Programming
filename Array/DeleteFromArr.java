package Array;

import java.util.Scanner;

public class DeleteFromArr {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int size = input.nextInt();

        int arr[] = new int[size];
        int i = 0;
        while (i < size) {
            System.out.print("Enter element no "+(i+1)+": ");
            arr[i] = input.nextInt();
            i++;
        }

        System.out.print("Enter element you want to delete: ");
        int n = input.nextInt();

        int[] newArr = dltNum(arr, n);
        System.out.println("New array");

        displayArr(newArr);
        input.close();
    }

    public static int[] dltNum(int[] arr,int n) {
        int occ = Occ(arr, n);
        if(occ == 0) {
            return arr;
        }

        int newSize = arr.length - occ;
        int[] newArr = new int[newSize];

        int i = 0,j = 0;
        while (i < arr.length) {
            if (arr[i] != n) {
                newArr[j] = arr[i];
                j++;
            }
            i++;
        }
        return newArr;
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

    public static void displayArr(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            System.out.print(arr[i] + " ");
            i++;
        }
        System.out.println();
    }
}
