package challenges.challenge06;

import java.util.Scanner;

public class Grading {
    public static void main(String[] args) {
        //Create a program that calculates grades based on marks
        //A -> above 90%    B -> above 75%
        //C -> above 60%    D -> above 30%
        //F -> below 30%

        System.out.println("Welcome in grade calculator!");
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your marks in percentage (%) :");
        int marks = scanner.nextInt();

        // before
//        if (marks >= 90) {
//            System.out.println("Your are got 'A' Grade.");
//        } else if (marks >= 75 && marks < 90) {
//            System.out.println("Your are got 'B' Grade.");
//        } else if (marks >= 60 && marks < 75) {
//            System.out.println("Your are got 'C' Grade.");
//        } else if (marks >= 30 && marks < 60) {
//            System.out.println("Your are got 'D' Grade.");
//        } else {
//            System.out.println("Your are got 'F' Grade.");
//        }

        // after
        if (marks >= 90) {
            System.out.println("Your are got 'A' Grade.");
        } else if (marks >= 75) {
            System.out.println("Your are got 'B' Grade.");
        } else if (marks >= 60) {
            System.out.println("Your are got 'C' Grade.");
        } else if (marks >= 30) {
            System.out.println("Your are got 'D' Grade.");
        } else {
            System.out.println("Your are got 'F' Grade.");
        }
    }
}
