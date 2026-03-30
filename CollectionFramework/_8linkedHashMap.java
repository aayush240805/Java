package CollectionFramework;

// LinkedHashMap is a subclass of HashMap, or it extends the HashMap class.
// It is used when needs to maintain the order of data elements
// it is double linked list,
// but it is slightly slower than the HashMap complexity is O(1).
// It uses some more little memory

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;


class LRU<K, V> extends LinkedHashMap<K, V> {
    private int capacity;

    public LRU(int capacity){
        super(capacity, 0.75f, true);
        this.capacity = capacity;
    }

    @Override
    protected boolean removeEldestEntry(Map.Entry<K, V> eldest) {
        return size() > capacity;
    }
}


public class _8linkedHashMap {
    public static void main(String[] args) {
        // accessOrder is false by default
        // accessOrder is used to set access order : false for insertion order, if true -> accessed data element will get inserted at end of the double linked list.
        LinkedHashMap<String, Integer> fruits = new LinkedHashMap(16, 0.75f, true);
        fruits.put("Orange", 20);
        fruits.put("Apple", 30);
        fruits.put("Banana", 24);

        // these all will get inserted at the last
        // here LRU algorithm is used. To know which data is least recently used.
        // it can be used to remove LRU data. (to maintain the cache memory)
        fruits.get("Apple");
        fruits.get("Banana");
        fruits.get("Orange");
        fruits.get("Banana");
        fruits.get("Apple");
        fruits.get("Orange");
        fruits.get("Apple");

        for (Map.Entry<String, Integer> entries : fruits.entrySet()){
            System.out.println(entries.getKey() + " : " + entries.getValue());
        }

        HashMap<String, Integer> map1 = new HashMap<>();
        LinkedHashMap<String, Integer> students = new LinkedHashMap(map1);

        students.put("Rahul", 89);
        students.put("Satish", 93);
        students.put("Arun", 81);

        Integer i = students.getOrDefault("Rahul", 0);
        System.out.println(i);

        students.putIfAbsent("Neeraj", 65);
        System.out.println(students);

        // A parent class reference can point to a child class object(Polymorphism).
        LinkedHashMap<String, Integer> stu = new LRU<>(3); // Frame Size = 3
            stu.put("Sushma", 34);
            stu.put("Himanshu", 43);
            stu.put("Manish", 42);
            stu.put("Megha", 49); // Sushma removed now

            stu.get("Sushma");

            System.out.println(stu);
    }
}
