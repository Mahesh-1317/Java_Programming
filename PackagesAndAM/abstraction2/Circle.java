package PackagesAndAM.abstraction2;

public class Circle extends Shape {
    private final int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    @Override
    public int area() {
        return (int) (Math.PI * radius * radius);
    }

    public int getRadius() {
        return radius;
    }
}
