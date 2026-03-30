package CollectionFramework.Streams;

import java.time.Instant;

public class _15Instant {
    public static void main(String[] args) {
        long currentTimeMillis = System.currentTimeMillis(); // in milliseconds
        System.out.println(currentTimeMillis);
        Instant now = Instant.now(); // in nano second, Z -> UTC
        System.out.println(now);
    }
}
