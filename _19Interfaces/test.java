package _19Interfaces;

public class test {
    public static void main(String[] args){
        dog d = new dog();
        System.out.println(dog.max_age);
        d.sleep();
        d.eat();

        cat c = new cat();
        System.out.println(cat.max_age);
        c.sleep();
        c.eat();

        //should access by interface(good practice).
        System.out.println(animal.max_age);

        //static methods should be access by interface classes only
        //dog.info();
        animal.info();

        // dog.run();
        d.run();
        c.run();
    }
}
