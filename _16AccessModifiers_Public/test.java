package _16AccessModifiers_Public;

public class test {
    public static void main(String[] args){
        student s = new student();
        s.name = "aayush";
        s.age = 20;
        System.out.println(s.name);
        System.out.println(s.age);
        s.saySomething();
    }
}