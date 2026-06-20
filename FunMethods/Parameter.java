package FunMethods;

public class Parameter {
    public static void main(String[] args) {
        int num = sumOfNum(4,9);
        System.out.println(num);
        System.out.println(sumOfNum(6, 0));
        System.out.println(sumOfNum(-6, -2));
    }
    public static int sumOfNum(int a,int b) {
        int sum = a+b;
        return sum;
    }
}
