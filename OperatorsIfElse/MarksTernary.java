package OperatorsIfElse;

import java.util.Scanner;

public class MarksTernary {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your marks");
        int marks = input.nextInt();
 
        String result = marks > 80 ? "High" : (marks > 50 ? "Moderate" : "Low");
        System.out.println(result);
        input.close();
    }
}
