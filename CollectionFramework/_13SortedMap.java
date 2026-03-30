package CollectionFramework;

// SortedMap
// It is an interface that extends Map.
// It guarantees that the entries are sorted based on the keys, either in their natural ordering or by a specified Comparator.
// And it is implemented by TreeMap(Implementation Class).

// TreeMap
// It is Red-Black Tree or Self Balancing Binary Search Tree.
// Time Complexity of every operation is O(n)

// NavigableMap
// It extends the SortedMap and implemented by TreeMap(Implementation Class).
// It provides more powerful navigation options such as finding the closest matching key or retrieving the map in reverse order.

import java.util.NavigableMap;
import java.util.SortedMap;
import java.util.TreeMap;

public class _13SortedMap {
    public static void main(String[] args) {
        SortedMap<Integer, String> sortedMap = new TreeMap<>((a, b) -> b - a);
        sortedMap.put(89, "Hemant");
        sortedMap.put(76, "Sudha");
        sortedMap.put(55, "Charu");
        sortedMap.put(96, "Naresh");

//        System.out.println(sortedMap);// return the key & values in sorted order.
//
//        // need of SortedMap due to its some good methods.
//        System.out.println(sortedMap.get(55));
//        System.out.println(sortedMap.containsKey(55));
//        System.out.println(sortedMap.containsValue("Chirag"));
//        System.out.println(sortedMap.firstKey());
//        System.out.println(sortedMap.lastKey());
//        System.out.println(sortedMap.headMap(76)); // exclude the input
//        System.out.println(sortedMap.tailMap(89)); // include the input


        NavigableMap<Integer, String> navigableMap = new TreeMap<>();
        navigableMap.put(3, "Three");
        navigableMap.put(4, "Four");
        navigableMap.put(1, "One");
        navigableMap.put(5, "Five");

        System.out.println(navigableMap);
        System.out.println(navigableMap.lowerEntry(3));
        System.out.println(navigableMap.ceilingEntry(1));
        System.out.println(navigableMap.ceilingEntry(2));
        System.out.println(navigableMap.higherEntry(2));
        System.out.println(navigableMap.descendingMap());
    }
}
