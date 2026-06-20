package PackagesAndAM.abstraction2;

public class TestShape {
    public static void main(String[] args) {

        // Shape shape = new Shape();   Cannot instantiate the abstract class Shape

        Circle c = new Circle(4);
        Square s = new Square(5);

        System.out.printf("Area of circle : %d\nArea of square is : %d", c.area(), s.area());
    }
}
