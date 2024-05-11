package challenges.challenge15;

public class Test {
    public static void main(String[] args) {
//        Book book = new Book();
        ArrayOperations arrayOperations = new ArrayOperations(new int[]{1,2,3,4});
        ArrayOperations.Statistics statistics = arrayOperations.new Statistics();
        System.out.println(statistics.mean());



    }

}
