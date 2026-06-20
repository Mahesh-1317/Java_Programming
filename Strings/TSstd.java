package Strings;

class TSstd {
    String name;
    int rollNumber;
    int age;
    String house;

    public TSstd(String name, int rollNumber, int age, String house) {
        this.name = name;
        this.age = age;
        this.rollNumber = rollNumber;
        this.house = house;
    }

    @Override
    public String toString() {
        return "Student Details: {name: " + name + 
              ", roll number: " + rollNumber + 
              ", age: " + age + 
              ", house: " + house + "}";
    }

    public static void main(String[] args) {
        TSstd student1 = new TSstd("Peter",      101, 20, "Aravali");
        System.out.println(student1.toString());
    }
}
