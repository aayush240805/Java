package _27ThreadMethods;

import java.util.TreeMap;

public class sleep extends Thread {
    @Override
    public void run(){
        for (int i = 1; i <= 5; i++){
            try {
                Thread.sleep(1000);
            }
            catch (InterruptedException e){
                throw new RuntimeException(e);
            }
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        sleep t1 = new sleep();
        t1.start();
    }
}
