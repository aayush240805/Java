package _16AccessModifiers_Private;

public class student {
    public String name;
    public int age;

    //Private Constructor
    private student(){
    }

    //A static method in Java is a method that belongs to the class itself, rather than to any specific object or instance of that class.
    public static void saySomething(){
        System.out.println("hello");
    }
    public static void changeSomething(){
        System.out.println("hi");
    }
}

