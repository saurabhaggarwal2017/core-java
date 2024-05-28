package challenges.challenge22;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

import static java.util.concurrent.Executors.newFixedThreadPool;

public class FactorialTest {
    public static void main(String[] args) {

        try (ExecutorService service = Executors.newFixedThreadPool(2)) {
            FactorialCallable callable1 = new FactorialCallable(5);
            FactorialCallable callable2 = new FactorialCallable(6);
            FactorialCallable callable3 = new FactorialCallable(7);
            FactorialCallable callable4 = new FactorialCallable(8);

            Future<Integer> fact1 = service.submit(callable1);
            Future<Integer> fact2 = service.submit(callable2);
            Future<Integer> fact3 = service.submit(callable3);
            Future<Integer> fact4 = service.submit(callable4);

            System.out.println(fact1.get());
            System.out.println(fact2.get());
            System.out.println(fact3.get());
            System.out.println(fact4.get());


        } catch (ExecutionException e) {
            throw new RuntimeException(e);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
