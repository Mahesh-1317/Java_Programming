package Polymorphism;

//Constructor Overloading

public class OverloadingC {
    String name;
    int age;

    OverloadingC() {
        name = "Mogembo";
        age = 0;
    }

    OverloadingC(String name) {
        this.name = name;
        age = 0;
    }

    OverloadingC(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void display() {
        System.out.println("Name: "+name + ", Age: " + age);
    }

    public static void main(String[] args) {
        OverloadingC s1 = new OverloadingC();
        OverloadingC s2 = new OverloadingC("Katappa");
        OverloadingC s3 = new OverloadingC("Thanos", 200);

        s1.display();
        s2.display();
        s3.display();
    }
}
