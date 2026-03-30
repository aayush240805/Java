package _28Synchronization;

public class Counter {
    private int counter = 0;

//// Synchronized Method
//    Without using synchronized keyword this block of code is called Race Condion.
//    This synchronized keyword is used to achieve mutual exclusion between execution of multiple thread.
//    public synchronized void increment(){ // <-- this is method is Shared Resource
//        counter++; // <-Critical Section
//    }

    public void increment(){
        //Asynchronized code
        synchronized (this) {
        //Synchronized Block
        counter++; // <-Critical Section
        }
    }

    public int getCounter(){
        return counter;
    }
}
