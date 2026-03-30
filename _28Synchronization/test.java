package _28Synchronization;

public class test {
    public static void main(String[] args) {
        Counter cnt = new Counter();
        myThread t1 = new myThread(cnt);
        myThread t2 = new myThread(cnt);

        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println(cnt.getCounter());
    }
}
