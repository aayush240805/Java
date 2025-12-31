package _18Final;

public class car extends vehicle{
    //Now this variable can't be updated further.
    private  static final int speedLimit = 120;


    // static{
    //     speedLimit = 150;
    // }

    //--->new value can't be assigned to speedLimit again
    // public static void setSpeedLimit(int newSL){
    //     speedLimit = newSL;
    // }

    public int getSpeedLimit(){
        return speedLimit;
    }

    //Now this method can't be overridden further.
    public /*final*/ void airBags(){
        System.out.println("4 Air Bags");
    }
}
