package _25Threads;

public class hello {
    public static void main(String[] args) {
        // -> by extending the Thread class
        world w = new world(); // <- NEW
        //w.start(); // <- RUNNABLE

        // -> by implementing the Runnable interface
        Thread t1 = new Thread(w);
        t1.start();

        for( ; ; ){
            System.out.println("hello");
        }
    }
}
