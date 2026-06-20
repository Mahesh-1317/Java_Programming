class Circle {
    double radius;

    Circle(double radius) {
        this.radius = radius;
    } 

    double getCircumference() {
        return 2 * Math.PI * radius;
    }

    double getArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    public static void main(String[] args) {
        Circle c1 = new Circle(4);
        System.out.println("Circumference: " + c1.getCircumference());
        System.out.println("Area: " + c1.getArea());
    }
}
