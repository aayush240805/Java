package CollectionFramework;

import java.util.Arrays;
import java.util.LinkedList;

class Node {
    public int value;
    public Node next;
}

public class _3linkedList {
    public static void main(String[] args) {
        //Manually
//        Node n1 = new Node();
//        Node n2 = new Node();
//        n1.value = 1;
//        n2.value = 2;
//        n1.next = n2;
//        n2.next = null;
//        System.out.println(n1.value);
//        System.out.println(n1.next);
//        System.out.println(n2.value);
//        System.out.println(n2.next);

        //Automatically using frameworks
        LinkedList<Integer> l = new LinkedList<>();
        l.add(1);
        l.add(2);
        l.add(3);
        l.add(4);
        l.add(5);
        System.out.println(l.get(3)); // O(n)
        l.addFirst(0); // O(1)
        l.addLast(6); // O(1)
        System.out.println(l);

//        l.remove();
//        l.remove(3);
//        l.removeLast();
//        l.removeFirst();
//        l.removeFirstOccurrence(3);
//        l.removeLastOccurrence(3);

        l.removeIf(x -> x % 2 == 0); // it will remove all even Integers.
        System.out.println(l);

        LinkedList<String> animals = new LinkedList<>(Arrays.asList("Cat", "Dog", "Elephant"));
        LinkedList<String> animalsToRemove = new LinkedList<>(Arrays.asList("Dog", "Lion"));
        animals.removeAll(animalsToRemove); // it will remove common elements of both linked lists.
        System.out.println(animals);
    }
}
