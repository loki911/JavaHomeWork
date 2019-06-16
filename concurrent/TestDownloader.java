package concurrent;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class TestDownloader {

    public static void main(String[] args) {

        ExecutorService executorService = Executors.newCachedThreadPool();
        executorService.execute(new Downloader("url_1"));
        executorService.execute(new Downloader("url_2"));
        executorService.execute(new Downloader("url_3"));
        executorService.execute(new Downloader("url_4"));

        Thread attributedThread = new Thread(new AttributedRunnable(),"Attributed Thread");
        attributedThread.setPriority(Thread.MIN_PRIORITY);
        attributedThread.start();
        System.out.println(attributedThread.getName() + " has priority: " + attributedThread.getPriority());
    }
}
