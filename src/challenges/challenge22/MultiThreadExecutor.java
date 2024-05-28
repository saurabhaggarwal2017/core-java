package challenges.challenge22;

import java.util.Random;

public class MultiThreadExecutor implements Runnable {
    private int min;
    private int max;

    public MultiThreadExecutor(int min, int max) {
        this.max = max;
        this.min = min;
    }

    @Override
    public void run() {
        int random = (int) (min + Math.random() * max);
//        System.out.printf("random number : %d.\n",random);
        try {
            Thread.sleep(random);
            System.out.printf("Current Thread : %s is running.\n",Thread.currentThread().getName());
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
