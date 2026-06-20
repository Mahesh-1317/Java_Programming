package Polymorphism;

//Mathod Overloading

public class Overloading {
    public int add(int a,int b){
        return a+b;
    }

    public int add(int a,int b,int c,int d) {
        return a + b + c + d;
    }

    public String add(String a,String b) {
        //return a + b;
        return a.concat(b);
    }

    public static void main(String[] args) {
        Overloading ol = new Overloading();
        int sum = ol.add(3, 8);
        String sum1 = ol.add("a", "c");
        System.out.println(sum);
        System.out.println(sum1);
    }
}
