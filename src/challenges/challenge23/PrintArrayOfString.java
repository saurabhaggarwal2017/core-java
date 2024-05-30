package challenges.challenge23;

import java.util.List;

public class PrintArrayOfString {
    public static void main(String[] args) {
        List<String> list = List.of("saurabh","gaurav","aman","himanshu","lucky","golu");

        list.stream().forEach(str-> System.out.println(str));
    }
}
