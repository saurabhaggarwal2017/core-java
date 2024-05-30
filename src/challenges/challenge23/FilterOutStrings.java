package challenges.challenge23;

import java.util.List;

public class FilterOutStrings {
    public static void main(String[] args) {
        List<String> fruits = List.of("Apple", "Mango", "Cherry", "Banana", "Water Melon", "Grapes", "Guava");

        String concate = fruits.stream().filter(fruit -> fruit.length() >= 6).reduce("", (a, b) -> a +" "+ b);
        System.out.println(concate);
    }
}
