public class _23MathClass {
    public static void main(String[] args) {
        int a = 3;
        int b = 4;
        int c = -1;
        double d = 4.3;
        double e = 2.3;
        double f = 3.5;
        System.out.println(Math.max(a, b));
        System.out.println(Math.min(a, b));
        System.out.println(Math.abs(c));
        System.out.println(Math.floor(d));
        System.out.println(Math.ceil(d));
        System.out.println(Math.round(e));
        System.out.println(Math.round(f));
        System.out.println(Math.random());
        System.out.println((int)(Math.random()) * 10); // <-- this will always return 0
        System.out.println((int) (Math.random() * 11)); // <-- this will return between 1 to 10
        System.out.println(Math.log(10));
        System.out.println(Math.log10(10));
        System.out.println(Math.pow(5, 2));
        System.out.println(Math.sqrt(144));
        System.out.println(Math.nextAfter(3, 4));
        System.out.println(Math.PI);
        System.out.println(Math.E);
    }
}
