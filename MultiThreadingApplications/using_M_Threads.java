package MultiThreadingApplications;

class sharedObject{
    private int counter = 1;
    private int limit;

    public sharedObject(int limit){
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

class Printer implements Runnable {
    private final sharedObject obj;
    private final int threadId;
    private final int m;

    public Printer (sharedObject obj, int threadId, int m){
        this.obj = obj;
        this.threadId = threadId;
        this.m = m;
    }

    @Override
    public void run(){
        while(true){
            synchronized (obj){
                // if should not use here. If we use it then it will resume the other 2 threads to run from next loop. anyone of both of them can print the next counter.
                //And solution is while which makes the thread to check the condition of the while loop until it getting false.
                while((obj.getCounter() - 1) % m != threadId && obj.getCounter() <= obj.getLimit()){
                    try {
                        obj.wait();
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
                if(obj.getCounter() > obj.getLimit()) {
                    obj.notifyAll();
                    break;
                }
                obj.printCounter();
                obj.notifyAll();
            }
        }
    }
}

public class using_M_Threads {
    public static void main(String[] args) {
        int m = 3;
        sharedObject obj = new sharedObject(10);
        for (int i = 0; i < m; i++) {
            Thread t = new Thread(new Printer(obj, i, m), "Thread" + i);
            t.start();
        }
    }
}
