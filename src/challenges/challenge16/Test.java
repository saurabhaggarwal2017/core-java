package challenges.challenge16;

public class Test {
    public static void main(String[] args) {
        Circle circle = new Circle(5);
        Square square = new Square(5);
        System.out.println(circle.calculateArea());
        System.out.println(square.calculateArea());

        Eagle eagle = new Eagle();
        eagle.fly();
    }
}
