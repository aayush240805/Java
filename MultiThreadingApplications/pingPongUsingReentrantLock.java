package MultiThreadingApplications;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

class pingPong{
    private final ReentrantLock L = new ReentrantLock(); // entry queue
    private final Condition pingTurn = L.newCondition(); // ping condition queue
    private final Condition pongTurn = L.newCondition(); // pong condition queue
    private boolean isPingTurn = true;

    //NOTE : Only one of the thread can acquire the lock at a time.

    public void ping() throws InterruptedException {
        for (int i = 0; i < 5; i++){
            L.lock(); // here thread T1 is trying to acquire the lock.
            while(!isPingTurn){
                pingTurn.await(); // Thread T1 will go inside the ping condition queue and waits and also releases the lock, so thread T2 can acquire the lock.
            }
            System.out.println("Ping");
            isPingTurn = false;
            pongTurn.signal(); // gives the signal to thread T2 to awake
            L.unlock();
        }
    }

    public void pong() throws InterruptedException {
        for (int i = 0; i < 5; i++){
            L.lock(); // here thread T2 is trying to acquire the lock.
            while(isPingTurn){
                pongTurn.await(); // Thread T2 will go inside the pong condition queue and waits and also releases the lock, so thread T2 can acquire the lock.
            }
            System.out.println("Pong");
            isPingTurn = true;
            pingTurn.signal(); // gives the signal to thread T1 to awake
            L.unlock();
        }
    }
}

public class pingPongUsingReentrantLock {
    public static void main(String[] args) {
        pingPong pp = new pingPong();

        Thread T1 = new Thread(() -> {
            try {
                pp.ping();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });
        Thread T2 = new Thread(() -> {
            try {
                pp.pong();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });

        T1.start();
        T2.start();
    }
}
