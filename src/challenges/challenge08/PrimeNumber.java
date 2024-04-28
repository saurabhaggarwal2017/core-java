package challenges.challenge08;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        System.out.println("Prime number checker!");
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your number :");
        int number = scanner.nextInt();

        boolean isPrime = primeChecker(number);
        if (isPrime) {
            System.out.println("Yes it is a prime number!");
        } else {
            System.out.println("No it is not a prime number!");
        }
    }

    public static boolean primeChecker(int number) {
        int i = 2;
        while (i < number) {
            if (number % i == 0) {
                return false;
            }
            i++;
        }
        return true;
    }
}
