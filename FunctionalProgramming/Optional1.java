package FunctionalProgramming;

import java.util.Optional;

class Optional1 {
    public static void main(String[] args) {
        System.out.println(tOptional(null));
        System.out.println(tOptional(""));
        System.out.println(tOptional("upper"));
    }   
    
    public static Optional<String> tOptional(String str) {
        if (str == null || str.isEmpty()) {
            return Optional.empty();
        }
    return Optional.of(str.toUpperCase());
    }
}
