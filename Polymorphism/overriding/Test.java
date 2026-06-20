package Polymorphism.overriding;

class Test {
    public static void main(String[] args) {
        Animal a = new Animal();
        Dog d = new Dog();
        a.sound(); // Calls parent class method
        d.sound(); // Calls overridden method
    }
}
