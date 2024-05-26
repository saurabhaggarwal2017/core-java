package challenges.challenge21;

class Signal {


    public synchronized void currentSignal() {
        try {
            System.out.printf("Currently signal is : %s.\n", Thread.currentThread().getName());
            Thread.sleep(5000);
            System.out.printf("now %s signal is over.\n", Thread.currentThread().getName());
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }
}

