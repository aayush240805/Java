package CollectionFramework.Queue;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.SynchronousQueue;

public class _4SynchronousQueue {
    public static void main(String[] args) {
        BlockingQueue<String> queue = new SynchronousQueue<>();

        Thread Producer = new Thread(() -> {
            try{
                System.out.println("Producer is waiting to transfer...");
                queue.put("Hello from Producer!");
                System.out.println("Producer has transferred the message");
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                System.err.println("Producer was interrupted");
            }
        });

        Thread Consumer = new Thread(() -> {
            try{
                System.out.println("Consumer is waiting to receive...");
                String message = queue.take();
                System.out.println("Consumer received : " + message);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                System.err.println("Consumer was interrupted");
            }
        });

        Producer.start();
        Consumer.start();
    }
}
