package _13Inheritance_Hierarchical;

public class animal {
    public String name;
    public String color;
    public int age;

    public void makeSound(){
        System.out.println("Some Sounds");
    }

    public void setname(String name){
        this.name = name;
    }
    public void setcolor(String color){
        this.color = color;
    }
    public void setage(int age){
        this.age = age;
    }

    public String getname(){
        return name;
    }
    public String getcolor(){
        return color;
    }
    public int getage(){
        return age;
    }
}
