package challenges.challenge24;

public class FunctionalInterfaceTest {
    public static void main(String[] args) {
        FunctionalInterfaceFirst functional = (num->{
            for (int i = 2;i<num;i++){
                if(num%i==0) return false;
            }
            return true;
        });

        System.out.println(functional.isPrime(17));
    }
}
