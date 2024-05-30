package challenges.challenge23;

import java.util.List;

public class FilterOddNumber {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(2, 4, 6, 3, 7, 8, 1, 9);

        numbers.stream().filter(number -> number % 2 != 0).forEach(number -> System.out.println(number));
    }
}
