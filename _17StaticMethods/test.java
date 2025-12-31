package _17StaticMethods;

public class test {
    //JVM calls it without creating an object of class _17StaticMethods
    public static void main(String[] args){
        student s1 = new student();
        student s2 = new student();
        student s3 = new student();
        student s4 = new student();

        //without creating an object
        System.out.println(student.count);
        student.getCount();


        utils.max(4,5);
        System.out.println(utils.trimAndUpper("          sde is Software Developer Engineer"));


        //singleton s = new singleton();

        //only once instance will be created.
        System.out.println(singleton.getInstance());
        System.out.println(singleton.getInstance());
        System.out.println(singleton.getInstance());
        System.out.println(singleton.getInstance());
        System.out.println(singleton.getInstance());
    }
}
