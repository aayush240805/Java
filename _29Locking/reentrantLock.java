package _29Locking;

/*A ReentrantLock in Java is a mutual exclusion lock that allows
the same thread to acquire the lock multiple times without causing a deadlock.
It provides more flexible and extensive locking operations than the
traditional synchronized keyword, and is part of the java.util.concurrent.locks package.
It is one-monitor object : only one thread can acquire the lock.*/


import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class reentrantLock {
    public static class example {
        private final Lock L = new ReentrantLock();

        public void outerMethod() {
            L.lock();
            try {
                System.out.println("OUTER METHOD...");
                innerMethod();
            } finally {
                L.unlock();
            }
        }

        public void innerMethod() {
            L.lock();
            try {
                System.out.println("INNER METHOD...");
            } finally {
                L.unlock();
            }
        }
    }
    public static void main(String[] args) {
        example r = new example();
        r.outerMethod();
    }
}
