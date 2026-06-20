package FunMethods;

import java.util.Scanner;

public class OddSum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = input.nextInt();
        int sum = oddSum(n);
        System.out.println(sum);
        input.close();
    }
    public static int oddSum(int n){
        int sum = 0;
        int i = 1;
        while (i <= n) {
            sum += i;
            i += 2;
        }
        return sum;
    }
}
