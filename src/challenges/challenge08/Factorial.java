package challenges.challenge08;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        //Write a function that calculates the factorial of a given number.
        // 5 = 5*4*3*2*1

        System.out.println("Calculate factorials of any number!");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your number :");
        int number = scanner.nextInt();
        long result = factorialOfNumber(number);
        System.out.println("Factorial of " + number + " is :" + result);
    }

    public static long factorialOfNumber(int number) {
        long result = 1;
        while (number >= 1) {
            result *= number;
            number--;
        }
        return result;
    }
}
