package challenges.challenge17;

public class Car extends Vehicle{
    @Override
    public void service() {
        super.service();
        System.out.println("car are on service today...");
    }
}
