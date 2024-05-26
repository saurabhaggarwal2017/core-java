package challenges.challenge21;

public class SyncThread extends Thread {
    @Override
    public synchronized void run() {

        System.out.printf("Thread : %s stating.\n", getName());
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.printf("Thread : %s finished.\n", getName());
    }
}
