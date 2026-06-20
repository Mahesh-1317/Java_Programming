package Loops;

public class Continue {
    public static void main(String[] args) {
        System.out.println("Before loop");
        for(int i = 0; i < 10; i++) {
            if(i == 6) {
                continue;
            }
            System.out.println(i);
        }
        System.out.println("Out of loop");
    }
}
