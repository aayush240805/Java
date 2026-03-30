package CollectionFramework.Queue;

import java.util.PriorityQueue;

public class _2PriorityQueue {
    public static void main(String[] args) {
        // part of the Queue interface
        // orders elements based on their natural ordering (for primitives lowest first)
        // custom comparator for custom ordering
        // doesn't allow null elements
        PriorityQueue<Integer> pq = new PriorityQueue<>(/*Comparator.reverseOrder()*/);
        pq.add(15);
        pq.add(10);
        pq.add(30);
        pq.add(5);
//        System.out.println(pq.peek());
//        pq.remove();
//        System.out.println(pq.peek());

        System.out.println(pq); // not sorted

        // after removal of each element it gets sorted automatically
        while (!pq.isEmpty()) {
            System.out.println(pq.poll());
        }

        // Internal Working
        // Priority Queue is implemented as a min-heap by default (for natural ordering).
    }
}
