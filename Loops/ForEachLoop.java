package Loops;

public class ForEachLoop {
    public static void main(String[] args) {
        String[] arr = new String[] {
            "Ram", "Shyam", "David", "Daud", "Alia"
        };
        printArr(arr);
    }

    public static void printArr(String[] arr) {
        for(String name : arr) {
            System.out.println(name);
        }
    }
}
