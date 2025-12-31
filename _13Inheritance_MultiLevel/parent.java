package _13Inheritance_MultiLevel;

public class parent extends grandParent{
    public parent(String name, int age){
        super(name, age);
        System.out.println("Parent constructor called");
        super.grandParentMethod();
    }

    public void parentMethod(){
        System.out.println("Parent method called");
    }
}
