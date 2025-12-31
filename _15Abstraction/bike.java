package _15Abstraction;

public class bike extends vehicle {
    @Override
    public void accelerate() {
        System.out.println("Speed Up");
    }
    @Override
    public void decelerate() {
        System.out.println("Speed Down");
    }
}

