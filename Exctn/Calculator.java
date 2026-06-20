package Exctn;

import java.util.Scanner;

class Calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter two numbers: ");
        int a = input.nextInt();
        int b = input.nextInt();

        try {
            //int[] x = new int[5];
            //x[6] = 2;
            //System.out.println("Element: " + x[6]);

            int c = a/b;
            System.out.println("Result: "+ c);
        } catch (ArithmeticException exception) {

            //System.out.println("Divide by zero, enter valid values");

            System.out.printf("%s, enter valid values", exception.getMessage());
        } catch (ArrayIndexOutOfBoundsException exception) {
            System.out.println("Array index out of bound");
        } catch (Throwable th) {
            System.out.println("General exception");
        } finally {
            System.out.println("I am in finally");
        }

        input.close(); 
    }
}
