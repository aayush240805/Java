package _25Threads;

// -> by extending the Thread class
/*public class world extends Thread{
    @Override
    public void run(){
        for( ; ; ){
//            System.out.println("world");
            System.out.println(Thread.currentThread().getName());
        }
    }
}*/

// -> by implementing the Runnable interface
public class world implements Runnable{
    @Override
    public void run(){
        for( ; ; ){
//            System.out.println("world");
            System.out.println(Thread.currentThread().getName());
        }
    }
}
