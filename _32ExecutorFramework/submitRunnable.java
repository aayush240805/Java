package _32ExecutorFramework;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class submitRunnable implements Runnable {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService executor = Executors.newSingleThreadExecutor();

        Runnable r = () -> System.out.println("hello"); // <- can't return

        Future<?> f = executor.submit(() -> System.out.println("world"));
        Future<?> future = executor.submit(() -> System.out.println("emoji..."), 4);

        System.out.println(f.get()); // <-null
        System.out.println(future.get()); // <- 4
        System.out.println(f.isDone());
        executor.shutdown();
    }

    @Override
    public void run() {

    }
}
