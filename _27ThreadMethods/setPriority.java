package _27ThreadMethods;

public class setPriority extends Thread{
    setPriority(String name){
        super(name); // <- To calling the constructor of Thread class by passing name of thread.
    }

    @Override
    public void run(){
        for (int i = 0; i < 5; i++){
            String a = "";
            for (int j = 0; j < 100000; j++){
                a += "a";
            }
            System.out.println(Thread.currentThread().getName() + " - Priority : " + Thread.currentThread().getPriority() + " - Count : " + i);
            try {
                Thread.sleep(100);
            }
            catch (Exception e){
                System.out.println(e);
            }
        }
    }
    public static void main(String[] args) {
        setPriority t1 = new setPriority("Low Priority Thread");
        setPriority t2 = new setPriority("Medium Priority Thread");
        setPriority t3 = new setPriority("High Priority Thread");
        t1.setPriority(Thread.MIN_PRIORITY);
        t2.setPriority(Thread.NORM_PRIORITY);
        t3.setPriority(Thread.MAX_PRIORITY);
        t1.start();
        t2.start();
        t3.start();
    }
}
