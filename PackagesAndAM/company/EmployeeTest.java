package PackagesAndAM.company;

public class EmployeeTest {
    public static void main(String[] args) {
        Employee emp = new Employee("Elon Musk", 45, 350);
        System.out.println(emp.getEmployeeDetails());

        emp.setName("Alien Musk");
        System.out.println(emp.getEmployeeDetails());
    }
}