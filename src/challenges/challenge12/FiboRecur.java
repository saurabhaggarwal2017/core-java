package challenges.challenge12;

import java.util.Scanner;

public class FiboRecur {
    public static void main(String[] args) {
        System.out.println("Fibonacci series using recursion.");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your number till you want the fibo series: ");
        int number = scanner.nextInt();

        for (int i = 0; i <= number; i++) {
            int result = fibo(i);
            System.out.print(result + ", ");
        }
    }

    public static int fibo(int number) {
        if (number == 0 || number == 1) return number;
        return fibo(number - 1) + fibo(number - 2);
    }
}
