package Loops;

public class ForLoop {
    public static void main(String[] args) {
        String[] arr = new String[] {
            "Ram", "Shyam", "David", "Daud", "Alia"
        };
        printArr(arr);
    }

    public static void printArr(String[] arr) {
        for(int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
