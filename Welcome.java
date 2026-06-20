import java.util.Scanner;

class Welcome {
    public static void main(String[] args) {
        System.out.print("Enter your name: ");
        Scanner input = new Scanner(System.in);
        String name = input.nextLine();
        System.out.print("Welcome " + name + " Welcome");
        input.close();
    }
}
