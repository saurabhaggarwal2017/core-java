package challenges.challenge25;

import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class DistinctElement {
    public static void main(String[] args) {
        List<Integer> list = List.of(1,2,4,5,3,1,5,6,8,3,1,3,5);

        List<Integer> newList = list.stream().distinct().collect(Collectors.toList());
        newList.stream().forEach(System.out::println);

    }
}
