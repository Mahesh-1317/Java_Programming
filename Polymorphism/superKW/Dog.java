package Polymorphism.superKW;

class Dog extends Animal {
    String color = "Black";

    Dog() {
        super();
    }

    void sound() {
        System.out.println("Dog barks");
    }

    void display() {
        System.out.println("Animal color: "+ super.color);
        System.out.println("Dog color: "+color);
        super.sound();
        sound();
    }
}
