package challenges.challenge21;

class StateOfThread extends Thread {
    private final int number;

    public StateOfThread(int number) {
        this.number = number;
    }

    @Override
    public void run() {
        try {
            Thread.sleep(4000);
            System.out.printf("Current state of thread : %d is : %s.\n", this.number, getState());
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public int getNumber() {
        return number;
    }
}
