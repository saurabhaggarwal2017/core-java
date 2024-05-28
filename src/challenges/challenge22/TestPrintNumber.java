package challenges.challenge22;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class TestPrintNumber {
    public static void main(String[] args) {
        ExecutorService service = null;
        try {
            service = Executors.newSingleThreadExecutor();
            PrintNumber printNumber = new PrintNumber();
            service.submit(printNumber);

        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }
}
