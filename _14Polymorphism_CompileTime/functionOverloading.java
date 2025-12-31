package _14Polymorphism_CompileTime;

public class functionOverloading {
//Compile-Time Polymorphism
//Method Overloading  (different in datatype or no. of attributes)
    public static int add(int a, int b){
        return a + b;
    }
    public static float add(float a, float b){
        return a + b;
    }

    public static int add(int a, int b, int c){
        return a + b + c;
    }
}
