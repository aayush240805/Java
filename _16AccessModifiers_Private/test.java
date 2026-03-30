package _16AccessModifiers_Private;

public class test {
    public static void main(String[] args){
        //_31LamdaExpression.student s = new _31LamdaExpression.student();

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
