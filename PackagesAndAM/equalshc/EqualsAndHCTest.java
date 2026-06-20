package PackagesAndAM.equalshc;

public class EqualsAndHCTest {
    public static void main(String[] args) {
        Person person1 = new Person("Gabbar", 44, "12345");
        Person person2 = new Person("Gabbar", 44, "12345");

        if (person1.equals(person2)) {
            System.out.println("The two persons are equal.");
        } else {
            System.out.println("The two persons are not equal.");
        }
    }
}
