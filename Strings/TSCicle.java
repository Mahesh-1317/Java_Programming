package Strings;

class TSCicle {
    double radius;

    TSCicle(double radius) {
        this.radius = radius;
    }

    double circumference() {
        return 2 * Math.PI * radius;
    }

    double area() {
        return Math.PI * Math.pow(radius, 2);
    }

    @Override
    public String toString() {
        return "Circle Properties: {radius: " + radius + 
              ", Circumference: " + circumference() + ", Area: " + area() + "}";
    }

    public static void main(String[] args) {
        TSCicle c1 = new TSCicle(2.1);
        System.out.println(c1.toString());
    }
}
