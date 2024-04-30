package challenges.challenge09;

import java.util.Scanner;

public class SumAndAvg {
    public static void main(String[] args) {
        //Create a program to find the sum and average of all elements in an
        //array.

        System.out.println("Sum and average of an array elements!");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter total numbers of element in an arrays :");
        int size = scanner.nextInt();

        int[] arr = new int[size];
        int i = 0;
        while (i < size) {
            System.out.print("Enter " + (i + 1) + " element :");
            arr[i] = scanner.nextInt();
            i++;
        }

        int sumOfAllElements = sum(arr);
        System.out.println("Sum of array is : " + sumOfAllElements);
        float averageOfAllElements = average(arr);
        System.out.println("Average of array is : " + averageOfAllElements);

    }

    public static int sum(int[] arr) {
        int result = 0;
        int i = 0;
        while (i < arr.length) {
            result += arr[i];
            i++;
        }
        return result;
    }

    public static float average(int[] arr) {
        float totalSum = sum(arr);
        float result = totalSum / arr.length;
        return result;
    }
}
