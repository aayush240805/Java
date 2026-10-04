package CollectionFramework.Queue;

import java.util.Comparator;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.SynchronousQueue;

class Producer implements Runnable {
    private BlockingQueue<Integer> queue;
    private int value = 0;

    public Producer(BlockingQueue<Integer> queue) {
        this.queue = queue;
    }

    @Override
    public void run() {
        while (true) {
            try {
                System.out.println("Producer produced : " + value);
                queue.put(value++); // wait if full
                Thread.sleep(1000);
            } catch (Exception e) {
                Thread.currentThread().interrupt();
                System.out.println("Producer Interrupted");
            }
        }
    }
}

class Consumer implements Runnable {
    private BlockingQueue<Integer> queue;

    public Consumer(BlockingQueue<Integer> queue) {
        this.queue = queue;
    }

    @Override
    public void run() {
        while (true) {
            try {
                Integer value = queue.take(); // wait if empty
                System.out.println("Consumer consumed : " + value);
                Thread.sleep(2000);
            } catch (Exception e) {
                Thread.currentThread().interrupt();
                System.out.println("Consumer Interrupted");
            }
        }
    }
}

public class _3BlockingQueue {
    public static void main(String[] args) {
        // Thread-Safe Queue
        // wait for queue to become non-empty / wait for space
        // simplifies concurrency problems like producer-consumer
        // Standard Queue --> immediately
             // empty --> remove (no waiting)
             // full --> add (no waiting)

        // Blocking Queue -->
            // put --> blocks if the queue is full until space becomes available.
            // take --> blocks if the queue is empty until an element becomes available.
            // offer --> waits for space to become available, upto the specified timeout.




        BlockingQueue<Integer> queue = new ArrayBlockingQueue<>(5);
        // A bounded, blocking queue backed by an circular array
        // low memory overhead
        // uses a single lock for both enqueue and dequeue operations(e.g. in case of producer-consumer)
        // if more threads --> problem
        // should be used when few threads

        Thread T1 = new Thread(new Producer(queue));
        Thread T2 = new Thread(new Consumer(queue));

        T1.start();
        T2.start();



        BlockingQueue<Integer> queue1 = new LinkedBlockingQueue<>(5);
        // Optionally bounded backed by LinkedList
        // uses two separate locks for enqueue and dequeue operations
        // higher concurrency between producer and consumer --> throughput increases, waiting decreases
        // should be used when more threads



        BlockingQueue<String> queue2 = new PriorityBlockingQueue<>(11, Comparator.reverseOrder());
        // Unbounded
        // Binary heap as an array and can grow dynamically
        // head is based on their natural ordering or a provided Comparator like priority queue
        // it means not sorted
        // put() won't block
        queue2.add("Apple");
        queue2.add("Banana");
        queue2.add("Guava");
        System.out.println(queue2);


        BlockingQueue<Integer> queue3 = new SynchronousQueue<>();
        // each insert operation must wait for a corresponding remove operation by another thread and vice versa.
        // it can't store element until another is removed, capacity of at most one element
    }
}
