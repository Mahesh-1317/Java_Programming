package Polymorphism;

public class Overloading2 {
    public void Bark() {
        System.out.println("Bhauuu...");
    }

    public void Bark(int n) {
        for(int i = 0; i < n; i++){
            System.out.println("Bhauuu...");
        }
    }

    public static void main(String[] args) {
        Overloading2 ol = new Overloading2();
        ol.Bark();
        ol.Bark(3);
        System.out.println(ol);
    }
}
