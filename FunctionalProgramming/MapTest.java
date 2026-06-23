package FunctionalProgramming;

import java.util.List;

class MapTest {
    public static void main(String[] args) {
        List<String> num = List.of("1","2","3","4","5");

        num.stream()
                .map(Integer::parseInt)
                // .map(str -> Integer.parseInt(str))
                .map(n -> Math.pow(n, 2))
                .reduce((a,b) -> a+b)
                // .reduce(Double::sum)
                .ifPresent(System.out::println);
    }
}
