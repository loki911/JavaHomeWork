package concurrent;

public class AttributedRunnable implements Runnable {

    @Override
    public void run() {
        print();
    }

    public void print() {
        for (int i = 0; i < 1000; i++) {
            System.out.println("url X downoladed");
        }
    }
}
