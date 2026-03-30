package _27ThreadMethods;

public class _join extends Thread {
    @Override
    public void run(){
        try {
            Thread.sleep(3000);
        }
        catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) throws InterruptedException {
        _join t1 = new _join();
        t1.start();
        t1.join();
        System.out.println("done...");
    }
}

