package challenges.challenge08;

import java.util.Scanner;

public class PalindromeNumber {
    public static void main(String[] args) {

        System.out.println("Check given number is palindrome or not!");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your number :");
        int number = scanner.nextInt();

        int result = reverse(number);
        if(result == number){
            System.out.println("yeah this number is Palindrome!");
        }else{
            System.out.println("this is not a Palindrome!");
        }
    }
    public static int reverse(int number) {
        int result = 0;
        while (number > 0) {
            int digit = number % 10;
            result = (result * 10) + digit;
            number = number / 10;
        }
        return result;
    }

}
