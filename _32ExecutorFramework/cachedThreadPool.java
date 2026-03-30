package _32ExecutorFramework;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class cachedThreadPool {
    public static void main(String[] args) {
        ExecutorService executor = Executors.newCachedThreadPool();

        //Cached Thread Pool
        //It creats a Thread pool where it creates new Threads as per the requirement.
        //And it terminates/kills them (if not required more) within 60 seconds inactivity.
        //It adjusts or maintains the size of the pool dynamically.
        //Here we can create any no. of threads and pool's can be increase dynamically.
        //It is used where we need variable no. of thread.
    }
}
