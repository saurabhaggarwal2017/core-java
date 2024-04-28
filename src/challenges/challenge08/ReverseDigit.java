package challenges.challenge08;

import java.util.Scanner;

public class ReverseDigit {
    public static void main(String[] args) {
        //Create a program to reverse the digits of a number.
        System.out.println("Reverse Digit of a number !");
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your number :");
        int number = scanner.nextInt();

        int result = reverse(number);
        System.out.println("Reverse number of a " + number + " is :" + result);
    }

    public static int reverse(int number) {
        int result = 0;
        while (number > 0) {
            int digit = number % 10;
            result = (result * 10) + digit;
            number = number / 10;
        }
        return result;
    }
}
