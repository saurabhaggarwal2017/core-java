package challenges.challenge06;

import java.util.Scanner;

public class Categories {
    public static void main(String[] args) {
        //Create a program that categorize a person into different age groups
        //Child -> below 13     Teen -> below 20
        //Adult -> below 60     Senior-> above 60

        System.out.println("Welcome in categorize a person into different age groups! ");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your age :");
        int age = scanner.nextInt();
        if(age<=13){
            System.out.println("You're a child!");
        } else if (age<=20) {
            System.out.println("You're a Teenager!");
        } else if (age<=60) {
            System.out.println("You're a adult!");
        }else{
            System.out.println("You're a senior-citizen!");
        }
    }
}
