package CollectionFramework;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class _19Iterable {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);

        // ArrayList implements List extends Collection extends iterable
        // ArrayList implements iterator --> make possible to use forEach loop

        for (int i : list){
            System.out.println(i);
        }

        // Internal working of forEach loop
        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        // Iterator provides functionality of update (remove) while iteration (read).
        Iterator<Integer> itr = list.iterator();
        while (itr.hasNext()) {
            Integer number = itr.next();
            if (number % 2 == 0){
                itr.remove();
            }
        }

        System.out.println(list);

        Iterator<Integer> iterator1 = list.listIterator();
        while (iterator1.hasNext()){
            System.out.println(iterator1.next());
        }
    }
}
