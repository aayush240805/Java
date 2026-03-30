package _29Locking;

import java.util.Locale;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;



//The ReentrantReadWriteLock in Java is an implementation of the ReadWriteLock interface
// that allows multiple threads to read concurrently but requires exclusive access for writing.
// It is "reentrant" because a thread that already holds a lock (read or write) can acquire
// it again without deadlocking itself.

public class readWriteLock {
    public static class readWriteExample{
        private int count = 0;

        private final ReadWriteLock RWL = new ReentrantReadWriteLock();
        private final Lock RL = RWL.readLock();
        private final Lock WL = RWL.writeLock();

        //Writing...
        // This lock is acquired by a thread only if another thread is not acquiring any lock.
        public void increment(){
            WL.lock();
            try {
                count++;
                Thread.sleep(1);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            } finally {
                WL.unlock();
            }
        }

        //Reading...
        public int getCount(){
            RL.lock(); // -> This read lock can be acquired by multiple threads concurrently only if write lock is not acquired by another thread.
            try {
                return count;
            } finally {
                RL.unlock();
            }
        }
    }

    public static void main(String[] args) throws InterruptedException {
        readWriteExample rw = new readWriteExample();

        Runnable readTask = new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10; i++){
                    System.out.println(Thread.currentThread().getName() + " read " + rw.count);
                }
            }
        };

        Runnable writeTask = new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10; i++){
                    rw.increment();
                    System.out.println(Thread.currentThread().getName() + " incremented");
                }
            }
        };

        Thread writerThread = new Thread(writeTask, "Write Thread 0");
        Thread readerThread1 = new Thread(readTask, "Read Thread 1");
        Thread readerThread2 = new Thread(readTask, "Read Thread 2");

        writerThread.start();
        readerThread1.start();
        readerThread2.start();

        writerThread.join();
        readerThread1.join();
        readerThread2.join();

        System.out.println("Final Count : " + rw.getCount());
    }
}
