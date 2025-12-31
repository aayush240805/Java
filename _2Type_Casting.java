public class _2Type_Casting {
    public static void main(String[] args){
//Implicit Conversion By The Compiler. Also known as widening conversion.

        int a = 10; // 4 bytes
        long b = a; // 8 bytes
        float c = a; // 4 bytes
        double d = a; // 8 bytes

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);

//Explicit Conversion By The User. Also known as narrowing conversion.
        double db = 234.34;
        float f = (float) db;
        long l = (long) f;
        int i = (int) l;
        System.out.println(db);
        System.out.println(f);
        System.out.println(l);
        System.out.println(i);

        long lg = Long.MAX_VALUE; // 01111111 11111111 11111111 11111111 11111111 11111111 11111111 11111111
        int in = (int) lg; // 11111111 11111111 11111111 11111111 (-ve)
        System.out.println(lg);
        System.out.println(in);
        System.out.println(Long.toBinaryString(lg));
        System.out.println(Integer.toBinaryString(-1));
    }
}
