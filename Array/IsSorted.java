package Array;

import java.util.Scanner;

public class IsSorted {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int size = input.nextInt();

        int[] arr = new int[size];
        int i = 0;
        while (i < size) {
            System.out.print("Enter element no "+ (i+1)+": ");
            arr[i] = input.nextInt();
            i++;
        }
        boolean isInc = isInc(arr);
        boolean isDec = isDec(arr);

        if (isDec || isInc) {
            System.out.println("Given array is sorted");
        } else {
            System.out.print("Given array is not sorted");
        }
        input.close();
    }

    public static boolean isInc(int[] arr) {
        int i = 1;
        while (i < arr.length) {
            if(arr[i] < arr[i-1]){
                return false;
            }
            i++;
        }
        return true;
    }

    public static boolean isDec(int[] arr) {
        int i = 1;
        while (i < arr.length) {
            if (arr[i] > arr[i-1])  {
                return false;
            }
            i++;
        }
        return true;
    }
}
