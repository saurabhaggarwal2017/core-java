package challenges.challenge11;

import java.util.Scanner;

public class StudentScore {
    public static void main(String[] args) {
        //Create a program to Based on a student's score, categorize as
        //"High", "Moderate", or "Low" using the ternary operator (e.g.,
        //High for scores > 80, Moderate for 50-80, Low for < 50).

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your marks :");
        int marks = scanner.nextInt();

        String result = marks > 80 ? "High" : marks > 50 ? "Moderate" : "Low";
        System.out.println("Your marks is : " + result);

    }
}
