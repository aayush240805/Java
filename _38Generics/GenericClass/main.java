package _38Generics.GenericClass;

//Naming Conventions
// T : Type
// E : Element (Used in collections)
// K : Keys (Used in maps)
// V : Values (Used in maps)
// N : Number

public class main {
    public static void main(String[] args) {
        box<Integer> b = new box<>(); // box is now type safe
        b.setValue(1);
        //String  s = (String) b.getValue(); // <- Now error at compile time
        //System.out.println(s);
        int i = b.getValue();
        System.out.println(i);

        pair<String, Integer> p = new pair<>("age ", 20);
        System.out.println(p.getKey() + p.getValue());
    }

}
