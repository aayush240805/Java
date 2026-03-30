package MultiThreadingApplications;

import java.util.concurrent.Semaphore;

public class pingPongUsingSemaphore {
    public static void main(String[] args) {
        Semaphore ping = new Semaphore(1);
        Semaphore pong = new Semaphore(0);

        Thread T1 = new Thread(() -> {
            for (int i = 0; i < 5; i++){
                try {
                    ping.acquire(); // it has 1 permit so it can acquire ping semaphore.
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println("ping acquired by Thread 1");
                pong.release(); // increasing the permits of pong by releasing.
            }
        });

        Thread T2 = new Thread(() -> {
            for (int i = 0; i < 5; i++){
                try {
                    pong.acquire(); // it has 0 permits so it is now in waiting/block state.
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println("pong acquired by Thread 2");
                ping.release(); // increasing the permits by releasing.
            }
        });

        T1.start();
        T2.start();
    }
}
