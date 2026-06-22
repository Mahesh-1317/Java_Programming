package FunctionalProgramming;

import java.util.List;

class FilterOdd {
    public static void main(String[] args) {
        List<Integer> num = List.of(1,2,3,4,5,6,7,8,9,10);
        num.stream()
            .filter(n -> n % 2 == 1)
            .forEach(n -> System.out.println(n));
    }
}
