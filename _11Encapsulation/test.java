package _11Encapsulation;

public class test {
    public static void main(String[] args){
        student s1 = new student();
        s1.setname("aayush");
        s1.setroll_no(1);
        s1.setmarks(44);

        System.out.println(s1.getname());
        System.out.println(s1.getroll_no());
        System.out.println(s1.getmarks());
    }
}
