package FunMethods;

import java.util.Scanner;

public class SumOfDigit {
    public static int sumOfDigit(int n){
        int sum = 0;
        while (n > 0) {
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = input.nextInt();
        int sum = sumOfDigit(n);
        System.out.println("Sun of digit is: " + sum);
        input.close();
    }
}
