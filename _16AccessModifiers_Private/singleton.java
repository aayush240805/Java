package _16AccessModifiers_Private;

public class singleton {
    //this instance can be accessed with the help of school class, do'nt need to create any instance externally.
    public static singleton instance;

    private singleton(){

    }

    public static singleton getInstance(){
        if(instance == null){
            instance = new singleton();
        }
        return instance;
    }
}
