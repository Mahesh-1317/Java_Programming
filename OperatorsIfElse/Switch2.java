package OperatorsIfElse;

import java.util.Scanner;

public class Switch2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your day in number(1 - 7)");
        int day = input.nextInt();
        String dayStr = switch (day) {
            case 1 -> "Monday";
            case 2 -> "Tuesday";
            case 3 -> "Wednesday";
            case 4 -> "Thursday";
            case 5 -> "Friday";
            case 6 -> "Saturday";
            case 7 -> "Sunday";
            case 8,9,10 -> "Holiday";
            default -> "Invalid day";
        };
        System.out.println(dayStr);
        input.close();
    }
}
