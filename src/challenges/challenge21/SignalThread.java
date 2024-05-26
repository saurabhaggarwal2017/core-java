package challenges.challenge21;

public class SignalThread extends Thread {
    private final Signal signal;

    public SignalThread(Signal signal) {
        this.signal = signal;
    }

    @Override
    public void run() {
        signal.currentSignal();
    }
}
