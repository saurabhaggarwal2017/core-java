package challenges.challenge20;

import java.util.Arrays;
import java.util.List;

public class EnumTest {
    public static void main(String[] args) {
        Day[] values = Day.values();
        for (Day value : values) {
            System.out.println(value);
        }

        List<Day> list = Arrays.asList(Day.FRIDAY, Day.MONDAY, Day.SATURDAY);
        for (Day day : list) {
            System.out.printf("%s : %s \n",day,day.getType());
        }


    }
}
