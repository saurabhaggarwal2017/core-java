package challenges.challenge19;

public class StringConcatination {
    public static void main(String[] args) {
        String result = stringConCat("Hey,", "how", "are", "you", "i", "hope", "you", "doing", "well!");
        System.out.println("Your string is : " + result);
    }

    public static String stringConCat(String... strs) {
        StringBuilder builder = new StringBuilder();
        for (String str : strs) {
            builder.append(str).append(" ");
        }
        return builder.toString();
    }
}
