package Loops;

import java.util.Scanner;

public class GuessNum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = 6;
        int guess; 
        do {
            System.out.println("guess a num(between 1 to 10)");
            guess = input.nextInt();
        } while (num!=guess);
        System.out.println("You have successfully guessed");
        input.close();
    }
}
