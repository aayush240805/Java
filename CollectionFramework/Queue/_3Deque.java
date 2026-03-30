package CollectionFramework.Queue;

import java.util.ArrayDeque;
import java.util.Deque;

public class _3Deque {
    public static void main(String[] args) {
        // double-ended Queue
        // allows insertion & removal from both ends
        // versatile than regular queues and stack because they support all the operations of both

         /*Insertion Methods
         addFirst(E e) : inserts the specified element at the front.
         addLast(E e) : inserts the specified element at the end.

         offerFirst(E e) : inserts the specified element at the front if possible.
         offerLast(E e) : inserts the specified element at the end if possible.*/


         /*Removal Methods
         removeFirst() : retrieves and removes the first element
         removeLast() : retrieves and removes the last element

         pollFirst() : retrieves and removes the first element, or returns null if empty.
         pollLast() : retrieves and removes the last element, or returns null if empty.*/


         /*Examination Methods
         getFirst() : retrieves, but doesn't remove, the first element.
         getLast() : retrieves, but doesn't remove, the last element.
         peekFirst() : retrieves, but doesn't remove, the first element, or return null if empty.
         peekLast() : retrieves, but doesn't remove, the last element, or return null if empty.*/


         /*Stack Methods
         push(E e) : adds the element at the first (equivalent to the addFirst(E e)).
         pop() : removes and returns the first element (equivalent to the removeFirst()).*/



//        Deque<Integer> deque1 = new LinkedList<>();
        // can be use if we want insertion or deletion in middle.
        // In the case of LinkedList we need to deal with nodes(data, pointer) for some changes (manually).
        Deque<Integer> deque1 = new ArrayDeque<>();
        // Recommended to use : Due to contiguous memory locations --> faster iteration, low memory, no null allowed.
        // Circular , head , tail
        // no need to shift the elements, just shift head and tail
        deque1.addFirst(10);
        deque1.addLast(20);
        deque1.offerFirst(5);
        deque1.offerLast(25);
        // 5, 10, 20, 25
        System.out.println("First Element : " + deque1.getFirst());
        System.out.println("Last Element : " + deque1.getLast());

        deque1.removeFirst(); // remove 5
        deque1.pollLast(); // remove 25
        // current deque : 10, 20
        for (int num : deque1) {
            System.out.println(num);
        }


    }
}
