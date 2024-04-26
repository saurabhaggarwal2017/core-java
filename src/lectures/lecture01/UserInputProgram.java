package lectures.lecture01;

import java.util.Scanner;

public class UserInputProgram {
    public static void main(String[] args) {
        // scanner class to take input;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Good morning! what is your :");
        String name = scanner.nextLine();

        System.out.println("Welcome "+name);




    }
}
