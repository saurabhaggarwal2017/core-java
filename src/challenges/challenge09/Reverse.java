package challenges.challenge09;

import challenges.util.ArrayUtil;

public class Reverse {
    public static void main(String[] args) {
        System.out.println("Reverse an array!");
        int[] arr = ArrayUtil.inputArray();

        reverse(arr);
        ArrayUtil.printArray(arr);
    }

    public static void reverse(int[] arr) {
        int i = 0;
        int j = arr.length - 1;
        while (i < j) {
            int c = arr[i];
            arr[i] = arr[j];
            arr[j] = c;
            i++;
            j--;
        }
    }
}
