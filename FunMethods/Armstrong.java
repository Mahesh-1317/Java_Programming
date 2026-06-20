package FunMethods;

import java.util.Scanner;

public class Armstrong {
    public static boolean isArmstrong(int n) {
        int numOfDigits = noOfDigits(n);
        int num = n;
        int finalNo = 0;
        while (n > 0) {
            int ld = n % 10;
            n /= 10;
            finalNo += pow(ld,numOfDigits);
        }
        return finalNo == num;
    }

    public static int pow(int n,int num) {
        int result = 1;
        int i = 0;
        while (i < num) {
            result *= n;
            i++;
        }
        return result;
    }

    public static int noOfDigits(int n) {
        int digits = 0;
        while (n > 0) {
            digits++;
            n /= 10;
        }
        return digits;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = input.nextInt();
        boolean isArmstrong = isArmstrong(n);

        if (isArmstrong) {
            System.out.println("Number is Armstrong");
        } else {
            System.out.println("Number is not Armstrong");
        }
        input.close();
    }
}
