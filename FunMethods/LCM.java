package FunMethods;

import java.util.Scanner;

public class LCM {
    public static int lcm(int n1,int n2) {
        int i = 1;

        // while (i <= n2) {
        //     int factor = n1*i;
        //     if(factor % n2 == 0) {
        //         return factor;
        //     }
        //     i++;             
        // }
        // return 0;

        while (true) {
            int factor = n1*i;
            if(factor % n2 == 0) {
                return factor;
            }
            i++;
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int n1 = input.nextInt();
        System.out.print("Enter second number: ");
        int n2 = input.nextInt();
        int lcm = lcm(n1, n2);
        System.out.print("LCM of two numbers is: " + lcm);
        input.close();
    }
}
