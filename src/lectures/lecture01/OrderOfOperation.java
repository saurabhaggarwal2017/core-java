package lectures.lecture01;

public class OrderOfOperation {
    public static void main(String[] args) {
        // bodmas - bracket order divide multiply add subtract

        // tell me output of 9/3/3 - ?
        // possible answers : - 9 and 1

        System.out.println(9 / 3 / 3);
        // answer 1 because of order .
        System.out.println(9 / (3 / 3));
        // answer 9 because of bracket .


    }
}
