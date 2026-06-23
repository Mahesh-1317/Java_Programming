package FunctionalProgramming;

import java.util.stream.IntStream;

class Factorial {
    public static void main(String[] args) {
        int n = 7;
        System.out.println(factorial(n));

        IntStream.rangeClosed(2, n)
                .reduce((a,b) -> a * b)
                .ifPresent(System.out::println);
    }

    public static int factorial(int num) {
        if (num == 0 || num == 1) {
            return 1;
        }
        int fact = 1;
        for (int i = 2; i <= num; i++) {
            fact *= i;
        }
    return fact;
    } 
}
