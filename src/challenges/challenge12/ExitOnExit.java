package challenges.challenge12;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class ExitOnExit {
    public static void main(String[] args) {
        //Create a program using break to read inputs from the user in a loop and break
        //the loop if a specific keyword (like "exit") is entered.
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("Enter your command : ");
            String command = scanner.nextLine();
            if (command.equalsIgnoreCase("exit")) {
                break;
            }
        }
        System.out.println("Your program finished now!");
    }
}
