package MultiThreadingApplications;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class sharedObj{
    private int counter = 1;
    private int limit;

    public sharedObj(int limit){
        this.limit = limit;
    }

    public void printCounter(){
        System.out.printf("%d is printed by %s \n", counter, Thread.currentThread().getName());
        counter++;
    }

    public int getCounter(){
        return counter;
    }

    public int getLimit(){
        return limit;
    }
}

class printer implements Runnable {
    private final sharedObj obj;
    private final int threadId;

    public printer (sharedObj obj, int threadId){
        this.obj = obj;
        this.threadId = threadId;
    }

    @Override
    public void run(){
        while(true){
            synchronized (obj){
                if((obj.getCounter() - 1) % 2 != threadId && obj.getCounter() <= obj.getLimit()){
                    try {
                        obj.wait();
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
                else if(obj.getCounter() > obj.getLimit()) {
                    obj.notify();
                    break;
                }
                else {
                    obj.printCounter();
                    obj.notify();
                }
            }
        }
    }
}

public class optimizedPrinter {
    public static void main(String[] args) {
        sharedObj obj = new sharedObj(10);
        Thread t1 = new Thread(new printer(obj, 0), "oddPrinter");
        Thread t2 = new Thread(new printer(obj, 1), "evenPrinter");

        t1.start();
        t2.start();
    }
}
