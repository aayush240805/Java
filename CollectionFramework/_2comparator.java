package CollectionFramework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

class integerComparator implements Comparator<Integer> {

    // if return -ve : o1 -> o2
    // if return +ve : o2 -> o1
    // sequence of o1 & o2 we can change as per the requirement(ascending or descending).
    @Override
    public int compare(Integer o1, Integer o2) {
//        return o1 - o2; // for ascending order
        return o2 - o1; // for descending order
    }
}

class stringLengthComparator implements Comparator<String> {

    @Override
    public int compare(String s1, String s2) {
        return s2.length() - s1.length(); // for ascending order
    }
}

class student {
    private  String name;
    private double gpa;

    public student(String name, double gpa){
        this.name = name;
        this.gpa = gpa;
    }

    public String getName(){
        return name;
    }

    public double getGpa(){
        return gpa;
    }
}

public class _2comparator {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(4);
        list.add(6);
        list.add(2);

//        list.sort(null); // by default returns increasing order(For Natural Ordering).
        list.sort(new integerComparator());
//        //Using Lambda Expression
//        list.sort((a, b) -> b - a);
        System.out.println(list);




        List<String> fruits = Arrays.asList("Banana", "Apple", "date");
//        fruits.sort(null); // by default sorts alphabetically.
        fruits.sort(new stringLengthComparator());
//        //Using Lambda Expression
//        fruits.sort((a, b) -> b.length() - a.length());
        System.out.println(fruits);


        List<student> sList = new ArrayList<>();
        sList.add(new student("neha", 4.3));
        sList.add(new student("ritu", 5.9));
        sList.add(new student("aayush", 4.3));
        sList.add(new student("sonam", 6.4));

//        sList.sort(null); // it will return an Exception.
        sList.sort((s1, s2) -> {
            if (s2.getGpa() - s1.getGpa() > 0){
                return 1;
            }
            else if (s2.getGpa() - s1.getGpa() < 0) {
                return -1;
            }
            else {
                return s1.getName().compareTo(s2.getName());
            }
        });

        //In Java 8
        // -> :: reference operator
//        Comparator<student> c = Comparator.comparing(student :: getGpa).reversed().thenComparing(student::getName);
//        sList.sort(c);

        for (student s : sList){
            System.out.println(s.getName() + " : " + s.getGpa());
        }

    }
}
