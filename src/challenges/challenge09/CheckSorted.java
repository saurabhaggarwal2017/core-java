package challenges.challenge09;

import challenges.util.ArrayUtil;

import javax.sound.midi.Soundbank;

public class CheckSorted {
    public static void main(String[] args) {
        System.out.println("Check array is sorted or not!");
        int[] arr = ArrayUtil.inputArray();


        if (incOrder(arr) || decOrder(arr)) {
            System.out.println("Yes it is a sorted Array.");
        } else {
            System.out.println("No it is not a sorted Array.");
        }
    }

    public static boolean incOrder(int[] arr) {
        if (arr.length < 2) return true;
        int i = 0;
        while (i < arr.length - 1) {
            if (arr[i] > arr[i + 1]) {
                return false;
            }
            i++;
        }
        return true;
    }

    public static boolean decOrder(int[] arr) {
        if (arr.length < 2) return true;
        int i = 0;
        while (i < arr.length - 1) {
            if (arr[i] < arr[i + 1]) {
                return false;
            }
            i++;
        }
        return true;
    }
}
