package _20InnerClasses_Anonymous;

public class creditCard implements payment{
    private String PIN;

    public creditCard(String PIN){
        this.PIN = PIN;
    }

    @Override
    public void pay(double amount){
        System.out.println("paid " + amount + " using credit card.");
    }
}
