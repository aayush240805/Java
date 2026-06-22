package _27ThreadMethods;

public class start extends Thread{
    @Override
    public void run(){
        System.out.println("Running.....");
    }

    public static void main(String[] args) {
        start t1 = new start();
        t1.start();
//        t1.run();
    }
}
