package challenges.challenge12;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        System.out.println("Check number is prime or not!");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your number: ");
        int number = scanner.nextInt();
        boolean result = isPrime(number);
        if (result) {
            System.out.println("Yes it is a prime number.");
        } else {
            System.out.println("No it is not a prime number.");
        }
    }

    public static boolean isPrime(int number) {
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
