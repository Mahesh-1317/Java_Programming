package Polymorphism.overriding;

class Car1 extends Vehicle1{
    @Override
    public void service() {
        super.service();
        System.out.println("Car is repaired");
    }
}
