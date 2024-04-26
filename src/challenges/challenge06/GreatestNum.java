package challenges.challenge06;

import java.util.Scanner;

public class GreatestNum {
    public static void main(String[] args) {
        //Create a program that determines the greatest of the three
        //numbers.
        System.out.println("Welcome to finding greatest number between 3 numbers");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first Number : ");
        int first = scanner.nextInt();
        System.out.println("Enter Second Number : ");
        int second = scanner.nextInt();
        System.out.println("Enter Third Number : ");
        int third = scanner.nextInt();

        if(first>second && first>third){
            System.out.println("First number is greater then all");
        } else if (second>first && second>third) {
//        } else if (second>first) { // we can write like that too because if first greater than second so first
            // is greater than all and if smaller than second so still if else block will run
            System.out.println("Second number is greater then all");
        }else {
            System.out.println("Third number is greater then all");
        }

    }
}
