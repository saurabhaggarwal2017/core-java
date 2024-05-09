package challenges.challenge13;

import java.util.Scanner;

public class StringBuilderChallenge {
    public static void main(String[] args) {
        System.out.print("Enter no. of element in an array: ");
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();

        String[] arr = new String[size];
        for (int i = 0; i < size; i++) {
            System.out.printf("Enter your %d th element: ", i);
            arr[i] = scanner.next();
        }

        StringBuilder str = new StringBuilder();
        for (int i = 0; i < arr.length; i++) {
            str.append(arr[i]).append(", ");
        }
        System.out.println(str);
    }
}
