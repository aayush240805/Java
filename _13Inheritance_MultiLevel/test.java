package _13Inheritance_MultiLevel;

public class test {
    public static void main(String[] args) {
        // GrandParent g = new GrandParent("Ved Prakash", 70);
        // Parent p = new Parent("Pradeep", 45);

        // constructor chaining
        // super() is a special statement used within a subclass constructor to explicitly invoke the constructor of its immediate parent class (superclass).
        child c = new child("Aayush", 20);
        c.grandParentMethod();
        c.parentMethod();
        c.ChildMethod();
        System.out.println("...................\n");

    }
}
