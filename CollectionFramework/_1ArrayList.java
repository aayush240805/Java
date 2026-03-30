package CollectionFramework;

import java.util.*;

public class _1ArrayList {
    public static void main(String[] args) {
        java.util.ArrayList<Integer> list = new java.util.ArrayList<>();
        list.add(2);
        list.add(4);
        list.add(6);
        System.out.println(list.get(0));
        System.out.println(list.size());

        for (int i = 0; i < list.size(); i++){
            System.out.println(list.get(i));
        }

        for (int i : list){
            System.out.println(i);
        }

        System.out.println(list.contains(2));
        System.out.println(list.contains(8));

        list.remove(2);

        list.add(1, 3);

        for (int i : list){
            System.out.println(i);
        }

        list.set(2, 40);

        for (int i : list){
            System.out.println(i);
        }


        List<String> list1 = new java.util.ArrayList<>();
        System.out.println(list1.getClass().getName());

        // To create a list on the fly/spot
        List<String> list2 = Arrays.asList("Monday", "Tuesday", "Wednesday"); // <- Returns fixed-size array.
        System.out.println(list2.getClass().getName());
//        list2.add("Thursday"); // return exception (can't add or remove an element).
        list2.set(2, "Thursday"); // we can only replace an element.

        String[] array = {"Apple", "Banana", "Mango"};
        List<String> list3 = Arrays.asList(array);
        System.out.println(list3.getClass().getName());

        List<String> list4 = new java.util.ArrayList<>(list3);
        list4.add("Guava");
        System.out.println(list4);
        list4.add(2, "Orange");
        System.out.println(list4);

        List<Integer> list5 = List.of(1, 2, 3, 4); // Completely Immutable
//        list4.set(3,2); // even we can't replace an element.
        list.addAll(list5);
        System.out.println(list);

//        list5.addAll(list); // return Exception

        List<Integer> list6 = new java.util.ArrayList<>();
        list6.add(1);
        list6.add(2);
        list6.add(3);
        list6.add(1);
        list6.add(4);

//        list6.remove(0); // removes by index
        list6.remove(Integer.valueOf(1)); // removes 1st occurrence of given element.
        System.out.println(list6);

        //converting a list into an array
        Object[] array1 = list6.toArray();
        Integer[] array2 = list6.toArray(new Integer[0]); // to tell the compiler which type of an array we want.

        //To sort a list
//        Collections.sort(list6);
        list6.sort(null);
        System.out.println(list6);
    }
}
