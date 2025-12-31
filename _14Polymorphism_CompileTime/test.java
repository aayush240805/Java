package _14Polymorphism_CompileTime;

public class test {
    public static void main(String[] args) {
        int a = 1, b = 2, c = 3;
        System.out.println(functionOverloading.add(a, b));
        System.out.println(functionOverloading.add(9.8f, 9.9f));
        System.out.println(functionOverloading.add(a, b, c));
    }
}
