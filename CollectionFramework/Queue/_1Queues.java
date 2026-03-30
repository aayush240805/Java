package CollectionFramework.Queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

public class _1Queues {
    public static void main(String[] args) {
        // LinkedList can act as Stack & Queue

        LinkedList<Integer> list = new LinkedList<>();
        // Stack
//        list.addFirst(1); // push
//        list.addFirst(2); // push
//        list.addFirst(3); // push
//        System.out.println(list);
//        list.removeFirst(); // pop
//        System.out.println(list);

        //Queue
//        list.addLast(1); // enqueue
//        list.addLast(2); // enqueue
//        list.addLast(3); // enqueue
//        System.out.println(list);
//        int p = list.removeFirst(); // dequeue
//        System.out.println(list);
//        System.out.println(list.getFirst()); // peek



        // QUEUE
        // It is an interface extends collection
        // LinkedList and ArrayBlockingQueue are its implementations

        Queue<Integer> queue = new LinkedList<>() ;
//        queue.add(1);
//        System.out.println(queue.size());
//
//        System.out.println(queue.remove()); // throws an exception if empty
//        System.out.println(queue.poll()); // returns null if empty (Better)
//
//        System.out.println(queue.element()); // throws an exception if empty
//        System.out.println(queue.peek()); // return null if empty



        Queue<Integer> queue1 = new ArrayBlockingQueue<>(2);
        System.out.println(queue1.add(1)); // true
        System.out.println(queue1.offer(2)); // true

//        queue1.add(3); // throws exception
        System.out.println(queue1.offer(4)); // false (Better)

    }
}
