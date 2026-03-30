package CollectionFramework;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Stack;

// LIFO
// Stack extends Vector (Synchronized also).
// We uses stack when we want to use its functionality but there is no limit to its methods(no restrictions).
public class _5stack {
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.add(1);
        s.add(2);
        s.add(3);
        s.add(4);
        s.add(5);
        System.out.println(s);
        Integer removeElement = s.pop();
        System.out.println(removeElement + " removed");
        System.out.println(s);
        Integer peekElement = s.peek();
        System.out.println("peek : " + peekElement);
        System.out.println(s.isEmpty());
        System.out.println(s.size());

//        s.add(3, 8); // element can be added or removed in between because stack extends vector.

        System.out.println(s.search(3)); // 1 based indexing starts from top of the stack.

        // Linked List can also be used as a Stack.
        LinkedList<Integer> l = new LinkedList<>();
        l.addLast(1);
        l.addLast(2);
        l.addLast(3);
        l.addLast(4); // push()
        l.getLast(); // peek()
        l.removeLast(); // pop()
        l.size();
        l.isEmpty();


        // ArrayList can also be used as a Stack.
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.get(arr.size() - 1); // peek()
        arr.remove(arr.size() - 1); // pop()
    }
}
