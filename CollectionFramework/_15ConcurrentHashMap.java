package CollectionFramework;

import java.util.concurrent.ConcurrentHashMap;

// ConcurrentMap extends Map and ConcurrentHashMap implements ConcurrentMap.

// Java 7
// --> Segment Based Locking (Map) --> 16 Segments --> Smaller HashMaps (each have its own lock).
// Only the segment being written to or read from is locked.
// Read Operation : Do not require locking unless there is a write operation happening on the same segment.
// Write Operation : Obviously Lock

// Java 8
// --> No segmentation
// --> It uses Compare-And-Swap Approach --> No locking except resizing(capacity exceeds by (capacity * loadFactor)) or collision(because we have to deal with linked list).

// Example 1 : using variable
// Thread A : last saw --> x = 42
// Thread A : work --> x to 50
// if -> x is still 42, then change it to 50, else -> don't change and retry.
// solution of executing loop statements again and again is : Wait for some time and try again later after short time.

// Example 2 : using HashMap
// put --> index --> isEmpty


public class _15ConcurrentHashMap {
    public static void main(String[] args) {
        ConcurrentHashMap<Integer, String> concurrentHashMap = new ConcurrentHashMap<>();

    }
}
