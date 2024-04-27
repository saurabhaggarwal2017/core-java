package challenges.challenge07;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class BitwiseOperator {
    public static void main(String[] args) {
        System.out.println("Welcome to bitwise operator.");
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter first number :");
        int first = scanner.nextInt();
        System.out.println("Enter Second number :");
        int second = scanner.nextInt();

        // add operator
        System.out.println("Add operator : " + (first & second));
        // or operator
        System.out.println("Or operator : " + (first | second));
        // xor operator
        System.out.println("Xor operator : " + (first ^ second));
        // complement
        System.out.println("Complement of first number :" + (~first));
        // left shift
        System.out.println("right shift of first number :" + (first >> 1));
        // right shift
        System.out.println("left shift of first number :" + (first << 1));
    }
}
