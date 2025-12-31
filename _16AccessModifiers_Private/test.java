package _16AccessModifiers_Private;

public class test {
    public static void main(String[] args){
        //student s = new student();

        //without creating any instance
        student.saySomething();
        student.changeSomething();

        //only created once(use debugging here to observe the execution).
        singleton.getInstance();
        singleton.getInstance();
        singleton.getInstance();
        singleton.getInstance();
    }
}
