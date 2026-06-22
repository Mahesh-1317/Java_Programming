package FunctionalProgramming;

import java.util.List;

class FilterStr {
    public static void main(String[] args) {
        List<String> str = List.of("Why","did Katappa","kill", "Bahubali ?");
        String result = str.stream()
            .filter(s -> s.length() > 5)
            .reduce("",(a, b) -> a + " " + b);
        System.out.println(result);
    }    
}
