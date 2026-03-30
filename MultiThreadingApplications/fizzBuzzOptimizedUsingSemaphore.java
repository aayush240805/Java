package MultiThreadingApplications;

import java.util.concurrent.Semaphore;

class optimized{
    private int counter = 1;
    private int n;

    public optimized(int n){
        this.n = n;
    }

    Semaphore Fizz = new Semaphore(0);
    Semaphore Buzz = new Semaphore(0);
    Semaphore FizzBuzz = new Semaphore(0);
    Semaphore Number = new Semaphore(1);

    public void fizz() throws InterruptedException {
        while (true) {
            Fizz.acquire();

            if(counter > n) {
                break;
            }
            else {
                System.out.println(counter + " : Fizz printed by " + Thread.currentThread().getName());
                counter++;
                Number.release();
            }
        }
    }public void buzz() throws InterruptedException {
        while (true) {
            Buzz.acquire();

            if(counter > n) {
                break;
            }
            else {
                System.out.println(counter + " : Buzz printed by " + Thread.currentThread().getName());
                counter++;
                Number.release();
            }
        }
    }public void fizzbuzz() throws InterruptedException {
        while (true) {
            FizzBuzz.acquire();

            if(counter > n) {
                break;
            }
            else {
                System.out.println(counter + " : FizzBuzz printed by " + Thread.currentThread().getName());
                counter++;
                Number.release();
            }
        }
    }public void number() throws InterruptedException {
        while (true) {
            Number.acquire();

            if(counter > n) {
                Fizz.release();
                Buzz.release();
                FizzBuzz.release();
                break;
            }

            if (counter % 3 == 0 && counter % 5 == 0){
                FizzBuzz.release();
            }
            else if (counter % 3 == 0){
                Fizz.release();
            }
            else if (counter % 5 == 0){
                Buzz.release();
            }
            else {
                System.out.println(counter + " : Number printed by " + Thread.currentThread().getName());
                counter++;
                Number.release();
            }
        }
    }
}

public class fizzBuzzOptimizedUsingSemaphore {
    public static void main(String[] args) {
        optimized opt = new optimized(20);

        Thread T1 = new Thread(() -> {
            try {
                opt.fizz();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }, "Thread 1");

        Thread T2 = new Thread(() -> {
            try {
                opt.buzz();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }, "Thread 2");

        Thread T3 = new Thread(() -> {
            try {
                opt.fizzbuzz();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }, "Thread 3");

        Thread T4 = new Thread(() -> {
            try {
                opt.number();
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
