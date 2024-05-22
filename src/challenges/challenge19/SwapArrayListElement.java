package challenges.challenge19;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SwapArrayListElement {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(3);
        list.add(2);
        list.add(5);
        list.add(4);
        System.out.println(list);
        swapArrayListIndexElement(list, 1, 2);
        swapArrayListIndexElement(list, 3, 4);
        System.out.println(list);

    }

    public static void swapArrayListIndexElement(List<Integer> list, int firstIndex, int secondIndex) {
        int x = list.get(firstIndex);
        list.set(firstIndex, list.get(secondIndex));
        list.set(secondIndex, x);
    }
}
