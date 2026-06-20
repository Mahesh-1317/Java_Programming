package Array;

public class TwoDarray {
    public static void main(String[] args) {
        int[][] arr = {{1,8,5},{6,3,9},{7,2,4}};
        int i = 0;
        while (i < arr.length) {
            int j = 0;
            while (j < arr[i].length) {
                System.out.print(arr[i][j] + " ");
                j++;
            }
            System.out.println();
            i++;
        }
    }
}
