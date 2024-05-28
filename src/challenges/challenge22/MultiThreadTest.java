package challenges.challenge22;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class MultiThreadTest {
    public static void main(String[] args) {
        try (ExecutorService service = Executors.newFixedThreadPool(3)) {
            MultiThreadExecutor t1 = new MultiThreadExecutor(1000, 5000);
            MultiThreadExecutor t2 = new MultiThreadExecutor(1000, 5000);
            MultiThreadExecutor t3 = new MultiThreadExecutor(1000, 5000);
            MultiThreadExecutor t4 = new MultiThreadExecutor(1000, 5000);

            service.submit(t1);
            service.submit(t2);
            service.submit(t3);
            service.submit(t4);

            service.shutdown();

            if(!service.awaitTermination(10, TimeUnit.SECONDS)){
                System.out.println("Emergency Shutdown..");
                service.shutdownNow();
            }

        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }


    }
}
