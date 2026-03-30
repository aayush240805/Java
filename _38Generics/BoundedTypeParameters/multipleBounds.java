package _38Generics.BoundedTypeParameters;

interface printable {
    void print();
}

class myNumber extends Number implements printable {
    private int value;

    public myNumber(int value){
        this.value = value;
    }

    @Override
    public void print() {
        System.out.println("My Number : " + value);
    }

    @Override
    public int intValue() {
        return value;
    }

    @Override
    public long longValue() {
        return value;
    }

    @Override
    public float floatValue() {
        return value;
    }

    @Override
    public double doubleValue() {
        return value;
    }
}

class boxx<T extends Number & printable> { // class which extends Number and implements printable. And syntax should be -> Class & Interface1, Interface2... . And also there can be extends not implements.
    private T item;

    public boxx(T item){
        this.item = item;
    }

    public void display(){
        item.print();
    }

    public T getItem(){
        return item;
    }
}

public class multipleBounds {
    public static void main(String[] args) {
        myNumber mn = new myNumber(3);
        boxx<myNumber> bx = new boxx<>(mn);
        bx.display();
    }
}
