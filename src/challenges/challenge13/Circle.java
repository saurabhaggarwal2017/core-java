package challenges.challenge13;

import java.awt.desktop.ScreenSleepEvent;
import java.util.Scanner;

public class Circle {
    double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    double getAreaOfCircle() {
        double result = Math.PI * Math.pow(radius, 2);
        return result;
    }

    double getCircumferenceOfCircle() {
        double result = 2 * Math.PI * radius;
        return result;
    }

    @Override
    public String toString() {
        return "Circle { radius of a circle:" + this.radius + " , circumference of a circle:" + this.getCircumferenceOfCircle() + " , Area of a circle:" + this.getAreaOfCircle() + "}";
    }

    public static void main(String[] args) {
        System.out.println("Area and circumference of a Circle!");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the radius of a circle : ");
        double radius = scanner.nextInt();

        Circle circle = new Circle(radius);
        System.out.println(circle);
    }


}
