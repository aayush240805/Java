package CollectionFramework.Streams;

import java.util.*;
import java.util.concurrent.ConcurrentSkipListSet;

public class _9Sets {
    public static void main(String[] args) {
        // Set is a collection that cannot contain duplicate elements.
        // Faster operations
        // Map --> HashMap, LinkedHashMap, TreeMap, EnumMap
        // Set --> HashSet, LinkedHashSet, TreeSet, EnumSet

//        Set<Integer> set = new HashSet<>(); // unordered but unique
//        Set<Integer> set = new LinkedHashSet<>();// Now ordered
        Set<Integer> set = new TreeSet<>();// Now in sorted ordered


//        Map<Integer, String> map = new HashMap<>();
//        Set<Integer> integers = map.keySet(); // It means Keys of HashMap (unique) is Set.

        set.add(55);
        set.add(44);
        set.add(13);
        set.add(55);
        set.add(103);
        System.out.println(set);

        // For Thread Safety
//        Set<Integer> integers = Collections.synchronizedSet(set);
        // synchronizedSet(set) -> external synchronization -> set will wrap into synchronized block -> and all operation the set will be blocked now -> performance low
        // If we will use synchronizedTreeSet here -> more complexity
        // So It is advice not to use this

        // Inplace of this we use ConcurrentSkipList
        // It is only used when data is sorted order
        Set<Integer> set1 = new ConcurrentSkipListSet<>();


        // We can insert more than 10 elements in a set at once.
        Set<Integer> integers = Set.of(1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1);

        // To make set immutable
        Collections.unmodifiableSet(integers);
//        integers.add(3);



    }
}
