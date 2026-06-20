package PackagesAndAM.utils;

import PackagesAndAM.geometry.Circle;
import PackagesAndAM.geometry.Rectangle;

public class Calculator {
    public static void main(String[] args) {
        Circle circle = new Circle(5.5);
        Rectangle rectangle = new Rectangle(4, 6);

        double circleArea = Math.PI * Math.pow(circle.radius, 2);
        int rectangleArea = rectangle.length * rectangle.width;

        System.out.printf("Area of the circle is : %.2f\nArea of the Rectangle is : %d", circleArea, rectangleArea);
    }
}
