package FunctionalProgramming.sorted;

import java.util.List;

class TestingSorting {
    public static void main(String[] args) {
        List<Employee> employees = List.of(
                new Employee("Rohan", 20000),
                new Employee("Sohan", 10000),
                new Employee("Kamal", 25000),
                new Employee("Aman", 15000)
        );
        employees.stream()
                .sorted((emp1,emp2) -> emp1.getSalary() - emp2.getSalary())
                .forEach(System.out::println);
    }
}
