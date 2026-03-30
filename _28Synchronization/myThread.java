package _28Synchronization;

public class myThread extends Thread{
    private Counter counter;

    public myThread(Counter counter){
        this.counter = counter;
    }

    @Override
    public void run(){
        for (int i = 0; i < 1000; i++){
            counter.increment();
        }
    }
}
