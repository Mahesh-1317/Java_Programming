package FunctionalProgramming;

import java.util.function.BinaryOperator;

class LambdaMultpn {
    public static void main(String[] args) {
        BinaryOperator<Integer> multi = (a,b) -> a * b;
        int result = multi.apply(4, 7);
        System.out.println(result);
    }
}
