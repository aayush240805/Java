package _27ThreadMethods;

// >> INFORMATION
// In java, it is a way to politely ask a thread to stop. Not to kill it forcefully.
//

class myThread extends Thread {
    public void run(){
        while(true){
            try {
                System.out.println("Running...");

                //-> always be true : here it reflects its politeness of interrupting a thread.
                System.out.println("before catch : " + Thread.currentThread().isInterrupted());

                Thread.sleep(5);
                if(Thread.currentThread().isInterrupted()){
                    // perform cleanUp or maintenance code
                    break;
                }
            } catch (Exception e) {
                System.out.println("before catch : " + Thread.currentThread().isInterrupted());
                // after throwing an interruptedException JVM internally resets interrupted flag to true
                System.out.println("Interrupted");
                break;
            }
        }
    }
}

public class interruptByBitsOfCode {
    public static void main(String[] args) {
        myThread mt = new myThread();
        mt.start();
        mt.interrupt(); // an interrupt() method only interrupt the thread(throws exception) which is either waiting on sleep, wait, join, or BlockingQueue.take
    }
}
