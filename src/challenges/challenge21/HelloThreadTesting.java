package challenges.challenge21;

public class HelloThreadTesting {
    public static void main(String[] args) throws InterruptedException {
        HelloThread t1 = new HelloThread(1);
        HelloThread t2 = new HelloThread(2);

        long startTime = System.currentTimeMillis();
        System.out.println("starting");
        t1.start();
        t2.start();
        System.out.println("ending");
        long endTime = System.currentTimeMillis();

        t1.join();
        t2.join();

        System.out.printf("Toatal time : %d \n",(endTime-startTime));
    }
}
