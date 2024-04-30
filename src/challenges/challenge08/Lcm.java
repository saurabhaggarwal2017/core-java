package challenges.challenge08;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class Lcm {
    public static void main(String[] args) {
        System.out.println("Print Lcm if given two number.");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first number :");
        int first = scanner.nextInt();
        System.out.println("Enter Second number :");
        int second = scanner.nextInt();

        int result = lcmOfTwoNumber(first, second);
        System.out.println("Lcm of " + first + ", " + second + " is :" + result);

    }

    public static int lcmOfTwoNumber(int first, int second) {

        int i = 1;
        while (i <= second) {
            int factorial = first * i;
            if (factorial % second == 0) {
                return factorial;
            }
            i++;
        }
        return 0;
    }
}
