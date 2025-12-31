package _17StaticMethods;

public class utils {
    public static void max(int a, int b){
        if(a > b){
            System.out.println("a is greater.");
        }
        System.out.println("b is greater");
    }

    public static String trimAndUpper(String s){
        if(s != null){
            return s.trim().toUpperCase();
        }
        return "...";
    }
}

