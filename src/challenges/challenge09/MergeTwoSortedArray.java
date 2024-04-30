package challenges.challenge09;

import challenges.util.ArrayUtil;

public class MergeTwoSortedArray {
    public static void main(String[] args) {
        System.out.println("Merge two sorted array!");
        System.out.println("Enter your first array : ");
        int[] arr1 = ArrayUtil.inputArray();
        System.out.println("Enter your Second array : ");
        int[] arr2 = ArrayUtil.inputArray();

        int[] newArr = merge(arr1, arr2);
        ArrayUtil.printArray(newArr);
    }

    public static int[] merge(int[] arr1, int[] arr2) {
        int i = 0, j = 0, k = 0;
        int[] newArray = new int[arr1.length + arr2.length];
        // before
//        while (i < arr1.length && j < arr2.length) {

        while (i < arr1.length || j < arr2.length) {
            /*
            if (arr1[i] <= arr2[j]) { // before

             if j == arr2.length so if we do arr1[i] <= arr2[j] so iyts give me index out of bound exception thats
             why we check first j == arr2.length and if i==arr1.length then still arr1[i] <= arr2[j] that condition
                    give index out of bound exception
            */
            if (j == arr2.length || (i < arr1.length && arr1[i] <= arr2[j])) {
                newArray[k] = arr1[i];
                i++;
            } else {
                newArray[k] = arr2[j];
                j++;
            }
            k++;
        }
        // before
//        while (i < arr1.length) {
//            newArray[k] = arr1[i];
//            i++;
//            k++;
//        }
//        while (j < arr2.length) {
//            newArray[k] = arr2[j];
//            j++;
//            k++;
//        }

        return newArray;
    }
}
