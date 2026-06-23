package FunctionalProgramming;

import java.util.List;
import java.util.Optional;

class OptionalClass {
    public static void main(String[] args) {
        List<Integer> n = List.of(1,3,4,2,5,6,3);
        Optional<Integer> sum = n.stream()
                .reduce((a, b) -> a + b);
        if (sum.isPresent()) {
            System.out.println(sum.get());
        } else {
            System.out.println("List is empty");
        }
    }
}
