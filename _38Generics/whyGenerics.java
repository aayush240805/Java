package _38Generics;

import java.util.ArrayList;

// Problems
//Type Safety Issue
//Manual Casting
//No Compile Time Checking

// -> Soltion : Generics



public class whyGenerics {
    public static void main(String[] args) {
        ArrayList list = new ArrayList(); // can store object type data(any type of data).
        // all class like -> String, Integer, Float, Char etc. all extends object class.
        list.add("hello");
        list.add(1);
        list.add(3.14);

        //Manual Casting needed here because child class can't
//        Object o = list.get(2);
//        System.out.println(o);

        String s = (String) list.get(1); // <- Run Time Exception : Integer can't cast into String
        System.out.println(s);

        //But now we can add array list defined type data.
//        ArrayList<String> list = new ArrayList<>();
//        list.add("hill");
//        list.add("stations");
//        list.add(String.valueOf(2));
    }
}
