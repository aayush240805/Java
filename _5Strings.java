class Student{
    String name;
    int roll_no;
    int marks;
}

public class _5Strings {
    public static void main(String[] args){
        Student s1 = new Student(); // <- heap memory
        s1.name = "aayush";
        s1.roll_no = 1;
        s1.marks = 44;

        System.out.println("name : " + s1.name + "\nroll no. : " + s1.roll_no + "\nmarks : " + s1.marks);


//string pool
        String str1 = "aayush";
        String str2 = "aayush";

//heap
        String a = new String(str1);
        String b = new String(str2);

//cheaking references(not equality)
        System.out.println(str1 == str2);
        System.out.println(a == b);





        //STRING METHODS
        //it is unmutable.
        String name1 = "Aayush Sharma";
        String name2 = "aayush sharma";
        System.out.println(name1.length());
        System.out.println(name1.charAt(4));
        System.out.println(name1.equals(name2));
        System.out.println(name1.equalsIgnoreCase(name2));
        System.out.println(name1.compareTo(name2));
        System.out.println(name1.compareToIgnoreCase(name2));
        System.out.println(name1.substring(3,11));
        System.out.println(name1.substring(7,name1.length()));
        System.out.println(name1.toLowerCase());
        System.out.println(name1.toUpperCase());
        System.out.println(name1.replace("Sharma", "Kavist"));
        System.out.println(name1.contains("sh"));
        System.out.println(name1.startsWith("Aa"));
        System.out.println(name1.endsWith("ma"));
        System.out.println(name1.indexOf("a"));
        System.out.println(name1.lastIndexOf("a"));

        String ss = "";
        String st = " ";
        System.out.println(ss.isEmpty());
        System.out.println(st.isBlank());
    }
}

