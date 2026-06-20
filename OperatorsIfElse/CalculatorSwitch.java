package OperatorsIfElse;

import java.util.Scanner;

public class CalculatorSwitch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter first number");
        int n1 = input.nextInt();
        System.out.println("Enter second number");
        int n2 = input.nextInt();
        System.out.println("Enter the operation");
        String operation = input.next();

        int result = switch(operation) {
            case "+" -> n1 + n2;
            case "-" -> n1 - n2;
            case "*" -> n1 * n2;
            case "/" -> n1 / n2;
            default -> -1;
        };

        System.out.println(result);
        input.close();
    }
}
