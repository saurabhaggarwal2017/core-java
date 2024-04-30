package challenges.challenge09;

import challenges.util.ArrayUtil;

public class Palindrome {
    public static void main(String[] args) {
        //Create a program to check is the array is palindrome or not.
        System.out.println("Welcome in checking palindrome array program!");
        int[] arr = ArrayUtil.inputArray();
        boolean result = isPalindrome(arr);
        if (result) {
            System.out.println("Yes it is palindrome array!");
        } else {
            System.out.println("No it is not a palindrome array!");
        }
    }

    public static boolean isPalindrome(int[] arr) {
        int i = 0;
        int j = arr.length - 1;
        while (i < j) {
            if (arr[i] != arr[j]) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}
