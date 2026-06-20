package Array;

import java.util.Scanner;

public class MergeArr {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] arr1 = ArrayUtility.inputArray(input);
        int[] arr2 = ArrayUtility.inputArray(input);

        int[] mergedArr = merge(arr1, arr2);
        System.out.println("Merged array is");
        ArrayUtility.displayArray(mergedArr);
    }

    public static int[] merge(int[] arr1, int[] arr2) {
        int newSize = arr1.length + arr2.length;
        int[] newArr = new int[newSize];

        int i=0,j=0,k=0;
        while (i < arr1.length || j < arr2.length) {
            if(j == arr2.length ||
                (i < arr1.length && arr1[i] < arr2[j])) {
                    newArr[k] = arr1[i];
                    i++;
                    k++;
            } else {
                newArr[k] = arr2[j];
                j++;
                k++;
            }
        }
        return newArr;
    }
}
