package challenges.challenge06;

import java.util.Scanner;

public class OddEven {
    public static void main(String[] args) {
        //Create a program that determines if a number is odd or even

        System.out.println("Welcome to odd even number check application!");
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter your number :");
        int number = scanner.nextInt();

        if (number % 2 == 0) {
            System.out.println("you have enter even number!!");
        } else {
            System.out.println("you have enter odd number!!");
        }
    }
}
