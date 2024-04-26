package challenges.challenge06;

import java.sql.SQLOutput;
import java.util.Scanner;

public class NumberCheck {
    public static void main(String[] args) {
        //Create a program that determines if a number is positive, negative,
        //or zero.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your number :");
        int number = scanner.nextInt();

        if(number<0){
            System.out.println("you have enter negative number!");
        }else if(number == 0){
            System.out.println("you have enter zero!");
        }else {
            System.out.println("you have enter positive number!");
        }
    }
}
