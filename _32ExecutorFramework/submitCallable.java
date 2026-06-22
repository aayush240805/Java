package _32ExecutorFramework;

import java.util.concurrent.*;

public class submitCallable implements Callable {
    public static void main(String[] args) throws ExecutionException, InterruptedException {



        ExecutorService executor = Executors.newSingleThreadExecutor();

        Callable<String> c = () -> "hello"; // <- have return type & can return

        Future<?> f = executor.submit(() -> "world");
        System.out.println(f.get());
        System.out.println(f.isDone());
        executor.shutdown();
    }

    @Override
    public Object call() throws Exception {
        return null;
    }
}
