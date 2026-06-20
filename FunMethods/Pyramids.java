package FunMethods;

import java.util.Scanner;

public class Pyramids {
    public static void RHP(int rows) {
        System.out.println("\nRight Half Pyramid");
        int i=0;
        while (i < rows) {
            System.out.print("*");
            int j = 0;
            while (j < i) {
                System.out.print(" *");
                j++;
            }
            System.out.println();
            i++;
        }
    }
     public static void RRHP(int rows) {
        System.out.println("\nReverse Right Half Pyramid");
        int i=rows;
        while (i > 0) {
            int j = 0;
            while (j < i) {
                System.out.print("* ");
                j++;
            }
            System.out.println();
            i--;
        }
    }
    public static void LHP(int rows) {
        System.out.println("\nLeft Half Pyramid");
        int i=rows;
        while (i > 0) {
            int j = 0;
            while (j <= rows - i) {
                System.out.print("* ");
                j++;
            }
            System.out.println();
            i--;
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int n = input.nextInt();
        RHP(n);
        RRHP(n);
        LHP(n);
        input.close();
    }
}
