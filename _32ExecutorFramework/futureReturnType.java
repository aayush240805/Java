package _32ExecutorFramework;

import java.util.concurrent.*;

public class futureReturnType {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService executor = Executors.newSingleThreadExecutor();
        Future<?> f =  executor.submit(() -> {
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                System.out.println("Exception Occurred : " + e);
            }
            System.out.println("hello"); // printIfNotInterrupt
            return 42;
        });
        try {
            System.out.println(f.get(3, TimeUnit.SECONDS));
        } catch (ExecutionException | TimeoutException e) {
            System.out.println("Exception Occurred : " + e);
        }

        f.cancel(true);
        System.out.println(f.isCancelled());

        if(f.isDone()){
            System.out.println("Task is done...");
        }

        executor.shutdown();

        //isShutdown() & isTerminated()
        System.out.println(executor.isShutdown());
        Thread.sleep(1);
        System.out.println(executor.isTerminated());
    }
}
