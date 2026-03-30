package MultiThreadingApplications;

class sharedResources {
    private int counter = 1;
    private int limit;

    public sharedResources(int limit){
        this.limit = limit;
    }

    public void printCounter(){
        System.out.printf("%d is printed by %s \n", counter, Thread.currentThread().getName());
        counter++;
    }

    public int getCounter(){
        return counter;
    }

    public int getLimit(){
        return limit;
    }
}

class oddPrinter extends Thread {
    private final sharedResources resources;

    public oddPrinter(sharedResources resources){
        this.resources = resources;
    }

    @Override
    public void run(){
        while(true){
            synchronized (resources){
                if(resources.getCounter() % 2 == 0 && resources.getCounter() <= resources.getLimit()){
                    try {
                        resources.wait();
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
                else if(resources.getCounter() > resources.getLimit()){
                    resources.notify();
                    break;
                }
                else {
                    resources.printCounter();
                    resources.notify();
                }
            }
        }
    }
}

class evenPrinter extends Thread {
    private final sharedResources resources;

    public evenPrinter(sharedResources resources){
        this.resources = resources;
    }

    @Override
    public void run(){
        while(true){
            synchronized (resources){
                if(resources.getCounter() % 2 != 0 && resources.getCounter() <= resources.getLimit()){
                    try {
                        resources.wait();
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
                else if(resources.getCounter() > resources.getLimit()){
                    resources.notify();
                    break;
                }
                else{
                    resources.printCounter();
                    resources.notify();
                }
            }
        }
    }
}

public class OddEvenPrinter {
    public static void main(String[] args) {
        sharedResources resources = new sharedResources(10);
        Thread t1 = new Thread(new oddPrinter(resources), "oddPrinter");
        Thread t2 = new Thread(new evenPrinter(resources), "evenPrinter");

        t1.start();
        t2.start();
    }
}
