package _17StaticMethods;

public class student {
    public static int count = 0;

    static {
        System.out.println("Hahahahahahaha.....");
    }
    private int id;
    private String name;
    private int age;
    public student(){
        count++;
    }
    public static void getCount(){
        System.out.println("total students : " + count);
    }
}

