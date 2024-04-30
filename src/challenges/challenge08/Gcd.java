package challenges.challenge08;

import java.util.Scanner;

public class Gcd {
    public static void main(String[] args) {
        System.out.println("Gcd of two numbers!");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your first Number :");
        int first = scanner.nextInt();
        System.out.println("Enter your Second Number :");
        int second = scanner.nextInt();

        if (first <= second) {
            int result = gcdOfTwoNumber(first, second);
        }
        int result = gcdOfTwoNumber(second, first);
        System.out.println("Gcd of " + first + ", " + second + " is : " + result);
    }

    public static int gcdOfTwoNumber(int first, int second) {
        int i = 2;
        int result = 1;
        while (i <= first) {
            if (first % i == 0 && second % i == 0) {
                result = i;
            }
            i++;
        }
        return result;
    }
}
