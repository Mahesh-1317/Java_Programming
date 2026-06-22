package FunctionalProgramming;

import java.util.List;
import java.util.function.BinaryOperator;

class Reducing {
    public static void main(String[] args) {
        List<Integer> num = List.of(1,5,6,4,7,0,3,9);
        int sum = 0;
        for (Integer n : num) {
            sum += n;
        }
        System.out.println(sum);

        //  Sum using Reduce
        int newSum = num.stream()
            .reduce(0, new BinaryOperator<Integer>() {
                @Override
                public Integer apply(Integer integer, Integer integer2) {
                    return integer + integer2;
                }
            });
    System.out.printf("\nSum using reduce is %d",newSum);

    int newSum2 = num.stream()
            .reduce(0, (a,b) -> a + b);
        System.out.printf("\nSum using lambda is %d",newSum2);

    int max = num.stream()
            .reduce(Integer.MIN_VALUE,(a,b) -> a > b ? a : b);
        System.out.printf("\nMaximum number using lambda is %d",max);
    }    
}
