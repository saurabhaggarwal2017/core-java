package challenges.challenge09;

import challenges.util.ArrayUtil;

public class MinAndMaxEle {
    public static void main(String[] args) {
        System.out.println("Finding min. and max. element in an array!");
        int[] arr = ArrayUtil.inputArray();

        int minimumElement = miniElement(arr);
        int maximumElement = maxiElement(arr);

        System.out.println("Minimum element is : " + minimumElement);
        System.out.println("Maximum element is : " + maximumElement);
    }

    public static int miniElement(int[] arr) {
        int mini = Integer.MAX_VALUE;
        int i = 0;
        while (i < arr.length) {
            if (arr[i] < mini) {
                mini = arr[i];
            }
            i++;
        }
        return mini;
    }

    public static int maxiElement(int[] arr) {
        int maxi = Integer.MIN_VALUE;
        int i = 0;
        while (i < arr.length) {
            if (arr[i] > maxi) {
                maxi = arr[i];
            }
            i++;
        }
        return maxi;
    }

}
