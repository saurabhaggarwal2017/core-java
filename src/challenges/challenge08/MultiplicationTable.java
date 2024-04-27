package challenges.challenge08;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        //Develop a program that prints the multiplication table for a given number.

        System.out.println("Multiplication table printing application!");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your number :");
        int number = scanner.nextInt();

        multiplicationTable(number);


    }

    public static void multiplicationTable(int number) {
        int i = 1;
        while (i <= 10) {
            System.out.println(number + " * " + i + " = " + (number * i));
            i++;
        }
    }
}
