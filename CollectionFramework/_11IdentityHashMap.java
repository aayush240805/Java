package CollectionFramework;

import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.Map;

public class _11IdentityHashMap {
    public static void main(String[] args) {
        String key1 = new String("key"); // they both will have same hashCode()
        String key2 = new String("key"); // key1 is replaced by key2 with value 2
        Map<String, Integer> map = new HashMap<>();
        //In the case of HashMap, the hashCode() of class(String) will run
        map.put(key1, 1);
        map.put(key2, 2);

        System.out.println(key1.hashCode());
        System.out.println(key2.hashCode());

        System.out.println(key1.equals(key2)); // true
        System.out.println(map);

        Map<String, Integer> map1 = new IdentityHashMap<>();
        //In the case of IdentityHashMap, it doesn't matter whether the class(String) has hashCode() or not
        // In IdentityHashMap hashCode() of the object class will run
        String fruit1 = new String("Apple"); // they both have different address.
        String fruit2 = new String("Apple"); // Means they have unique identity.

        map1.put(fruit1, 1);
        map1.put(fruit2, 2);

        System.out.println(System.identityHashCode(fruit1));
        System.out.println(System.identityHashCode(fruit2));

        // There we use IdentityHashCode and ==
        System.out.println(fruit1 == fruit2);
        System.out.println(map1);

    }
}
