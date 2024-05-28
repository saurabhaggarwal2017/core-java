package challenges.challenge22;

import java.util.concurrent.Callable;

public class FactorialCallable implements Callable<Integer> {
    private int number;

    public FactorialCallable(int number) {
        this.number = number;
    }

    @Override
    public Integer call() throws Exception {
        return factorial(this.number);
    }

    private int factorial(int num) {
        if (num == 0 || num == 1) return 1;
        return num * factorial(num - 1);
    }
}
