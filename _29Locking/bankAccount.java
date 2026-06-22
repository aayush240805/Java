package _29Locking;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class bankAccount {
    private int balance = 1000;

    private final Lock L = new ReentrantLock();

    public void withdraw(int amount) {
        System.out.println(Thread.currentThread().getName() + " attempting to withdraw " + amount);
        try {
            // L.lock() <-- we will not use this because it works as synchronous lock(wait for long time until previous get executed and release the lock.
            if(L.tryLock(1000, TimeUnit.MILLISECONDS)){
                if(amount < balance){
                    System.out.println(Thread.currentThread().getName() + " proceeding the withdrawal.");
                    try {
                        Thread.sleep(3000);
                    } catch (InterruptedException e) { // <-must be handled
                        Thread.currentThread().interrupt();
                    } finally {
                        L.unlock();
                    }
                    balance -= amount;
                    System.out.println(Thread.currentThread().getName() + " completed withdrawal. " + " remaining balance : " + balance);
                }
                else {
                    System.out.println(Thread.currentThread().getName() + " insufficient balance.");
                }
            }
            else {
                System.out.println(Thread.currentThread().getName() + "couldn't acquire the lock, will try again.");
            }
        } catch (Exception e) { // <-must be handled
            Thread.currentThread().interrupt(); // <- To restore the state of thread
        }
        //Purpose to interrupt the thread : for maintainance or cleanUp code.
        if(Thread.currentThread().isInterrupted()){
            System.out.println(" ");
        }
    }

////ISSUE TO USE SYNCHRONIZED : If 1st thread going to sleep for long time, then 2nd thread will wait until previous thread execute the entire task(Critical Section).
//    public synchronized void withdraw(int amount){
//        System.out.println(Thread.currentThread().getName() + " attempting to withdraw " + amount);
//        if(amount < balance){
//            System.out.println(Thread.currentThread().getName() + " proceeding the withdrawal.");
//            try {
//                Thread.sleep(3000);
//            } catch (InterruptedException e) {
//
//            }
//            balance -= amount;
//            System.out.println(Thread.currentThread().getName() + " completed withdrawal. " + " remaining balance : " + balance);
//        }
//        else {
//            System.out.println(Thread.currentThread().getName() + " insufficient balance.");
//        }
//    }
}
