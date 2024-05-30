package challenges.challenge23;

import java.util.List;

public class LambdaMultiplication {
    public static void main(String[] args) {
        Mutiplication<Integer> mutiplication = (a,b)->a*b;

        System.out.println(mutiplication.multiply(3,6));
        System.out.println(mutiplication.multiply(3,4));


    }
}
