package CollectionFramework.Queue;

import java.util.concurrent.ConcurrentLinkedDeque;

public class _7ConcurrentLinkedDeque {
    public static void main(String[] args) {
        // Non-blocking, Thread-Safe double-ended queue
        // Follows Compare-And-Swap strategy
        ConcurrentLinkedDeque<String> deque = new ConcurrentLinkedDeque<>();
        deque.add("Element 1");
        deque.addFirst("Element 0");
        deque.addLast("Element 2");
        System.out.println(deque);

        System.out.println(deque.removeFirst());
        System.out.println(deque.removeLast());
    }
}
