package challenges.challenge5;

public class SimpleInterest {
    public static void main(String[] args) {
        // simple interest = p*r*t / 100

        int price = 250;
        int rate = 7;
        int time = 3;

        float interest = (price * rate * time) / 100.0f;
        System.out.println(interest);
    }
}
