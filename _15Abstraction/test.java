package _15Abstraction;

public class test {
    public static void main(String[] args) {
        //Vehicle v1 = new Vehicle(); //Abstract Class's object can'nt be instantiated.

        bike b1 = new bike();
        b1.accelerate();
        vehicle b2 = new bike();
        b2.decelerate();

        car c1 = new car();
        c1.accelerate();
        vehicle c2 = new car();
        c2.decelerate();
    }
}
