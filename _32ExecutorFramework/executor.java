package _32ExecutorFramework;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class executor {
    public static long factorial(int n) {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        int result = 1;
        for (int i = 1; i <= n; i++){
            result *= i;
        }
        return result;
    }

    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();  // 1 jan 1970

        //Using Executor Framework...
        //ExecutorService class extending the Executor class and provide more features.
        ExecutorService executor = Executors.newFixedThreadPool(3);
        for (int i = 1; i <= 10; i++){
            int finalI = i;
            executor.submit(
                    () -> System.out.println(factorial(finalI))
            );
        }
        executor.shutdown(); // To Stop! and we can't submit any task to it further.
//        executor.shutdownNow();

        try {
            executor.awaitTermination(10, TimeUnit.SECONDS);

            //for infinite waiting
//            while (!executor.awaitTermination(1, TimeUnit.SECONDS)){
//                System.out.println("Waiting...");
//            }
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Total Time : " + (System.currentTimeMillis() - startTime));
    }
}
