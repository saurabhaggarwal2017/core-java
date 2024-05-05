package challenges.challenge12;

import challenges.util.ArrayUtil;

public class PrintEven {
    public static void main(String[] args) {
        //Create a program using continue to print only even numbers using continue for
        //odd numbers.
        int[] arr = ArrayUtil.inputArray();
        for (int num : arr) {
            if (num % 2 != 0) {
                continue;
            }
            System.out.println(num);
        }
    }
}
