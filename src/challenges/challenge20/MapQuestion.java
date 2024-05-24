package challenges.challenge20;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MapQuestion {
    public static void main(String[] args) {
        Map<String,String> map = new HashMap<>();

        map.put("India","Delhi");
        map.put("USA","Washington DC");
        map.put("UK","London");
        map.put("Sri lanka","Colombo");
        map.put("Japan","Tokyo");

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your country : ");
        String country = scanner.nextLine();

        if(map.containsKey(country)){
            System.out.printf("Capital of %s is %s.",country,map.get(country));
        }else {
            System.out.println("Sorry try to use normal casing.");
        }
    }
}
