package CollectionFramework.Queue;

import java.util.concurrent.ConcurrentLinkedQueue;

public class _6ConcurrentLinkedQueue {
// ConcurrentListQueue is an implementation of the Queue interface.
    //--> Supports lock-free, thread-safe operations.

    private static ConcurrentLinkedQueue<String> taskQueue = new ConcurrentLinkedQueue<>();

    public static void main(String[] args) {
        Thread producer = new Thread(() -> {
            while (true) {
                try {
                    taskQueue.add("Task" + System.currentTimeMillis()); // Adds task (will use locks internally)
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });

        Thread consumer = new Thread(() -> {
            while (true) {
                try {
                    String task = taskQueue.poll(); // Takes task (will use locks internally)
                    System.out.println("Processing:" + task);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });

        producer.start();
        consumer.start();
    }
}
