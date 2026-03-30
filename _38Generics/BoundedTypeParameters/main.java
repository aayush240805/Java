package _38Generics.BoundedTypeParameters;

public class main {
    public static void main(String[] args) {
        box<Integer> b = new box<>();
//        box<String> s = new box<>(); // 'java.lang.String' is not within its bound; should extend 'java.lang.Number'

    }
}
