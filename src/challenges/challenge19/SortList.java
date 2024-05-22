package challenges.challenge19;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortList {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Aman", "Chinku", "Himanshu", "Tarun", "Golu");
        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);

        stringComparator(list);
        System.out.println(list);
    }

    public static void stringComparator(List<String> list) {
        Collections.sort(list, new Comparator<String>() {
            @Override
            public int compare(String first, String second) {
                if (first.equals(second)) {
                    return 0;
                } else if (first.charAt(0) < second.charAt(0)) {
                    return 1;
                } else {
                    return -1;
                }
            }
        });
    }
}
