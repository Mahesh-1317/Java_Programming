package FunctionalProgramming;

import java.util.List;
import java.util.stream.Collectors;

class Distinct {
    public static void main(String[] args) {
        List<Integer> num = List.of(1,5,2,4,3,4,0,1,3);
        List<Integer> distinctNum = num.stream()
                .distinct()
                .collect(Collectors.toList());
        System.out.println(num);
        System.out.println(distinctNum);
    }    
}
