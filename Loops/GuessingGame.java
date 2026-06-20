package Loops;

import java.util.Scanner;

public class GuessingGame {
    int random;

    GuessingGame() {
        random = (int) Math.ceil(Math.random() * 100);
    }

    int guess(int guessNumber) {
        return guessNumber - random;
    } 

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        GuessingGame game = new GuessingGame();
        int guess;
        int result;

        do {
            System.out.print("Guess the number (1-100): ");
            guess = sc.nextInt();
            result = game.guess(guess);

            if(result == 0) {
                System.out.println("Congratulations! You've guessed the number!");
            } else if(result < 0) {
                System.out.println("Too low! Try again.");
            } else {
                System.out.println("Too high! Try again.");
            }
        } while(result != 0);
        sc.close();
    }
}
