package challenges.challenge09;

import challenges.util.ArrayUtil;

import java.util.Scanner;

public class DeletingElement {
    public static void main(String[] args) {
        //Create a program to return a new array deleting a specific element.
        System.out.println("Deleting element from the array and return new array.");
        int[] arr = ArrayUtil.inputArray();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number which you want to delete.");
        int number = scanner.nextInt();

        int[] newArr = deletingSpecificElement(arr, number);
        System.out.print("new array is : ");
        int i = 0;
        while (i < newArr.length) {
            System.out.print(newArr[i] + ", ");
            i++;
        }
    }

    public static int[] deletingSpecificElement(int[] arr, int number) {
        int totalOcc = noOfOccrences(arr, number);
        if (totalOcc == 0) return arr;
        int[] newArray = new int[arr.length - totalOcc];
        int i = 0;
        int j = 0;
        while (i < arr.length) {
            if (arr[i] != number) {
                newArray[j] = arr[i];
                j++;
            }
            i++;
        }
        return newArray;
    }

    public static int noOfOccrences(int[] arr, int number) {
        int result = 0;
        int i = 0;
        while (i < arr.length) {
            if (arr[i] == number) {
                result++;
            }
            i++;
        }
        return result;
    }
}
