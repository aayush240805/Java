package _32ExecutorFramework;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.*;

public class invokeAll {
    public static void main(String[] args) {
        Callable<Integer> c1 = () -> {
            Thread.sleep(1000);
            System.out.println("Task 1");
            return 1;
        };
        Callable<Integer> c2 = () -> {
            Thread.sleep(1000);
            System.out.println("Task 2");
            return 2;
        };
        Callable<Integer> c3 = () -> {
            Thread.sleep(1000);
            System.out.println("Task 3");
            return 3;
        };

        List<Callable<Integer>> list = Arrays.asList(c1, c2, c3);

        ExecutorService executor = Executors.newFixedThreadPool(2);

        List<Future<Integer>> future = null; // it blocks all next statement to get execute until it gets executed entirely.
        try {
            future = executor.invokeAll(list, 1, TimeUnit.SECONDS);
        } catch (InterruptedException e) {

        }

        for (Future<Integer> f : future){
            try {
                System.out.println(f.get());
            } catch (InterruptedException | ExecutionException | CancellationException e){

            }
        }

//        try {
//            executor.invokeAny(list);
//        } catch (ExecutionException e) {
//            throw new RuntimeException(e);
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }

        System.out.println("hello");
        executor.shutdown();
    }
}
