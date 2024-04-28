package challenges.challenge08;

import java.util.Scanner;

public class SumOfOddNumber {
    public static void main(String[] args) {
        //Create a program to sum all odd numbers from 1 to a specified number N.

        System.out.println("Sum of all odd numbers : ");
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your number :");
        int number = scanner.nextInt();

        int i = 1;
        int sum = 0;
        while (i <= number) {
            sum += i;
            i += 2;
        }
        System.out.println("Sum of odd number till " + number + " is = " + sum);
    }
}
