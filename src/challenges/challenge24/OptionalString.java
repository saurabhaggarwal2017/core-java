package challenges.challenge24;

import java.util.Optional;

public class OptionalString {
    public static void main(String[] args) {

        System.out.println(testOptinal(""));
        System.out.println(testOptinal(null));
        System.out.println(testOptinal("saurabh"));
    }

    public static Optional<String> testOptinal(String str) {
        if (str == null || str.isEmpty()) {
            return Optional.empty();
        }
        return Optional.of(str.toUpperCase());
    }
}
