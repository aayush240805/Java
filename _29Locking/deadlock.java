package _29Locking;

//Identifying the Problem: The original deadlock occurred because Task 1 would acquire the Pen lock
// and then try to acquire the Paper lock, while Task 2 would acquire the Paper lock and then try
// to acquire the Pen lock. This circular dependency caused them to wait for each other indefinitely.

public class deadlock {
    public static class Pen {
        public synchronized void writeWithPenAndPaper(Paper paper){
            System.out.println(Thread.currentThread().getName() + " is using pen" + this + " and trying to use paper " + this);
            paper.finishWriting();
        }

        public synchronized void finishWriting(){
            System.out.println(Thread.currentThread().getName() + " finished using pen " + this);
        }
    }

    public static class Paper {
        public synchronized void writeWithPaperAndPen(Pen pen){
            System.out.println(Thread.currentThread().getName() + " is using paper" + this + " and trying to use pen " + this);
            pen.finishWriting();
        }

        public synchronized void finishWriting(){
            System.out.println(Thread.currentThread().getName() + " finished using paper " + this);
        }
    }

    public static class task1 implements Runnable {
        private final Pen pen;
        private final Paper paper;

        public task1(Pen pen, Paper paper){
            this.pen = pen;
            this.paper = paper;
        }

        @Override
        public void run(){
            pen.writeWithPenAndPaper(paper); // Thread 1 first acquire lock on pen, then tries to acquire lock on paper
        }
    }

    public static class task2 implements Runnable {
        private final Pen pen;
        private final Paper paper;

        public task2(Pen pen, Paper paper){
            this.pen = pen;
            this.paper = paper;
        }

        @Override
        public void run(){
            // To handle the deadlock
            synchronized (pen) { // Thread 2 must acquire lock on pen first, then it can acquire the lock on paper
                paper.writeWithPaperAndPen(pen); // Thread 2 first acquires lock on paper, then tries to acquire lock on pen
            }
            //Now both Thread 1 & Thread 2 acquire lock on pen first, then on paper. It means deadlock will get resolved and both thread will run sequentially.
        }
    }

    public static void main(String[] args) {
        Pen pen = new Pen();
        Paper paper = new Paper();

        Thread t1 = new Thread(new task1(pen, paper), "Thread 1");
        Thread t2 = new Thread(new task2(pen, paper), "Thread 2");

        t1.start();
        t2.start();
    }
}
