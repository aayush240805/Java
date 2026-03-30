package MultiThreadingApplications;

class FizzBuzz{
    private int counter = 1;
    private final int n;

    public FizzBuzz(int n){
        this.n = n;
    }

    public void fizz() throws InterruptedException {
        while(true) {
            synchronized (this){
                while (!(counter % 3 == 0 && counter % 5 != 0) && counter <= n){
                    wait();
                }
                if(counter > n) {
                    notifyAll();
                    break;
                }
                else {
                    System.out.println(counter + " : Fizz is printed by " + Thread.currentThread().getName());
                    counter++;
                    notifyAll();
                }
            }
        }
    }

    public void buzz() throws InterruptedException {
        while(true) {
            synchronized (this){
                while (!(counter % 3 != 0 && counter % 5 == 0) && counter <= n){
                    wait();
                }
                if(counter > n) {
                    notifyAll();
                    break;
                }
                else {
                    System.out.println(counter + " : Buzz is printed by " + Thread.currentThread().getName());
                    counter++;
                    notifyAll();
                }
            }
        }
    }

    public void fizzBuzz() throws InterruptedException {
        while(true) {
            synchronized (this){
                while (!(counter % 3 == 0 && counter % 5 == 0) && counter <= n){
                    wait();
                }
                if(counter > n) {
                    notifyAll();
                    break;
                }
                else {
                    System.out.println(counter + " : FizzBuzz is printed by " + Thread.currentThread().getName());
                    counter++;
                    notifyAll();
                }
            }
        }
    }

    public void number() throws InterruptedException {
        while(true) {
            synchronized (this){
                while(!(counter % 3 != 0 && counter % 5 != 0) && counter <= n){
                    wait();
                }
                if(counter > n) {
                    notifyAll();
                    break;
                }
                else {
                    System.out.println(counter + " : Number is printed by " + Thread.currentThread().getName());
                    counter++;
                    notifyAll();
                }
            }
        }
    }
}

public class fizzFuzz {
    public static void main(String[] args) {
        FizzBuzz FB = new FizzBuzz(20);

        Thread T1 = new Thread(() -> {
            try {
                FB.fizz();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }, "Thread 1");

        Thread T2 = new Thread(() -> {
            try {
                FB.buzz();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }, "Thread 2");

        Thread T3 = new Thread(() -> {
            try {
                FB.fizzBuzz();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }, "Thread 3");

        Thread T4 = new Thread(() -> {
            try {
                FB.number();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }, "Thread 4");

        T1.start();
        T2.start();
        T3.start();
        T4.start();
    }
}
