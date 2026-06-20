package Array;

import java.util.Scanner;

public class AvgSum2D {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[][] arr = Arr2Utility.inputArray(input);

        int sum = sum(arr);
        double avg = avg(arr);

        System.out.println("Sum: "+sum);
        System.out.println("Avg: "+avg);
        input.close();
    }

    public static int sum(int[][] arr) {
        int sum = 0;
        int i = 0;
        while(i < arr.length){
            int j = 0;
            while(j < arr[i].length) {
                sum += arr[i][j];
                j++;
            }
            i++;
        }
        return sum;
    }
    public static double avg(int[][] arr){
        if(arr.length == 0){
            return 0;
        }
        int rows = arr.length;
        int columns = arr[0].length;
        double size = rows * columns;
        return sum(arr) / size;
    }    
}
