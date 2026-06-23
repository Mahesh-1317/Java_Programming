package FunctionalProgramming.functional_Interface;

public class TestingPrime {
    public static void main(String[] args) {
        Prime p = num -> {
            for (int i = 2; i < num; i++) {
                if (num % i == 0) {
                    return false;
                }
            }
        return true;
        };

        System.out.println(p.isPrime(8));
    }
}
