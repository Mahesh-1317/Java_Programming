package FunctionalProgramming;

import java.util.List;

class MethodRef {
    public static void main(String[] args) {
        List<Integer> num = List.of(1,2,3,4,5,6,7,8);

        // num.stream()
        //         .filter(n -> n % 2 == 1)
        //         .forEach(n -> System.out.println(num));

        num.stream()
                .filter(n -> n % 2 == 1)
                .forEach(System.out::println);

        // int sum = num.stream()
        //         .reduce(0, (a,b) -> a + b);

        int sum = num.stream()
                .reduce(0, Integer::sum);
        System.out.println(sum);
    }
}
