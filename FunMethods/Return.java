package FunMethods;

import java.util.Scanner;

public class Return {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int a = readNumber(input);
        int b = readNumber(input);

        int sum = a + b;
        System.out.println("Sum of two numbers is: " + sum);

        input.close(); // close once
    }

    public static int readNumber(Scanner input) {
        System.out.println("Enter a number: ");
        return input.nextInt();
    }
}
