package _27ThreadMethods;

public class run extends Thread{
    @Override
    public void run(){
        System.out.println("Running.....");
    }

    public static void main(String[] args) {
        run t1 = new run();
        t1.start();
//        t1.run();
    }
}
