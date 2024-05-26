package challenges.challenge21;

public class SignalTest {
    public static void main(String[] args) {
        Signal signal = new Signal();
        SignalThread t1 = new SignalThread(signal);
        SignalThread t2 = new SignalThread(signal);
        SignalThread t3 = new SignalThread(signal);

        t1.setName("RED");
        t2.setName("YELLOW");
        t3.setName("GREEN");

        t1.start();
        t2.start();
        t3.start();
    }
}
