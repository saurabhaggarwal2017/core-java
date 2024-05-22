package challenges.challenge19;

import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ReverseList {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8);
        System.out.println(list);
        reverse(list);
        System.out.println(list);
    }

    public static void reverse(List<Integer> list) {
//        Collections.reverse(list);
        int x = list.size() / 2;
        for (int i = 0; i < x; i++) {
            SwapArrayListElement.swapArrayListIndexElement(list, i, list.size() - 1 - i);
        }
    }

}
