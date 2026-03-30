package _27ThreadMethods;

public class _yield extends  Thread {
    public _yield(String name){
        super(name);
    }

    @Override
    public void run(){
        for (int i = 0; i < 5; i++){
            System.out.println(Thread.currentThread().getName() + " is running...");
            Thread.yield();
        }
    }

    public static void main(String[] args) {
        _yield t1 = new _yield("Tread 1");
        _yield t2 = new _yield("Tread 2");
        t1.start();
        t2.start();
    }
}
