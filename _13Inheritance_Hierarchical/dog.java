package _13Inheritance_Hierarchical;

public class dog extends animal{

    public dog(String name, String color, int age){
        this.name = name;
        this.color = color;
        this.age = age;
    }

    @Override
    public void makeSound(){
        System.out.println("Barking");
    }
}
