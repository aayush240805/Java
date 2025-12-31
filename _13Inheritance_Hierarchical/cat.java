package _13Inheritance_Hierarchical;

public class cat extends animal{

    public cat(String name, String color, int age){
        this.name = name;
        this.color = color;
        this.age = age;
    }

    @Override
    public void makeSound(){
        System.out.println("Meow");
    }
}
