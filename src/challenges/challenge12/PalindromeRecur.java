package challenges.challenge12;

import java.util.Scanner;

public class PalindromeRecur {
    public static void main(String[] args) {
        System.out.println("Check given string is a palindrome or not!");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your string which you want to check: ");
        String str = scanner.next();

        System.out.println("Your string is " + (isPalindrome(str) ? "Palindrome." : "Not a palindrome."));

    }

    public static boolean isPalindrome(String str) {
        if (str.length() <= 1) return true;

        int lastIndex = str.length() - 1;
        if (str.charAt(0) != str.charAt(lastIndex)) {
            return false;
        }
        String newStr = str.substring(1, lastIndex);
        return isPalindrome(newStr);
    }
}
