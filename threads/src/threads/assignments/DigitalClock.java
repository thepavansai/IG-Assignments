package threads.assignments;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DigitalClock {

    public static void main(String[] args) {
        Thread clockThread = new Thread(() -> {
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");
           // long startTime = System.currentTimeMillis();
            long duration = 60;

            while (true) {
                LocalDateTime now = LocalDateTime.now();
                duration--;
                String currentTime = now.format(formatter);
                System.out.println(currentTime);

                if (duration==0) {
                    try {
                        Thread.currentThread().join();
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                    }
                }

                try {
                    Thread.sleep(1000);
                    
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            }
        });

        clockThread.start();
    }
}