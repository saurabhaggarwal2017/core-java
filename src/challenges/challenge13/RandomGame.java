package challenges.challenge13;

import java.util.Scanner;

public class RandomGame {
    int randomNumber;
    int minNumber;
    int maxNumber;
    int numberOfChance;

    RandomGame(int minNumber, int maxNumber, int numberOfChance) {
        this.maxNumber = maxNumber;
        this.minNumber = minNumber;
        this.numberOfChance = numberOfChance;
        this.randomNumber = (int) (Math.random() * maxNumber) + minNumber;
        System.out.printf("Guess the number in between %d to %d and you have %d chances. \n",
                this.minNumber, this.maxNumber, this.numberOfChance);

    }

    RandomGame(int minNumber, int maxNumber) {
        this(minNumber, maxNumber, 5);
    }

    void guessTheNumber() {
        Scanner scanner = new Scanner(System.in);
        int i = 1;
        for (; i <= this.numberOfChance; i++) {
            System.out.print("Enter your number: ");
            int number = scanner.nextInt();
            if (number == randomNumber) {
                System.out.println("Yeh!! you got it. you won the game.");
                break;
            } else if (number < randomNumber) {
                System.out.println("your number is lesser. try again.");
            } else {
                System.out.println("your number is greater. try again.");
            }
            System.out.printf("Number of chances left: %d \n\n", (this.numberOfChance - i));
        }
        if (i > this.numberOfChance) {
            System.out.println("You lose the game better luck next time.");
        }

    }

    public static void main(String[] args) {
        RandomGame game = new RandomGame(1, 5);
        game.guessTheNumber();
    }


}
