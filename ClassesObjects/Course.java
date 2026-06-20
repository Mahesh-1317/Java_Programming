package ClassesObjects;

public class Course {
    static int maxCapacity = 100;
    String courseName;
    int enrollments;

    String[] enrolledStudents;

    Course(String courseName) {
        this.courseName = courseName;
        this.enrollments = 0;
        this.enrolledStudents = new String[maxCapacity];
    }

    static void setMaxCapacity(int maxCapacity) {
        Course.maxCapacity = maxCapacity;
    }

    void enrollStudent(String studentName) {
        if (enrollments < maxCapacity) {
            enrolledStudents[enrollments] = studentName;
            enrollments++;
        } else {
            System.out.println("Course is full");
        }
    }

    void unenrollStudent(String studentName) {
        for(int i=0; i< enrollments; i++) {
            if (enrolledStudents[i].equals(studentName)) {
                for(int j = i; j< enrollments - 1; j++) {
                    enrolledStudents[j] = enrolledStudents[j + 1];
                }
                enrollments--;
                System.out.println("Student removed");
                return;
            }
        }
        System.out.println("Student not found");
    }

    public static void main(String[] args) {
        Course course1 = new Course("Java Programming");

        course1.enrollStudent("Thanos");
        course1.enrollStudent("Kalkey");
        course1.enrollStudent("Magneto");

        course1.unenrollStudent("Magneto");
        course1.unenrollStudent("Katappa");

        System.out.println("Current Students: ");
        for(int i = 0; i < course1.enrollments; i++) {
            System.out.println(course1.enrolledStudents[i]);
        }
    }
}
