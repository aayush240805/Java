class _0Try{

    public static class sharedResources {

        private int data;

        private boolean hasData;

        public synchronized void producer(int value) throws InterruptedException {
            while (hasData) {
                wait();
            }
            data = value;
            hasData = true;
            System.out.println(data + "produced");
            notify();
        }

        public synchronized int consumer(int value) throws InterruptedException {
            while (!hasData) {
                wait();
            }
            hasData = false;
            System.out.println(data + "consumed");
            notify();
            return data;
        }

    }

    public static class producer extends Thread {

        private final sharedResources resources;

        public producer(sharedResources resources) {
            this.resources = resources;
        }

        @Override
        public void run() {
            for (int i = 0; i < 10; i++) {
                try {
                    resources.producer(i);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }

    public static class consumer extends Thread {

        private final sharedResources resources;

        public consumer(sharedResources resources) {
            this.resources = resources;
        }

        @Override
        public void run() {
            for (int i = 0; i < 10; i++) {
                try {
                    resources.data = resources.consumer(i);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }

    public static void main(String[] args) {
        sharedResources sr = new sharedResources();

        Thread T1 = new Thread(new producer(sr));
        Thread T2 = new Thread(new consumer(sr));

        T1.start();
        T2.start();
    }

}