package _16AccessModifiers_Protected;

public class test {
    public static void main(String[] args){
        dog d = new dog("BOB");
        d.wagTail();

        d.makeSound();
        d.callChangeSound("Hooooooooo...");
        d.makeSound();

        //This method can'nt accessed directly from animal.
        //d.changeSound();
    }
}

