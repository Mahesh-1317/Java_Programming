package Loops;

import java.util.Scanner;

public class Table {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = input.nextInt();
        
        System.out.println(n);
        int i = 1;
        while (i <= 10) {
            System.out.println(n + "x" + i+ "="+ (n*i));
            i++;
            input.close();
        }
    }

}
