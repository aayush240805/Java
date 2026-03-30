package CollectionFramework;

// We don't use this only for knowledge purpose.
// HashTable is a legacy class.
// Now it has replaced by ConcurrentHashMap.
// It implements Map just like HashMap.
// Thread Safe : Synchronized
// Neither the key nor value can be null.
// Slower than HashMap because of Multi-Threading (Synchronization).
// HashMap uses BST if collision occurs, But it uses LinkedList.
// All methods are Synchronized including get() method (read).
// Even get() is also Synchronized -> whole data Structure is locked -> that's why need of ConcurrentHashMap.

import java.util.HashMap;
import java.util.Hashtable;

public class _14HashTable {
    public static void main(String[] args) throws InterruptedException {
        Hashtable<Integer, String> hashtable = new Hashtable<>();
        hashtable.put(1, "Apple");
        hashtable.put(2, "Banana");
        hashtable.put(3, "Orange");

//        hashtable.put(null, "Guava"); // Throws NullPointerException
//        hashtable.put(4, null); // Throws NullPointerException

        System.out.println(hashtable);
        System.out.println("value for key 2 : " + hashtable.get(2));
        hashtable.remove(2);
        System.out.println(hashtable);

//        HashMap<Integer, String> map1 = new HashMap<>(); // Not Thread-Safe (Asynchronized).
        Hashtable<Integer, String> map1 = new Hashtable<>(); // -> Thread-Safe (Synchronized).
        Thread T1 = new Thread(() -> {
            for (int i = 0; i < 1000; i++){
                map1.put(i, "Thread 1");
            }
        });

        Thread T2 = new Thread(() -> {
            for (int i = 1000; i < 2000; i++){
                map1.put(i, "Thread 2");
            }
        });

        T1.start();
        T2.start();

        T1.join();
        T2.join();

        System.out.println("Size of HashMap : " + map1.size());
    }
}
