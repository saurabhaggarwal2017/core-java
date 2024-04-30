package challenges.util;

import java.util.Scanner;

public class ArrayUtil {
    public static Scanner scanner = new Scanner(System.in);

    public static int[] inputArray() {

        System.out.print("Enter total numbers of element in an arrays :");
        int size = scanner.nextInt();

        int[] arr = new int[size];
        int i = 0;
        while (i < size) {
            System.out.print("Enter " + (i + 1) + " element :");
            arr[i] = scanner.nextInt();
            i++;
        }
        return arr;
    }

    public static void printArray(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            System.out.print(arr[i] + ", ");
            i++;
        }
    }

    public static int[][] input2DArray() {

        System.out.print("Enter total numbers of element in row :");
        int rowSize = scanner.nextInt();
        System.out.print("Enter total numbers of element in col. :");
        int colSize = scanner.nextInt();

        int[][] arr = new int[rowSize][colSize];
        int i = 0;
        while (i < rowSize) {
            int j = 0;
            while (j < colSize) {
                System.out.print("Enter " + i + ", " + j + " element :");
                arr[i][j] = scanner.nextInt();
                j++;
            }
            i++;
        }
        return arr;
    }

    public static void print2DArray(int[][] arr) {

        int i = 0;
        while (i < arr.length) {
            int j = 0;
            while (j < arr[i].length) {
                System.out.print(arr[i][j] + ", ");
                j++;
            }
            i++;
        }
    }
}
