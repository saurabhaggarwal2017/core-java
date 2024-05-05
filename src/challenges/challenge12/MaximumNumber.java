package challenges.challenge12;

import java.io.FilterOutputStream;
import java.util.Scanner;

public class MaximumNumber {
    public static void main(String[] args) {
        System.out.println("Maximum number in integer array!");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter no. of element in a array: ");
        int size = scanner.nextInt();
        int[] arr = new int[size];

        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter you element at index " + i + " : ");
            arr[i] = scanner.nextInt();
        }
        int maximumElement = maxi(arr);
        System.out.println("Maximum element is " + maximumElement);
    }

    public static int maxi(int[] arr) {
        int result = Integer.MIN_VALUE;
        for (int num : arr) {
            if (num > result) {
                result = num;
            }
        }
        return result;
    }
}
