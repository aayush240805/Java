import java.util.concurrent.*;

public class _35CompletableFuture {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        CompletableFuture<String> cf1 = CompletableFuture.supplyAsync(() -> {
            try {
                Thread.sleep(5000);
                System.out.println("Working...");
            } catch (Exception e) {

            }
            return "ok";
        }).thenApply(x -> x + x);

        CompletableFuture<String> cf2 = CompletableFuture.supplyAsync(() -> {
            try {
                Thread.sleep(5000);
                System.out.println("Sleeping...");
            } catch (Exception e) {

            }
            return "ok";
        }).orTimeout(1, TimeUnit.SECONDS).exceptionally(e -> "TimeOut Error Occurred"); // <- Functional Programming

        //To make the main thread waiting for Daemon Thread.
        System.out.println(cf1.getNow("No"));
        //cf.join();

        CompletableFuture<Void> f = CompletableFuture.allOf(cf1, cf2);
        f.join();

        System.out.println(cf1.get());
        System.out.println(cf2.get());

        System.out.println("Main..."); // Main Thread doesn't wait for daemon Thread (Async).
    }
}
