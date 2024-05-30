package challenges.challenge24;

import java.util.stream.IntStream;

public class FactorialTest {
    public static void main(String[] args) {

        IntStream.rangeClosed(2, 5).reduce((a, b) -> a * b).ifPresent(System.out::println);

        System.out.println(factorial(5));
        System.out.println(factorial(8));
    }

    public static int factorial(int num) {
        int result = 1;
        for (int i = 1; i <= num; i++) {
            result *= i;
        }
        return result;
    }


}
