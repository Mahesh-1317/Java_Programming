package OperatorsIfElse;

import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the student's marks: ");
        int marks = input.nextInt();

        if (marks >= 90) {
            System.out.println("Grade: A");
        } 
        else if (marks >= 75) {
            System.out.println("Grade: B");
        } 
        else if (marks >= 60) {
            System.out.println("Grade: C");
        } 
        else if (marks >= 40) {
            System.out.println("Grade: D");
        } 
        else {
            System.out.println("Grade: F (Fail)");
        }

        input.close();
    }
}
