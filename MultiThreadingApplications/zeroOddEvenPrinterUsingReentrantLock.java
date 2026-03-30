package MultiThreadingApplications;

import javax.swing.*;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

class zeroOddEven {
    private final int limit;

    public zeroOddEven(int limit){
        this.limit = limit;
    }

    ReentrantLock L = new ReentrantLock();
    Condition zeroTurn = L.newCondition();
    Condition oddTurn = L.newCondition();
    Condition evenTurn = L.newCondition();
    public int state = 0;

    public void zero() throws InterruptedException {
        for (int i = 1; i <= limit; i++){
            L.lock();
            while (state != 0) {
                zeroTurn.await();
            }
            System.out.println("0 printed by " + Thread.currentThread().getName());

            if (i % 2 != 0) {
                state = 1;
                oddTurn.signal();
            }
            else {
                state = 2;
                evenTurn.signal();
            }
            L.unlock();
        }
    }

    public void odd() throws InterruptedException {
        for (int i = 1; i <= limit; i += 2){
            L.lock();
            while (state != 1) {
                oddTurn.await();
            }
            System.out.println(i + " printed by " + Thread.currentThread().getName());
            state = 0;
            zeroTurn.signal();

            L.unlock();
        }
    }

    public void even() throws InterruptedException {
        for (int i = 2; i <= limit; i += 2){
            L.lock();
            while (state != 2) {
                evenTurn.await();
            }
            System.out.println(i + " printed by " + Thread.currentThread().getName());
            state = 0;
            zeroTurn.signal();

            L.unlock();
        }
    }
}

public class zeroOddEvenPrinterUsingReentrantLock {
    public static void main(String[] args) {
        zeroOddEven p = new zeroOddEven(5);

        Thread T1 = new Thread(() -> {
            try {
                p.zero();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }, "Thread 1");

        Thread T2 = new Thread(() -> {
            try {
                p.odd();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }, "Thread 2");

        Thread T3 = new Thread(() -> {
            try {
                p.even();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }, "Thread 3");

        T1.start();
        T2.start();
        T3.start();
    }
}
