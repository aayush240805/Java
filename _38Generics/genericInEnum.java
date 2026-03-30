package _38Generics;

enum Day{
    Monday, Tuesday, Wednesday, Thursday, Friday, Saturday, Sunday
}

public class genericInEnum {
    public static void main(String[] args) {
        Day d1 = Day.Friday;
        System.out.println(d1);

//        Day d2 = "Monday"; // Type Safety exists already.
    }
}
