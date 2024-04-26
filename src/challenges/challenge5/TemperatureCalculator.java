package challenges.challenge5;

public class TemperatureCalculator {
    public static void main(String[] args) {
        //.Create a program to convert Fahrenheit to Celsius
        // °C = (°F - 32) × 5/9

        int f = 70;
        float c = (f - 32) * (5 / 9.0f);
        System.out.println(c);
    }
}
