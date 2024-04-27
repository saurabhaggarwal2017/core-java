package challenges.challenge07;

import java.util.Scanner;

public class OddEvenUsingBit {
    public static void main(String[] args) {
        System.out.println("Check odd or even number using bitwise operator!");
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your number : ");
        int number = scanner.nextInt();

        if((number&1)==1){
            System.out.println("You have enter odd number!");
        }else{
            System.out.println("You have enter even number!");
        }
    }
}
