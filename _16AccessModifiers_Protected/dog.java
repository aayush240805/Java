package _16AccessModifiers_Protected;

public class dog extends animal {
    public dog(String name){
        super(name, "barking...");
    }

    public void wagTail(){
        System.out.println("wagging its tail...");
    }

    protected String getName(){
        return getClass().getSimpleName();
    }

//this dog-> subclass is extending the superclass-> animal.
//so we can access this method whereas it is protect.

    public void callChangeSound(String newSound){
        changeSound(newSound);
    }
}

