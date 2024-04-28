package challenges.challenge08;

import java.util.Scanner;

public class Pattern {
    public static void main(String[] args) {

        System.out.println("Print pattern !");
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your number :");
        int number = scanner.nextInt();

        printPattern01(number);
        System.out.println();
        printPattern02(number);
        System.out.println();
        printPattern03(number);
    }

    public static void printPattern01(int number) {
        int i = 1;
        while (i <= number) {
            int j = 1;
            while (j <= i) {
                System.out.print("* ");
                j++;
            }
            System.out.println();
            i++;
        }
    }

    public static void printPattern02(int number) {
        int i = 0;
        while (i < number) {
            int j = 0;
            while (j < number - i) {
                System.out.print("* ");
                j++;
            }
            System.out.println();
            i++;
        }
    }

    public static void printPattern03(int number) {
        int i = 1;
        while (i <= number) {
            int j = 1;
            while (j <= number - i) {
                System.out.print("  ");
                j++;
            }
            int k = 1;
            while (k <= i) {
                System.out.print("* ");
                k++;
            }
            System.out.println();
            i++;
        }
    }
}
