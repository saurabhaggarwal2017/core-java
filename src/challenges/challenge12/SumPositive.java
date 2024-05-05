package challenges.challenge12;

import challenges.util.ArrayUtil;

public class SumPositive {
    public static void main(String[] args) {
        //Create a program using continue to sum all positive numbers entered by the
        //user; skip any negative numbers.
        int[] arr = ArrayUtil.inputArray();
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) {
                continue;
            }
            sum += arr[i];
        }
        System.out.println("Sum of all positive number is : " + sum);

    }
}
