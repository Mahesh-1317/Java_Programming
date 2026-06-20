package OperatorsIfElse;

public class Arithmatic {
    public static void main(String[] args) {
        int a = 7;
        int b = 4;

        /* System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(a*b);
        System.out.println(a/b);
        System.out.println(a%b); */

        // System.out.println("Add: " + (a+b) +"\n" + "Sub: " + (a-b) +"\n" + "Mul: " + (a*b) +"\n" + "Div: " + (a/b) +"\n"+ "Mod: " + (a%b)); 

        int sum = a+b;
        int sub = a-b;
        int mul = a*b;
        int div = a/b;
        int mod = a%b;
        System.out.println("Add: " + sum +"\n" + "Sub: " + sub +"\n" + "Mul: " + mul +"\n" + "Div: " + div +"\n"+ "Mod: " + mod);
    }
}
