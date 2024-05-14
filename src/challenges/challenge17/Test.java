package challenges.challenge17;

public class Test {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        System.out.println(calculator.add(5,6));
        System.out.println(calculator.add(5,6,8));
        System.out.println(calculator.add(5.5,6.6));

        Vehicle car = new Car();
        car.service();
    }
}
