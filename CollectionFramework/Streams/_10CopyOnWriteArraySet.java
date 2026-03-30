package CollectionFramework.Streams;

import java.util.concurrent.ConcurrentSkipListSet;
import java.util.concurrent.CopyOnWriteArraySet;

public class _10CopyOnWriteArraySet {
    public static void main(String[] args) {
        // Thread-Safe
        // Copy-On-Write mechanism
        // No duplicate elements
        // Iterators do not reflect modifications immediately
        // More memory consumption

        // here we see CopyOnWriteArraySet VS ConcurrentSkipListSet

        CopyOnWriteArraySet<Integer> copy = new CopyOnWriteArraySet<>();
        ConcurrentSkipListSet<Integer> concurrent = new ConcurrentSkipListSet<>();

        for (int i = 1; i <= 5; i++) {
            copy.add(i);
            concurrent.add(i);
        }

        System.out.println("Initial CopyOnWriteArraySet : " + copy);
        System.out.println("Initial ConcurrentSkipListSet : " + concurrent);

        System.out.println("\n Iterating and modifying CopyOnWriteArraySet : ");

        // Data Consistency
        for (Integer i : copy) {
            System.out.println("Reading from CopyOnWriteArraySet : " + i);
            // Attempting to modify the set during iteration
            copy.add(6);
        }

        System.out.println("After modification CopyOnWriteArraySet : " + copy);


        // ConcurrentSkipList is weakly consistence
        // during  it may reflect modifications immediately
        for (Integer i : copy) {
            System.out.println("Reading from ConcurrentSkipListSet : " + i);
            // Attempting to modify the set during iteration
            concurrent.add(6);
        }

        System.out.println("After modification ConcurrentSkipListSet : " + concurrent);
    }
}
