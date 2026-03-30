package MultiThreadingApplications;

import java.util.concurrent.Semaphore;

public class semaphore {
    public static void main(String[] args) throws InterruptedException {
        Semaphore washroomPermits = new Semaphore(3);
        washroomPermits.acquire();
        System.out.println("washroom permit acquire for the 1st time.");
        washroomPermits.acquire();
        System.out.println("washroom permit acquire for the 2st time.");
        washroomPermits.acquire();
        System.out.println("washroom permit acquire for the 3st time.");

        washroomPermits.release();
        washroomPermits.acquire();
        System.out.println("washroom permit acquire for the 4st time.");



        Semaphore book = new Semaphore(0);
        book.release(2);

        book.acquire();
        System.out.println("Book is acquired by 1st student.");
        book.acquire();
        System.out.println("Book is acquired by 2st student.");

        book.release(2);
        book.acquire(2);
        System.out.println("Two book are acquired by 3st student.");
    }
}
