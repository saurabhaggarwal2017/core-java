package challenges.challenge14.com.example.utils;

import challenges.challenge14.com.example.geometry.Circle;
import challenges.challenge14.com.example.geometry.Rectangle;

class Calculator {
    double areaOfCircle(double radius) {
        Circle circle = new Circle(radius);
        double area = Math.PI * Math.pow(circle.getRadius(), 2);
        return area;
    }

    int areaOfRectangle(int length, int breadth) {
        Rectangle rectangle = new Rectangle(length, breadth);
        int area = rectangle.getLength() * rectangle.getBreadth();
        return area;
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        double circleArea = calculator.areaOfCircle(5);
        int rectangleArea = calculator.areaOfRectangle(5, 10);

        System.out.printf("Area of circle is : %f and area if rectangle is : %d", circleArea, rectangleArea);

    }

}
