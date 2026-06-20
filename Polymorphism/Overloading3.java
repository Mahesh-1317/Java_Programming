package Polymorphism;

public class Overloading3 {
    // public int add( int a, int b) {
    //     return a + b;
    // }
    public int add( int a, int b, int c) {
        return a + b + c;
    }
    public double add( double a, double b) {
        return a + b;
    }

    public static void main(String[] args) {
        Overloading3 ol3 = new Overloading3();
        System.out.println(ol3.add(3, 7));
        System.out.println(ol3.add(3, 7, 4));
        System.out.println(ol3.add(3.7, 7.4));
    }
}
