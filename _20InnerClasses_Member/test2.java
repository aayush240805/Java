package _20InnerClasses_Member;

public class test2 {
    public static void main(String[] args){
        car2 c1 = new car2("Sonet");
        engine2 e1 = new engine2(c1);
        e1.start();
        e1.start();


        car2 c2 = new car2("Nexon");
        engine2 e2 = new engine2(c2);
        e2.start();
        e2.start();
    }
}

