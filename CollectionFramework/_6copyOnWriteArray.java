package CollectionFramework;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class _6copyOnWriteArray {
    public static void main(String[] args) {
        CopyOnWriteArrayList<Integer> list = new CopyOnWriteArrayList<>();
        // "Copy On Write" means that whenever a write operation.
        // like adding or removing an element.
        // A new copy of the list is created, and the modification is applied to that copy.
        // This ensures that other threads reading the list while it's being modified are unaffected.

        // Read Operations : Fast and direct, since they happen on a stable list without interference from modifications.
        // Write Operations : A new copy of the list is created for every modification.
        //                    The reference to the list is then updated so that subsequent reads use this now list.

        // For Example : notepad -> multiple readers can read, but when write operations need then they all performs on a copy of that data.
        // Uses when more read-intensive things to do.

//        List<String> shoppingList = new ArrayList<>();
        List<String> shoppingList = new CopyOnWriteArrayList<>();
        shoppingList.add("Milk");
        shoppingList.add("Eggs");
        shoppingList.add("Bread");
        System.out.println("Initial Shopping List : " + shoppingList);

        // read + write simultaneously
        for (String item : shoppingList){
            System.out.println(item);
            // Trying to modify the list while reading.
            if(item.equals("Eggs")){
                shoppingList.add("Butter");
                System.out.println("Added Butter while reading");
            }
        }
        // New updated copy will be created and original list will be same as earlier, So readers can read the original list.
        System.out.println("Updated shopping List : " + shoppingList); // -> return ConcurrentModificationException


//        List<String> sharedList = new ArrayList<>();
        List<String> sharedList = new CopyOnWriteArrayList<>();
        sharedList.add("Item 1");
        sharedList.add("Item 2");
        sharedList.add("Item 3");

        Thread readerThread = new Thread(() -> {
            try {
                while(true) {
                    for(String item : sharedList){
                        System.out.println("Reading Item : " + item);
                        Thread.sleep(100); // Small delay to simulate work.
                    }
                }
            } catch (Exception e) {
                System.out.println("Exception in reader thread : " + e);
            }
        });

        Thread writerThread = new Thread(() -> {
            try {
                Thread.sleep(500);
                sharedList.add("Item 4");
                System.out.println("Added Item 4 to the list.");

                Thread.sleep(500);
                sharedList.remove("Item 1");
                System.out.println("Removed Item 1 from the list");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        readerThread.start();
        writerThread.start();

        // -> return ConcurrentModificationException
    }
}
