package challenges.challenge09;

import challenges.util.ArrayUtil;

public class DiagonalSum {
    public static void main(String[] args) {
//        Create a program to find the sum of two diagonal elements.
        System.out.println("the sum of two diagonal elements in 2D Array");
        int[][] arr = ArrayUtil.input2DArray();

        if (arr.length != 0 && arr.length == arr[0].length) {
            System.out.println("Sum of all diagonal : " + sumOfall(arr));
            ArrayUtil.print2DArray(arr);
        } else {
            System.out.println("row and col should be equal. try again...");
        }
    }

    public static int sumOfall(int[][] arr) {
        int sumOfFirstDiagonal = firstDiagonal(arr);
        int sumOfSecondDiagonal = secondDiagonal(arr);
        System.out.println("Sum of first diagonal : " + sumOfFirstDiagonal);
        System.out.println("Sum of Second diagonal : " + sumOfSecondDiagonal);
        int sum = sumOfFirstDiagonal + sumOfSecondDiagonal;

        if (arr.length % 2 != 0) {
            int x = arr.length / 2;
            sum -= arr[x][x];
        }
        return sum;

    }

    public static int firstDiagonal(int[][] arr) {
        int i = 0, sum = 0;
        while (i < arr.length) {
            sum += arr[i][i];
            i++;
        }
        return sum;
    }

    public static int secondDiagonal(int[][] arr) {
        int i = 0, sum = 0;
        while (i < arr.length) {
            sum += arr[i][arr.length - 1 - i];
            i++;
        }
        return sum;
    }
}
