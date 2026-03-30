import java.util.concurrent.atomic.AtomicInteger;

//The **AtomicInteger** class in Java, found in the java.util.concurrent.atomic package,
// provides an integer value that can be read and written atomically. This ensures
// thread-safe operations in a multithreaded environment without needing explicit
// synchronized keywords or locks, making it ideal for concurrent counters and non-blocking algorithms.


class volatileCounter{
    private AtomicInteger counter = new AtomicInteger(0);

    public void increment(){
        counter.incrementAndGet();
    }

    public int getIncrement(){
        return counter.get();
    }
}

public class _37AtomicClasses {
    public static void main(String[] args) throws InterruptedException {
        volatileCounter vc = new volatileCounter();

        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 1000; i++){
                vc.increment();
            }
        });

        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 1000; i++){
                vc.increment();
            }
        });

        t1.start();
        t2.start();
        t1.join();
        t2.join();

        System.out.println(vc.getIncrement());
    }
}
