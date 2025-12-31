package _14Polymorphism_RunTime;

public class test {
    public static void main(String[] args) {
        animal a1 = new animal();
        a1.makeSound();
        dog d1 = new dog();
        d1.makeSound();
        cat c1 = new cat();
        c1.makeSound();

        animal a2 = new dog();// <- reference of animal & object created of dog.
        a2.makeSound();
        animal a3 = new cat();// <- reference of animal & object created of cat.
        a3.makeSound();
    }
}
