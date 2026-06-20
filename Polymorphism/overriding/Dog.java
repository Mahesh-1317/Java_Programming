package Polymorphism.overriding;

class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("Dog barks");
    }
}
