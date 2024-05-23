package challenges.challenge19;

import java.util.HashSet;
import java.util.Set;

public class UniqueCharacter {
    public static void main(String[] args) {
        String str = "hello how are you.";
        int size = str.length();
        Set<Character> set = new HashSet<>();

//        for (int i = 0; i < size; i++) {
//            set.add(str.charAt(i));
//        }

        for (char c : str.toCharArray()) {
            set.add(c);
        }
        System.out.printf("No. of unique character is  : %d.\n", set.size());
        System.out.println(set);
    }
}
