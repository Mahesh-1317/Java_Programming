package FunctionalProgramming;

import java.util.List;
import java.util.function.Consumer;

class Filtering {
    public static void main(String[] args) {
        List<String> fruits = List.of("apple", "banana", "mango", "date", "cherry");
        System.out.println(fruits.size());

        System.out.println("Printing fruits normally");
        for (String f : fruits){
            System.out.println(f);
        }

        System.out.println("Printing fruits using streams");

        fruits.stream().forEach(new Consumer<String>() {
            @Override
            public void accept(String fruit) {
                System.out.println(fruit);
            }
        });

        System.out.println("Printing fruits using filter");

        fruits.stream()
        .filter(fruit -> fruit.endsWith("e"))
        .forEach(fruit -> System.out.println(fruit));
    }
}
