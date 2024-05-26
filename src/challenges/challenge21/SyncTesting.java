package challenges.challenge21;

public class SyncTesting {
    public static void main(String[] args) throws InterruptedException {
        SyncThread t1 = new SyncThread();
        SyncThread t2 = new SyncThread();
        SyncThread t3 = new SyncThread();

        t1.setName("01");
        t2.setName("02");
        t3.setName("03");

        t1.start();
        t1.join();

        t2.start();
        t2.join();

        t3.start();
        t3.join();



    }
}
