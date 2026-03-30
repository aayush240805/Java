package CollectionFramework;

import java.util.concurrent.ConcurrentSkipListMap;

//Map --> Sorted --> Thread Safe Tree Map --> ConcurrentSkipListMap --> (Data stores in Skip List data structure).
// SkipList --> probabilistic data structure --> allows efficient search, insertion and deletion operation.
// It is similar to the linked list but with multiple layers that "skip" over portions of the list to provide faster access to elements.

// L3 --> 1 _ _ _ 5 _ _ _ 9
// L2 --> 1 _ 3 _ 5 _ 7 _ 9
// L1 --> 1 2 3 4 5 6 7 8 9

// If we need to search for an element then we start traversing from upper level if not found then go to next lower level.

// --> There is no strictness (things are ramdom here).

public class _18ConcurrentSkipListMap {
    public static void main(String[] args) {
        ConcurrentSkipListMap<Integer, String> cslm = new ConcurrentSkipListMap<>();
        // ConcurrentSkipListMap implemented by NavigableConcurrentMap(concurrent version of navigable map).
        // NavigableConcurrentMap extends both ConcurrentMap and NavigableMap.
    }
}
