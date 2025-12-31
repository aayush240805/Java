package _12Constructors;

public class test {
    public static void main(String[] args){
        employee e1 = new employee("aayush", "d2", 23, 33300); // <- parameterised constructor (user defined);
        //emp e2 = new emp(); // <-ERROR  <-default constructor (created by compiler to initialize an object)

        System.out.println(e1.name);
        System.out.println(e1.department);
        System.out.println(e1.age);
        System.out.println(e1.salary);
    }
}
