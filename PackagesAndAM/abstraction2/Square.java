package PackagesAndAM.abstraction2;

public class Square extends Shape {
    private final int side;

    public Square(int side) {
        this.side = side;
    }

    @Override
    public int area() {
        return side * side;
    }

    public int getSide() {
        return side;
    }
}
