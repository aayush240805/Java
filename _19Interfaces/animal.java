package _19Interfaces;

public interface animal {
    //don't need to write public static final
    public static final int max_age = 50;

    //don't need to write abstract. And also public because its instance will not be created.
    public abstract void eat();
    public void sleep();

    //this will generate error if not implement it in subclass.
    //public abstract void running();

    //static method : not necessary to implement inside sub class. And only can be acesss by interface class.
    public static void info(){
        System.out.println("This is Animals Interface.");
    }

    //default method : not necessary to implement inside every sub class. But only accessed by object. And also can run instance methods.
    public default void run(){
        System.out.println("Animals are running");
        this.eat();
    }
}
