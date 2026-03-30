package _27ThreadMethods;

public class interrupt extends Thread{
    public void run(){
        try {
            Thread.sleep(1000); // <- get interrupted
            System.out.println("Thread is running...");
        } catch (InterruptedException e) {
            System.out.println("Thread Interrupted..." + e);
        }
    }

    public static void main(String[] args) {
        interrupt t1 = new interrupt();
        t1.start();
        t1.interrupt();
    }
}
