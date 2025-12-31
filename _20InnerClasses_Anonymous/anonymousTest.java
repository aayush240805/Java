package _20InnerClasses_Anonymous;

public class anonymousTest {
    public static void main(String[] args){
        shoppingCart sc = new shoppingCart(1000);
        sc.processPayment(new payment() {
            //direct implementation
            @Override
            public void pay(double amount){
                System.out.println("paid " + amount + " using credit card.");
            }
        });
    }
}