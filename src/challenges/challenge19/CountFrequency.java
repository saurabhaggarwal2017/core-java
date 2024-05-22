package challenges.challenge19;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CountFrequency {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 4, 2, 5, 3, 5, 1, 6, 2, 5, 6, 7,2);
        int frequency = Collections.frequency(list, 2);
        System.out.println(frequency);

    }
}
