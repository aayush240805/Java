public class _30ThreadCommunication {
    public static class sharedResources {
        private int data;
        private boolean hasData;

        public synchronized void producer(int value){
            while(hasData){
                try {
                    wait(); // <- get notification when Thread 2 notify on data unavailable(hasData = false)
                } catch (InterruptedException e){
                    Thread.currentThread().interrupt();
                }
            }
            data = value;
            hasData = true;
            System.out.println(" produced " + value);
            notify(); // notifying to Thread 2 that data available
        }

        public synchronized int consumer(int i){
            while (!hasData){
                try {
                    wait(); // <- get notification when Thread 1 notify on data available(hasData = true)
                }
                catch (InterruptedException e){
                    Thread.currentThread().interrupt();
                }
            }
            hasData = false;
            System.out.println(" consumed " + data);
            notify(); // notifying to Thread 1 that data is not available now
            return data;
        }
    }

    public static class Producer implements Runnable {
        private final sharedResources resource;

        Producer(sharedResources resource){
            this.resource = resource;
        }

        @Override
        public void run() {
            for (int i = 0; i < 10; i++){
                resource.producer(i);
            }
        }
    }

    public static class Consumer implements Runnable{
        private final sharedResources resource;

        Consumer(sharedResources resource){
            this.resource = resource;
        }

        @Override
        public void run() {
            for (int i = 0; i < 10; i++){
                resource.data = resource.consumer(i);
            }
        }
    }

    public static void main(String[] args) {
        sharedResources sr = new sharedResources();

        Thread t1 = new Thread(new Producer(sr));
        Thread t2 = new Thread(new Consumer(sr));

        t1.start();
        t2.start();
    }
}
