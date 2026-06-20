package CollectionAndGenrics;

import java.util.Comparator;
import java.util.PriorityQueue;

class StuPriorityQueue {
    public static void main(String[] args) {
        PriorityQueue<Student> queue = new PriorityQueue<>(new StudentComparator());
        queue.add(new Student("Peter", 'A'));
        queue.add(new Student("Alice", 'A'));
        queue.add(new Student("Bob", 'B'));
        queue.add(new Student("Steve", 'C'));
        queue.add(new Student("Tony", 'D'));

        while (!queue.isEmpty()) {
            Student student = queue.poll();
            System.out.println(student.getName() + ": " + student.getGrade());
        }
    }

    private static class StudentComparator implements Comparator<Student> {
        @Override
        public int compare(Student s1, Student s2) {
            return Character.compare(s1.getGrade(), s2.getGrade());
        }
    }

    private static class Student {
        private final String name;
        private final char grade;

        public Student(String name, char grade) {
            this.name = name;
            this.grade = grade;
        }

        public String getName() {
            return name;
        }

        public char getGrade() {
            return grade;
        }
    }
}
