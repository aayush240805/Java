package _32ExecutorFramework;

public class manually {
    public static long factorial(int n) {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        int result = 1;
        for (int i = 1; i <= n; i++){
            result *= i;
        }
        return result;
    }

    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();  // 1 jan 1970

        //Manually...
        Thread[] thread = new Thread[9];
        for (int i = 1; i < 10; i++){
            int finalI = i; // <- variable (value changes)
            thread[i - 1] = new Thread(
                    ()-> System.out.println(factorial(finalI))
            );
            thread[i - 1].start();
        }
        for (Thread t : thread){
            try {
                t.join();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
        System.out.println("Total Time : " + (System.currentTimeMillis() - startTime));
    }
}
