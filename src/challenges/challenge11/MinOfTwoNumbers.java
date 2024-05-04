package challenges.challenge11;

import java.util.Scanner;

public class MinOfTwoNumbers {
    public static void main(String[] args) {
        //Create a program to find the minimum of two numbers
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first number :");
        int first = scanner.nextInt();
        System.out.println("Enter Second number :");
        int second = scanner.nextInt();

        int result = first < second ? first : second;
        System.out.println("Minimum is : " + result);
    }
}
