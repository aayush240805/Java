package MultiThreadingApplications;

import java.util.WeakHashMap;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

enum direction{
    North, East, South, West
}

class trafficLight {
    ReentrantLock L = new ReentrantLock();
    Condition northTurn = L.newCondition();
    Condition eastTurn = L.newCondition();
    Condition southTurn = L.newCondition();
    Condition westTurn = L.newCondition();

    direction greenTurn = direction.North;

    public void north() throws InterruptedException {
        for (int i = 0; i < 3; i++){
            L.lock();
            while(greenTurn != direction.North){
                northTurn.await();
            }
            System.out.println("North is green, all other are red. <- " + Thread.currentThread().getName());
            greenTurn = direction.East;
            eastTurn.signal();

            L.unlock();
        }
    }

    public void east() throws InterruptedException {
        for (int i = 0; i < 3; i++){
            L.lock();
            while(greenTurn != direction.East){
                eastTurn.await();
            }
            System.out.println("East is green, all other are red. <- " + Thread.currentThread().getName());
            greenTurn = direction.South;
            southTurn.signal();

            L.unlock();
        }
    }

    public void south() throws InterruptedException {
        for (int i = 0; i < 3; i++){
            L.lock();
            while(greenTurn != direction.South){
                southTurn.await();
            }
            System.out.println("South is green, all other are red. <- " + Thread.currentThread().getName());
            greenTurn = direction.West;
            westTurn.signal();

            L.unlock();
        }
    }

    public void west() throws InterruptedException {
        for (int i = 0; i < 3; i++){
            L.lock();
            while(greenTurn != direction.West){
                westTurn.await();
            }
            System.out.println("West is green, all other are red. <- " + Thread.currentThread().getName());
            greenTurn = direction.North;
            northTurn.signal();

            L.unlock();
        }
    }
}

public class TrafficSignalUsingReentrantLock {
    public static void main(String[] args) {
        trafficLight t = new trafficLight();

        Thread T1 = new Thread(() -> {
            try {
                t.north();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }, "Thread 1");

        Thread T2 = new Thread(() -> {
            try {
                t.east();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }, "Thread 2");

        Thread T3 = new Thread(() -> {
            try {
                t.south();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }, "Thread 3");

        Thread T4 = new Thread(() -> {
            try {
                t.west();
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
