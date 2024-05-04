package challenges.challenge11;

import java.util.Scanner;

public class AbsoluteValue {
    public static void main(String[] args) {
        //Create a program to calculate the absolute value of a given
        //integer
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your number :");
        int number = scanner.nextInt();

        int result = number < 0 ? (-number) : number;
        System.out.println("absolute value of " + number + " is " + result);
    }
}
