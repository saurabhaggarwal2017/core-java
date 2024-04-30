package challenges.challenge08;

import java.util.Map;
import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        //153, it's an Armstrong number because 1^3 + 5^3 + 3^3 equals 153.

        System.out.println("Armstrong number!");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your number :");
        int number = scanner.nextInt();

        int result = armstrongNumber(number);
        if (number == result) {
            System.out.println("Yes its is a Armstrong number ! ");
        } else {
            System.out.println("No its is not a Armstrong number !");
        }
    }

    public static int armstrongNumber(int number) {
        int totalDigits = countDigits(number);

        int result = 0;
        while (number > 0) {
            int digit = number % 10;
            result = result + (power(digit, totalDigits));
            number = number / 10;
        }
        return result;
    }

    public static int power(int base, int expo) {
        int i = 1, result = 1;
        while (i <= expo) {
            result = result * base;
            i++;
        }
        return result;
    }

    public static int countDigits(int number) {
        int totalDigits = 0;
        while (number > 0) {
            totalDigits++;
            number = number / 10;
        }
        return totalDigits;
    }
}
