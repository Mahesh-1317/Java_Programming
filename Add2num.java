import java.util.Scanner;

public class Add2num {
     public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int firstNum = input.nextInt();
        System.out.print("Enter second number: ");
        int secondNum = input.nextInt();
        int sum = firstNum + secondNum;
        System.out.print("The sum is: " + sum);
        input.close();
    }
}