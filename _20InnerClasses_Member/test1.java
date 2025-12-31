package _20InnerClasses_Member;

public class test1 {
    public static void main(String[] args){
        car1 c = new car1("Sonet");

        car1.Engine e = c.new Engine();
        e.start();
        e.stop();
    }
}

