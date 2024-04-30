package challenges.challenge08;

import javax.security.sasl.SaslClient;
import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        System.out.println("Fibonacci series printing..");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your Number :");
        int num = scanner.nextInt();

        printFibo(num);

    }
    // before
//    public static void printFibo(int num){
//        int a = 0;
//        int b = 1;
//        int c = 0;
//        int i = 0;
//
//        while(i<=num){
//            if(i==0 || i==1){
//                System.out.print(i+", ");
//            }else{
//                c = a+b;
//                System.out.print(c+", ");
//                a = b;
//                b = c;
//            }
//            i++;
//        }
//    }
    //after

    public static void printFibo(int number) {
        if (number < 0) return;
        System.out.print("0, ");
        if (number == 0) return;
        System.out.print("1, ");

        int first = 0, second = 1;
        while (first + second <= number) {
            int c = first + second;
            System.out.print(c + ", ");
            first = second;
            second = c;
        }
    }

}
