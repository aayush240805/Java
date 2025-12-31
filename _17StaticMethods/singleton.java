package _17StaticMethods;

public class singleton {
    public static singleton instance = new singleton();

    private singleton(){

    }

    public static singleton getInstance(){
        return instance;
    }
}
