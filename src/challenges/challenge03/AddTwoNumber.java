package challenges.challenge03;


import java.util.Scanner;

public class AddTwoNumber {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Add Two numbers.");
        System.out.print("Enter First number : ");
        int a = scanner.nextInt();
        System.out.print("Enter Second number : ");
        int b = scanner.nextInt();
        int sum = a + b;
        System.out.println("Sum of two number is : " + sum);
    }

}
