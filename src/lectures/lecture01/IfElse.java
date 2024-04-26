package lectures.lecture01;

import java.util.Scanner;

public class IfElse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("welcome to Driving licence portal :");
        System.out.println("Enter your age :");
        int age = scanner.nextInt();

        if(age<18){
            System.out.println("Sorry! you're not eligible for driving licence.");
        }else{
            System.out.println("Yeh! You're not eligible for driving licence.");
        }
    }
}
