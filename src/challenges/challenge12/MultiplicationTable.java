package challenges.challenge12;

import java.awt.desktop.ScreenSleepEvent;
import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        System.out.println("Multiplication Table Application.");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter you number: ");
        int number = scanner.nextInt();
        printTable(number);
    }

    public static void printTable(int number) {
        for (int i = 1; i <= 10; i++) {
            int result = number * i;
            System.out.println(number + " * " + i + " = " + result);
        }
    }
}
