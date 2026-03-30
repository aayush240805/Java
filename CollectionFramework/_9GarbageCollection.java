package CollectionFramework;

import java.lang.ref.WeakReference;

class phone {
    private String brand;
    private String model;

    public phone(String brand, String model){
        this.brand = brand;
        this.model = model;
    }

    @Override
    public String toString() {
        return "phone{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                '}';
    }
}

public class _9GarbageCollection {
    public static void main(String[] args) throws InterruptedException {
        phone p1 = new phone("Motorola", "edge 60 fusion");
        System.out.println(p1);
        p1 = null;
        System.gc(); // JVM does this automatically not need to do this.
        System.out.println(p1);



        // Used in cache missing : if data not found in not found in cache memory then data can be fetched from the actual source(RAM).
        WeakReference<phone> p2 = new WeakReference<>(new phone("Realme", "7i")) ;
        System.out.println(p2.get());
        System.gc(); // Here we need to suggest the JVM
        Thread.sleep(2000);
        System.out.println(p2.get());
    }
}
