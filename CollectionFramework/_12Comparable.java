package CollectionFramework;

// Difference Between Comparator & Comparable
// Comparator is used to sort data elements of a collection along multiple fields on the basis of own logic.
// Comparable is used to sort data elements of a collection on the basis of natural ordering.

import java.util.ArrayList;
import java.util.List;

class students implements Comparable<students> {
    private String name;
    private double marks;

    public students(String name, double marks) {
        this.name = name;
        this.marks = marks;
    }

    public double getMarks() {
        return marks;
    }

    @Override
    public int compareTo(students o) {
        // 4.compareTo(3)
        // -ve (for descending order)
        return Double.compare(o.getMarks(), this.getMarks());
//        return  (int) o.getMarks() - (int) this.getMarks();
    }

    @Override
    public String toString() {
        return "Name : " + name + ", marks : " + marks;
    }
}

public class _12Comparable {
    public static void main(String[] args) {
        List<students> list = new ArrayList<>();
        list.add(new students("Charlie", 3.5));
        list.add(new students("Bob", 3.7));
        list.add(new students("Alice", 3.6));
        list.add(new students("Akshit", 3.9));

        list.sort(null);
        System.out.println(list);

    }
}
