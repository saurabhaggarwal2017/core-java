package challenges.challenge18;

import java.util.Scanner;

public class ArithmeticExceptionHandler {
    public static void main(String[] args) {
        System.out.println("Lets divide two numbers.");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your first number : ");
        int first = scanner.nextInt();
        System.out.println("Enter your second number : ");
        int second = scanner.nextInt();

        try {
            int result = first/second;
            System.out.println(result);
        }catch (ArithmeticException e){
            System.out.printf("You got an exception %s .",e.getMessage());
        }
    }
}
