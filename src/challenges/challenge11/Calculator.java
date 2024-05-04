package challenges.challenge11;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        //Create a program to create a simple calculator that uses a
        //switch statement to perform basic arithmetic operations
        //like addition, subtraction, multiplication, and division.

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter any one operation which you want to perform (+, -, *, /) : ");
        String operator = scanner.next();
        System.out.print("Enter your first number : ");
        float first = scanner.nextFloat();
        System.out.print("Enter your Second number : ");
        float second = scanner.nextFloat();

        float result = switch (operator) {
            case "+" -> first + second;
            case "-" -> first - second;
            case "*" -> first * second;
            case "/" -> first / second;
            default -> -1;
        };

    }
}
