package challenges.challenge09;

import challenges.util.ArrayUtil;

import java.util.Scanner;

public class SearchElementInTwoD {
    public static void main(String[] args) {
        // Create a program to search an element in a 2-D array.
        int[][] arr = ArrayUtil.input2DArray();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number which you are looking for :");
        int element = scanner.nextInt();

        boolean result = searchElement(arr, element);
        if (result) {
            System.out.println("Yes i found it!");
        } else {
            System.out.println("No there is no such element found it!");
        }
    }

    public static boolean searchElement(int[][] arr, int element) {
        int i = 0;
        while (i < arr.length) {
            int j = 0;
            while (j < arr[i].length) {
                if (arr[i][j] == element) {
                    return true;
                }
                j++;
            }
            i++;
        }
        return false;
    }
}
