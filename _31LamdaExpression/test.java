package _31LamdaExpression;

public class test {
    public static void main(String[] args) {

//Anonymous Function
        student s1 = new student() {
            @Override
            public String getBio(String name) {
                return name + " is Engineering Student.";
            }
        };
        System.out.println(s1.getBio("Aayush"));

//Using lambda expression
        student s2 = (String name) -> {
            return name + " is Law Student.";
        };
        System.out.println(s2.getBio("Aayush"));

        student s3 =name ->  name  + " is Medical Student.";
        System.out.println(s3.getBio("Aayush"));




        Runnable r = new Runnable() {
            @Override
            public void run() {
                System.out.println("hello world");
            }
        };

        Thread t1 = new Thread(r);
        t1.start();

//Using lambda expression
        Thread t2 = new Thread(() -> System.out.println("hello world"));
        t2.start();

        Thread t3 = new Thread(() -> {
            for (int i = 1; i <= 5; i++){
                System.out.println(i);
            }
        });
        t3.start();
    }
}
