package MultiThreadingApplications;

import java.util.concurrent.Semaphore;

public class abc_N_Times {
    public static void main(String[] args) {
        Semaphore A = new Semaphore(1);
        Semaphore B = new Semaphore(0);
        Semaphore C = new Semaphore(0);

        int n = 3;

        Thread T1 = new Thread(() -> {
            for (int i = 0; i < n; i++){
                try {
                    A.acquire();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println("A printed using Thread 1");
                B.release();
            }
        });

        Thread T2 = new Thread(() -> {
            for (int i = 0; i < n; i++){
                try {
                    B.acquire();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println("B printed using Thread 2");
                C.release();
            }
        });

        Thread T3 = new Thread(() -> {
            for (int i = 0; i < n; i++){
                try {
                    C.acquire();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println("C printed using Thread 3");
                A.release();
            }
        });

        T1.start();
        T2.start();
        T3.start();
    }
}
