package concurrent;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.net.URL;

public class Downloader implements Runnable {
    private final String url;

    public Downloader(String url) {
        this.url = url;
    }

    @Override
    public void run() {
        downloadFile();
    }

    private synchronized void downloadFile() {
        try (BufferedInputStream in = new BufferedInputStream(new URL(url).openStream())) {
            in.read();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
