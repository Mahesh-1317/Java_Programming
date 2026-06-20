// Online Java Compiler
package CollectionAndGenrics;

import java.util.Comparator;
import java.util.PriorityQueue;

class StuPriorityQueue2 {
    public static void main(String[] args) {
        PriorityQueue<Student> queue = new PriorityQueue<>(
        new Comparator<Student>() {
            @Override
            public int compare(Student s1, Student s2) {
                return Character.compare(s1.grade(), s2.grade());
            }
        });
        queue.add(new Student("Alice", 'A'));
        queue.add(new Student("Bob", 'B'));
        queue.add(new Student("Tony", 'A'));
        queue.add(new Student("Steve", 'C'));
        queue.add(new Student("Alice", 'D'));
        System.out.printf("Queue is %s\n",queue);

        System.out.printf("Got %s\n",queue.poll());
        System.out.printf("Got %s\n",queue.poll());
        System.out.printf("Got %s\n",queue.poll());
        System.out.printf("Got %s\n",queue.poll());
        System.out.printf("Got %s\n",queue.poll());
        
    }
    private static record Student(String name, char grade) {
        public String toString(){
            return name + ": "+ grade;
        }
    }
}