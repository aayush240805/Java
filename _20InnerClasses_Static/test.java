package _20InnerClasses_Static;

public class test {
    public static void main(String[] args){
        computer c = new computer("HP", "ABC", "XYZ");
        c.getOS().displayInfo();


        computer.USB usb = new computer.USB("Type-C");
        usb.displayUSB();
    }
}

