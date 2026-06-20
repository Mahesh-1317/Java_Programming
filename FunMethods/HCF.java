package FunMethods;

import java.util.Scanner;

public class HCF {
    public static int hcf(int a,int b) {
        int hcf = 1;
        int i = 2;
        int least = least(a,b);
        while (i <= least) {
            if (a%i == 0 && b%i == 0) {
                hcf = i;
            }
            i++;
        }
        return hcf;
    }

    public static int least(int n1, int n2) {
        if(n1 < n2) return n1;
        else return n2;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter first number");
        int x = input.nextInt();
        System.out.println("Enter second number");
        int y = input.nextInt();

        int hcf = hcf(x, y);
        System.out.println("HCF of two numbers is " + hcf);
        input.close();
    }
}
