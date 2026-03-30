import java.util.concurrent.*;

class DependentService implements Callable<String> {

    private final CountDownLatch latch;

    public DependentService(CountDownLatch latch){
        this.latch = latch;
    }

    @Override
    public String call() throws InterruptedException {
        try {
            System.out.println(Thread.currentThread().getName() + " Service started.");
            Thread.sleep(2000);
        } finally {
            latch.countDown();
        }
        return "ok";
    }
}

public class _33CountDownLatch {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
//        ExecutorService executor = Executors.newFixedThreadPool(3);
//        Future<String> future1 = executor.submit(new DependentService());
//        Future<String> future2 = executor.submit(new DependentService());
//        Future<String> future3 = executor.submit(new DependentService());
//
//        //For : waiting for future1, future2 and future3 to get finished.
//        //There is a problem of writing .get() multiple times
//        future1.get();
//        future2.get();
//        future3.get();
//
//        System.out.println("All dependent services finished. Now starting main service...");
//        executor.shutdown();



        //USING COUNT DOWN LATCH : A CountDownLatch in Java is a synchronization aid used
        // to make one or more threads wait until a set of operations being performed in
        // other threads completes.

//     -->>   It is not reusable. Once count down reaches zero, it can't be reset.


        int numberOfServices = 3;
        ExecutorService executor = Executors.newFixedThreadPool(numberOfServices);

        CountDownLatch latch = new CountDownLatch(numberOfServices);
        executor.submit(new DependentService(latch)); // 2
        executor.submit(new DependentService(latch)); // 1
        executor.submit(new DependentService(latch)); // 0

        latch.await(); // <-- Latch Unlock here when count down becomes 0
        System.out.println("Main..."); // <-- It blocks the main thread. So, it prints at the last.
        executor.shutdown();
    }
}
