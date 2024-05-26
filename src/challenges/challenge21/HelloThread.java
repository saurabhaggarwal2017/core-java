package challenges.challenge21;

import java.awt.*;

public class HelloThread extends Thread {
    private final int threadNumber;

    public HelloThread(int threadNumber) {
        this.threadNumber = threadNumber;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.printf("Hello from Thread %d.\n", this.threadNumber);
        }
        System.out.printf("Thread %d finished...\n", this.threadNumber);
    }

    public int getThreadNumber() {
        return threadNumber;
    }
}
