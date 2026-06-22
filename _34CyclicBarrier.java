import java.util.concurrent.*;

class dependentServices implements Callable<String> {
    private final CyclicBarrier barrier;

    public dependentServices(CyclicBarrier barrier){
        this.barrier = barrier;
    }

    @Override
    public String call() throws InterruptedException, BrokenBarrierException {
        System.out.println(Thread.currentThread().getName() + " service starting.");
        Thread.sleep(1000);
        System.out.println(Thread.currentThread().getName() + " is waiting at the barrier.");
        barrier.await(); // <- Barrier Point :  It waits until all Thread comes
        return "ok";
    }
}
public class _34CyclicBarrier {
    public static void main(String[] args) {

//        A CyclicBarrier in Java is a synchronization aid that allows a set of threads to all
//        wait for each other to reach a common execution point, known as a barrier point,
//        before any of them can continue. It is particularly useful in multi-stage computations
//        or scenarios where the output of several sub-tasks needs to be combined.

//        It is reusable.

//        Unlike a CountDownLatch, a CyclicBarrier resets automatically after the threads are released

//        Threads wait at the barrier by calling await().

//        Use Cases: 1. Matrix Multiplication
//                   2. When a system needs to load or fetch services or data from mutiple separate independent threads,
//                      wait for all to become ready and trigger a final aggregation step.
//                   3. Multi-Player Game Lobbies: Waiting for a fixed number of players to connect

        int numberOfServices = 3;
        ExecutorService executor = Executors.newFixedThreadPool(numberOfServices);
        CyclicBarrier barrier = new CyclicBarrier(numberOfServices);
        executor.submit(new dependentServices(barrier));
        executor.submit(new dependentServices(barrier));
        executor.submit(new dependentServices(barrier));

        System.out.println("Main..."); // <-- It doesn't block the main thread. So, it prints at the first.

        barrier.reset();
        System.out.println(barrier.getNumberWaiting());
        System.out.println(barrier.getParties());
        executor.shutdown();
    }
}
