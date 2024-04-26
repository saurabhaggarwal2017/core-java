package challenges.challenge06;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        //.Create a program that determines if a given year is a leap year
        //(considering conditions like divisible by 4 but not 100, unless also
        //divisible by 400).

        System.out.println("Check which one year are leap year!");
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter year :");
        int year = scanner.nextInt();

        // 4,100,400 are factor of 400 if ur year are divible by 400 so its also divisible by 100 and 4 too.

        // before
//        if (year % 4 == 0 && year % 100 == 0 && year % 400 == 0) {
//            System.out.println(year + " this year is a leap year!");
//        } else if (year % 4 == 0 && year % 100 != 0) {
//            System.out.println(year + " this year is a leap year!");
//        } else {
//            System.out.println(year + " this year is not a leap year!");
//        }

        // after
        if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)) {
            System.out.println(year + " this year is a leap year!");
        } else {
            System.out.println(year + " this year is not a leap year!");
        }

    }
}
