package Loops;

import java.util.Scanner;

public class PasswordChecker {
    public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
        String password;
    
        do {
            System.out.println("Please enter your password");
            password = input.next();
        } while (!isValidPassword(password));
        System.out.println("Thankyou");  
        input.close(); 
   }

    public static boolean isValidPassword(String password) {
    return password.length() >= 8;
   }
}
