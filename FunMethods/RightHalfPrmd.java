package FunMethods;

public class RightHalfPrmd {
    public static void main(String[] args) {
        rightHalfPrmd();
    }
    public static void rightHalfPrmd() {
        int i = 0;
        while (i < 5) {
            System.out.print("*");
            int j = 0;
            while (j < i) {
                System.out.print(" *");
                j++;
            }
            System.out.println();
            i++;
        }
    }
}
