package challenges.challenge21;

public class StateTesting {
    public static void main(String[] args) throws InterruptedException {
        StateOfThread t1 = new StateOfThread(1);
        System.out.printf("Current state of thread : %d is : %s.\n", t1.getNumber(), t1.getState());

        t1.start();
        System.out.printf("Current state of thread : %d is : %s.\n", t1.getNumber(), t1.getState());

        Thread.sleep(2000);
        System.out.printf("Current state of thread : %d is : %s.\n", t1.getNumber(), t1.getState());

        t1.join();
        System.out.printf("Current state of thread : %d is : %s.\n", t1.getNumber(), t1.getState());

    }
}
