package _27ThreadMethods;

public class getDaemon extends Thread {
    @Override
    public void run(){
        while (true){
            System.out.println("Hello World");
        }
    }

    public static void main(String[] args) {
        getDaemon t1 = new getDaemon(); // <-User's Thread, JVM wait for it to get finish.
        t1.setDaemon(true); // no use, it exits automatically.
        t1.start();
        System.out.println("Main done...");

        //DAEMON THREADS -> run in background, JVM doesn't wait for them
    }
}
