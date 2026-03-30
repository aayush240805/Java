package MultiThreadingApplications;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

enum d{
    North, East, South, West
}

class TL {
    ReentrantLock L = new ReentrantLock();
    Condition northTurn = L.newCondition();
    Condition eastTurn = L.newCondition();
    Condition southTurn = L.newCondition();
    Condition westTurn = L.newCondition();

    d currentGreen = d.North;

    public void signal(d direction) throws InterruptedException {
        for (int i = 0; i < 3; i++){
            L.lock();
            while(direction != currentGreen){
                getCurrentDirection(direction).await();
            }
            System.out.println(direction + " is green <- " + Thread.currentThread().getName());
            currentGreen = getNextDirection(direction);
            getCurrentDirection(currentGreen).signal();

            L.unlock();
        }
    }

    public Condition getCurrentDirection(d dir){
        switch (dir){
            case North -> {
                return northTurn;
            }
            case East -> {
                return eastTurn;
            }
            case South -> {
                return southTurn;
            }
            case West -> {
                return westTurn;
            }
        }
        return null;
    }

    public d getNextDirection(d dir){
        switch (dir){
            case North -> {
                return d.East;
            }
            case East -> {
                return d.South;
            }
            case South -> {
                return d.West;
            }
            case West -> {
                return d.North;
            }
        }
        return null;
    }
}


public class TrafficLightSimplifiedCode {
    public static void main(String[] args) {
        TL t = new TL();

        Thread T1 = new Thread(() -> {
            try {
                t.signal(d.North);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }, "Thread 1");

        Thread T2 = new Thread(() -> {
            try {
                t.signal(d.East);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }, "Thread 2");

        Thread T3 = new Thread(() -> {
            try {
                t.signal(d.South);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }, "Thread 3");

        Thread T4 = new Thread(() -> {
            try {
                t.signal(d.West);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }, "Thread 4");

        T1.start();
        T2.start();
        T3.start();
        T4.start();
    }
}
