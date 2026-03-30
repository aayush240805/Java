
//It ensures that any thread reading a volatile variable always sees its most recent
// value written to main memory, rather than a potentially stale value from a CPU cache or register.

class sharedObj{
    //flag -> common shared object/resource
    //Due to volatile keyword : every thread fetch value of flag from RAM not from its local cache.
    private volatile boolean flag = false;

    public void setFlagTrue(){
        System.out.println("The writer thread has made the flag->true");
        flag = true;
    }

    //because every thread keeps a copy of every variable in its local cache.
    //in reader thread flag->false
    public void printIfFlagTrue(){
        while (!flag){
            //Do Nothing
        }
        System.out.println("Flag is true!");
    }
}

public class _36volatileKeyword {
    public static void main(String[] args) {
        sharedObj obj = new sharedObj();

        Thread writerThread = new Thread(()-> {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
            obj.setFlagTrue();
        });

        Thread readerThread = new Thread(()-> obj.printIfFlagTrue());

        writerThread.start();
        readerThread.start();
    }
}
