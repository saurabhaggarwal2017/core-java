package challenges.challenge12;

import java.util.Scanner;

public class NumberGuessGame {
    public static void main(String[] args) {
        System.out.println("Number Guessing Game Application.");
        Scanner scanner = new Scanner(System.in);
        int number;
        do {
            System.out.print("Enter your number: ");
            number = scanner.nextInt();
        } while (!guessingNumber(number));
        System.out.println("You have guess the correct number!");
    }

    public static boolean guessingNumber(int number) {
        return number == 5;
    }
}
