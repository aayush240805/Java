package _32ExecutorFramework;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class scheduleExecutor {
    public static void main(String[] args) {
        ScheduledExecutorService executor = Executors.newScheduledThreadPool(1);

//        executor.schedule(() -> System.out.println("Task executed after 5-second delay!"),
//                5,
//                TimeUnit.SECONDS);

        //It tells how many times to execute the given task.
//        executor.scheduleAtFixedRate(() -> System.out.println("Task executed after every 5-second delay!"),
//                5,
//                5,
//                TimeUnit.SECONDS);

        //It tells after how much delay to execute the given task until shutdown.
        executor.scheduleWithFixedDelay(() -> System.out.println("Task executed after every 5-second delay!"),
                5,
                5,
                TimeUnit.SECONDS);

        executor.schedule(() -> {
            System.out.println("Initiating Shutdown...");
            executor.shutdown();},
                20,
                TimeUnit.SECONDS
        );
    }
}
