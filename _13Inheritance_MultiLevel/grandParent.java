package _13Inheritance_MultiLevel;

public class grandParent {
    private String name;
    private int age;
    public grandParent(String name, int age){
        this.name = name;
        this.age = age;
        System.out.println("Grandparent constructor called");
    }

    public void grandParentMethod(){
        System.out.println("Grandparent method called");
    }

    public void setname(String name){
        this.name = name;
    }
    public void setage(int age){
        this.age = age;
    }
}
