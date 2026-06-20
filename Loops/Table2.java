package Loops;

import java.util.Scanner;

public class Table2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = input.nextInt();

        for(int i = 0;i < 10; i++) {
            System.out.println(n + "x" + i + "=" + (n*i));
        }
        input.close();
    }
}
