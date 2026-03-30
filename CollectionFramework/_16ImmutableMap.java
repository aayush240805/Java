package CollectionFramework;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class _16ImmutableMap {
    public static void main(String[] args) {
        Map<String, Integer> map1 = new HashMap<>(); // Mutable
        map1.put("A", 1);
        map1.put("B", 2);
        Map<String, Integer> map2 = Collections.unmodifiableMap(map1); // Immutable
        System.out.println(map2);
//        map2.put("C", 3); // Throws UnsupportedOperationException

        // For this problem : Comes in Java 9 (one another clean way to create an Immutable Map
        // But this is limited as only can contain 10 key-value pairs.
        Map<String, Integer> map3 = Map.of("Shubham", 98, "Vivek", 87);
//        map3.put("D", 4); // Throws UnsupportedOperationException
        System.out.println(map3);

        // To create Immutable Map with more pairs
        Map<String, Integer> map4 = Map.ofEntries(Map.entry("Akshit", 89), Map.entry("Sonu", 67));
    }
}
