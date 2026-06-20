package FunMethods;

import java.util.Scanner;

public class ReverseDigit {
    public static int Reverse(int n){
        int newNum = 0;
        while (n>0) {
            int ld = n%10;
            newNum = newNum * 10 + ld;
            n /= 10;
        }
        return newNum;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = input.nextInt();
        int newNum = Reverse(n);
        System.out.print("Reverse of digit is " + newNum);
        input.close();
    }
}
