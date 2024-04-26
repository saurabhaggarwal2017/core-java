package challenges.challenge5;

public class CompoundInterest {
    public static void main(String[] args) {
        // compound interest = p(1+r/100)t

        int price = 250;
        int rate = 7;
        int time = 3;

        double interest = price * Math.pow((1 + (rate / 100.0f)),time);
        System.out.println(interest);
    }
}
