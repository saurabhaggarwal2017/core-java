package challenges.challenge09;

import challenges.util.ArrayUtil;

public class SumAndAvgOfTwoD {
    public static void main(String[] args) {
        //Create a program to do sum and average of all elements in a 2-D array.

        System.out.println("Program of sum and avg. of 2d Array.");
        int[][] arr = ArrayUtil.input2DArray();

        int sum = sumOfTwoDArray(arr);
        float avg = avgOfTwoDArray(arr);
        System.out.println("Sum of two d arrays is : " + sum);
        System.out.println("Avg of two d arrays is : " + avg);

    }

    public static int sumOfTwoDArray(int[][] arr) {
        int i = 0, sum = 0;
        while (i < arr.length) {
            int j = 0;
            while (j < arr[i].length) {
                sum += arr[i][j];
                j++;
            }
            i++;
        }
        return sum;
    }

    public static float avgOfTwoDArray(int[][] arr) {
        if (arr.length == 0) return 0;
        float sum = sumOfTwoDArray(arr);
        float result = sum / (arr.length * arr[0].length);
        return result;
    }
}
