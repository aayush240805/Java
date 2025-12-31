package _13Inheritance_MultiLevel;

public class child extends parent{
    public child(String name, int age){
        super(name, age);
        System.out.println("Child constructor called");
        super.parentMethod();
    }

    public void ChildMethod(){
        System.out.println("Child method called");
    }
}
