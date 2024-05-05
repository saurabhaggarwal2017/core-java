package challenges.challenge12;

import java.util.Scanner;

public class PasswordChecker {
    public static void main(String[] args) {
        System.out.println("Password Checker application.");
        Scanner scanner = new Scanner(System.in);
        String password;

        do {
            System.out.print("Enter your password please: ");
            password = scanner.nextLine();
        } while (!isValidPassword(password));

        System.out.println("You have enter correct password..");
    }

    public static boolean isValidPassword(String password) {
        return password.length() > 6;
    }
}
