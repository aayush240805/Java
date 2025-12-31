package _20InnerClasses_Anonymous;

public class test {
    public static void main(String[] args){
        shoppingCart sc = new shoppingCart(1000);
        creditCard cc  = new creditCard("2222");
        sc.processPayment(cc);
    }
}
