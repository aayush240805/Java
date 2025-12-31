package _9OOPs;

public class test {
    public static void main(String[] args){
        car c1 = new car();
        c1.setbrand("Mahindra");
        c1.setmodel("Scorpio");
        c1.setyear(2022);
        c1.setspeed(56);

        c1.accelerate(4);
        System.out.println(c1.getspeed());
        c1.brake(20);
        System.out.println(c1.getspeed());


        // animal a1 = new animal();
        // dog d1 = new dog();
        // a1.makeSound();
        // d1.makeSound();

        animal a1 = new dog(); // run-time polymorphism : it creates a dog object but stores its reference in an animal.
        a1.makeSound();
    }
}


