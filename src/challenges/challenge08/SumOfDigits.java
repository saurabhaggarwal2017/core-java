package challenges.challenge08;

import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        System.out.println("Calculate the sum of digit of an integer.");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your number :");
        int number = scanner.nextInt();

        int result = sumOfDigit(number);
        System.out.println("Sum of digit of an integer " + number + " is : " + result);
    }

    public static int sumOfDigit(int number) {
        int sum = 0;

        while (number > 0) {
            int digit = number % 10;
            sum += digit;
            number = number / 10;
        }
        return sum;
    }
}
