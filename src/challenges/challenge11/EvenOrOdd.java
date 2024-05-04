package challenges.challenge11;

import java.util.Scanner;

public class EvenOrOdd {
    public static void main(String[] args) {
        //Create a program to find the minimum of two numbers
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your number :");
        int number = scanner.nextInt();

        boolean result = number % 2 == 0 ? true : false;
        if(result){
            System.out.println("yes it is even number.");
        }else{
            System.out.println("no it is not even number.");
        }
    }
}
