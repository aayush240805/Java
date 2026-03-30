package CollectionFramework;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Vector;

public class _4vector {
    public static void main(String[] args) {
        Vector<Integer> v = new Vector<>(5, 3);
        System.out.println(v.capacity());
        v.add(1); // Synchronized
        v.add(1);
        v.add(1);
        v.add(1);
        v.add(1);
        v.add(1);
        System.out.println(v.size());
        System.out.println(v.capacity());
        v.add(1);
        v.add(1);
        System.out.println(v.capacity());
        v.add(1);
        System.out.println(v.capacity());

        LinkedList<Integer> linkedList = new LinkedList<>(Arrays.asList(1,2,3));
        Vector<Integer> vector = new Vector<>(linkedList);
        System.out.println(vector);
        vector.clear();
        System.out.println(vector);
    }
}
