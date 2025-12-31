package _21Exeptions;

public class stackTrace {
    public static void level1(){
        level2();
    }
    public static void level2(){
        level3();
    }
    public static void level3(){
        int[] arr = new int[4];
        arr[4] = 44;
    }

    public static void main(String[] args) {
        try{
            level1();
        }
        catch(Exception e){
            //e.printStackTrace();
            System.out.println(e.getMessage());
        }
    }
}
