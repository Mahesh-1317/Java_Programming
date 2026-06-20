package Loops;

import java.util.Scanner;

public class Cuberoot {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num;
        int cuberoot; 
        do {
            System.out.println("Enter a num");
            num = input.nextInt();
            cuberoot = (int)Math.round(Math.cbrt(num));
        } while (cuberoot * cuberoot * cuberoot != num);
        System.out.println(num + " is a perfect cube");
        input.close();
    }
}
