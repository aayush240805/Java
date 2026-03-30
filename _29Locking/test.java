package _29Locking;

public class test {
    public static void main(String[] args) {
        bankAccount RBI = new bankAccount();
        //Runnable is an interface.
        //Anonymous Class
        Runnable r = new Runnable() {
            @Override
            public void run() {
                RBI.withdraw(400);
            }
        };

        Thread t1 = new Thread(r, "Thread 1");
        Thread t2 = new Thread(r, "Thread 2");

        t1.start();
        t2.start();
    }
}
