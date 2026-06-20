package FunMethods;

import java.util.Scanner;

public class Factorial {
    public static int Fact(int n){
        if(n<2){
            return 1;
        }
        int fact = 1;
        int i = 2;
        while (i <= n) {
            fact *= i;
            i++;
        }
        return fact;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = input.nextInt();
        int fact = Fact(n);
        System.out.println(fact);
        input.close();
    }
}
