public class _26ThreadLifeCycle extends Thread {
    @Override
    public  void run() {
        System.out.println("RUNNING");
        // This is another Thread (t1) and it also going to sleep now for 2 seconds.
        try {
            Thread.sleep(2000); // <- TIMED_WAITING
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) throws InterruptedException {
        _26ThreadLifeCycle t1 = new _26ThreadLifeCycle(); // <- NEW
        System.out.println(t1.getState());
        t1.start(); // <- RUNNABLE
        System.out.println(t1.getState());
//        System.out.println(Thread.currentThread().getState());

        // To make main method going to sleep for 100 milliseconds.(pause)
        Thread.sleep(100);

        System.out.println(t1.getState());

        // Waits for thread t1 to get finished
        t1.join(); // <- TEMINATED
        System.out.println(t1.getState());

    }
}
