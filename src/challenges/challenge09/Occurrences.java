package challenges.challenge09;

import challenges.util.ArrayUtil;

import java.util.Scanner;

public class Occurrences {
    public static void main(String[] args) {
        //Create a program to find number of occurrences of an element in an
        //array.
        System.out.println("Number of occurrences of an element in array!");
        int[] arr = ArrayUtil.inputArray();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter you number which you want to count no. of occurrences : ");
        int number = scanner.nextInt();
        int result = noOfOccurrences(arr, number);
        System.out.println("The no. of occurrences of " + number + " is :" + result);
    }

    public static int noOfOccurrences(int[] arr, int num) {
        int occ = 0;
        int i = 0;
        while (i < arr.length) {
            if (arr[i] == num) {
                occ++;
            }
            i++;
        }
        return occ;
    }
}
