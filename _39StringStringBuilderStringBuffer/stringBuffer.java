package _39StringStringBuilderStringBuffer;

// It overcomes the limitations of thread safe in StringBuilder

// Key Features:
//              1. Thread Safe
//              2. Mutable
//              3. Chaining Methods
//              4. Slow Performance(due to synchronization overhead)

public class stringBuffer {

     static class performTask extends Thread {
        private StringBuffer s;

        public performTask(StringBuffer s) {
            this.s = s;
        }

        @Override
        public void run() {
            for (int i = 0; i < 1000; i++) {
                s.append("a");
            }
        }
    }

    public static void main(String[] args) throws InterruptedException {
        StringBuffer sb = new StringBuffer();

        performTask performTask = new performTask(sb);

//        performTask t1 = new performTask(sb);
//        performTask t2 = new performTask(sb);

        Thread t1 = new Thread(new performTask(sb));  // wrapping the task into thread objects;
        Thread t2 = new Thread(new performTask(sb));

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println("String Length: " + sb.length());

    }
}
