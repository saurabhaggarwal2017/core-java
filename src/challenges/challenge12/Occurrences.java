package challenges.challenge12;

import challenges.util.ArrayUtil;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class Occurrences {
    public static void main(String[] args) {
        //Create a program using for-each to the occurrences of a specific element in an
        //array.
        int[] arr = ArrayUtil.inputArray();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter you number which you want to find the occurrences: ");
        int number = scanner.nextInt();
        int occ = 0;
        for (int num : arr) {
            if (num == number) {
                occ++;
            }
        }
        System.out.println("Number of Occurrences of a " + number + " is: " + occ);
    }
}
