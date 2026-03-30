import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class _22WrapperClasses {
    public static class student{
        int id;
    }

    public static void fun1(student s){
//        _31LamdaExpression.student s1 = new _31LamdaExpression.student();
//        s1.id = 2;
//        s = s1; // now s is pointing another object

        //but now it will change.
        s.id = 2;
    }

    public static void fun2(Integer i){
        i = 2;
    }

    public static void main(String[] args) {
        //primitive datatypes -> privitive variable -> stack
        //Autoboxing
        //it can't be null
        int a = 4;
        float f = 3.4f;

        //wrapper classes -> object -> heap
        //Unautoboxing
        //it can be null
        Integer d = null;

        Integer x = 4;
        System.out.println(x.floatValue());
        System.out.println(Integer.MAX_VALUE);
        Integer y = 3;
        System.out.println(Integer.max(x, y));
        System.out.println(x.floatValue());

        int x1 = x.intValue();

        y = Integer.valueOf(3);

        Integer z = null;

        Float F = 4f;
        System.out.println(y.equals((float) 4));
        Boolean b = true;
        System.out.println(b.toString());

        String str = "aayush";
        System.out.println(str.toUpperCase());
        System.out.println(str.valueOf("23"));
        //only wrapper classes can be use here.
        List<Integer> l = new ArrayList<>(4);



        //Function Analysing
        student s = new student();
        s.id = 1;
        fun1(s);
        System.out.println("s.id : " + s.id);


    // may be it is creating some difference b/w an object & wrapping class
        Integer i = 1;
        fun2(i);
        System.out.println("value of i : " + i);
    }
}
