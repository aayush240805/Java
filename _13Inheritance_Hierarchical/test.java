package _13Inheritance_Hierarchical;

public class test {
    public static void main(String[] args) {
        animal a1 = new animal();
        System.out.println(a1.age);
        a1.makeSound();

        dog d1 = new dog("BOB", "White", 4);
        // d1.setname("BOB");
        // d1.setcolor("White");
        // d1.setage(4);
        d1.makeSound();
        System.out.println(d1.getname());
        System.out.println(d1.getcolor());
        System.out.println(d1.getage());

        cat c1 = new cat("Billi", "Black", 3);
        // c1.setname("Billi");
        // c1.setcolor("Black");
        // c1.setage(3);
        c1.makeSound();
        System.out.println(c1.getname());
        System.out.println(c1.getcolor());
        System.out.println(c1.getage());
    }
}
