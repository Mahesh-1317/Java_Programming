package Exctn;

import java.util.Scanner;

class Calculator2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int n1 = input.nextInt();
        System.out.println("Enter second number: ");
        int n2 = input.nextInt();

        try {
            int result = n1 / n2;
            System.out.printf("Result is %d", result);
        } catch (ArithmeticException e) {
            if ("/ by zero".equals(e.getMessage())) {
                System.out.println("Divide by zero occurred.");
            } else {
                throw e;
            }
        } finally {
            input.close();
        }
    }
}
