package Array;

import java.util.Scanner;

public class Search2D {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[][] arr = Arr2Utility.inputArray(input);
        System.out.println();
        System.out.print("Enter a number you want to search: ");
        int n = input.nextInt();

        boolean isFound = search(arr, n);
        if (isFound) {
            System.out.print("Badhai ho, element mil gaya");
        } else {
            System.out.print("Oops! sorry");
        }
    }
    public static boolean search(int[][] arr,int n) {
        int i = 0;
        while (i < arr.length) {
            int j = 0;
            while (j < arr[i].length) {
                if (arr[i][j] == n) {
                    return true;
                }
                j++;
            }
            i++;
        }
        return false;
    }
}
