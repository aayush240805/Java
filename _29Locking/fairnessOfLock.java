package _29Locking;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class fairnessOfLock {
    public static class fairnessExample{
        // To give chance to run every thread.
        private final Lock L = new ReentrantLock(true);

        public void accessResource() {
            L.lock();
            try {
                System.out.println(Thread.currentThread().getName() + " acquired the lock.");
                Thread.sleep(1000);
            } catch (InterruptedException e){
                Thread.currentThread().interrupt(); // <- to restore the state of thread
            } finally {
                System.out.println(Thread.currentThread().getName() + " released the lock.");
                L.unlock();
            }
        }
    }

    public static void main(String[] args) {
        fairnessExample f = new fairnessExample();

        Runnable r = new Runnable() {
            @Override
            public void run() {
                f.accessResource();
            }
        };

        Thread t1 = new Thread(r, "Thread 1");
        Thread t2 = new Thread(r, "Thread 2");
        Thread t3 = new Thread(r, "Thread 3");

        t1.start();
//        Thread.sleep(100);
        t2.start();
//        Thread.sleep(100);
        t3.start();
    }
}
