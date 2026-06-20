package FunMethods;

import java.util.Scanner;

public class Table {
    public static void MulnTable(int n){
        int i = 1;
        while (i <= 10) {
            System.out.println(n + " x " + i+ " = "+ (n*i));
            i++;
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = scanner.nextInt();
        MulnTable(n);
        scanner.close();
    }
}
