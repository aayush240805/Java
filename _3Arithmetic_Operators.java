public class _3Arithmetic_Operators {
    public static void main(String[] args){
        int a = 24;
        double b = 34.45;
        double c = a + b;
        System.out.println(c);

        long a1 = 35434343;
        int b1 = 34344;
        long c1 = a1 * b1;
        System.out.println(c1);

        double a2 = 10;
        int b2 = 3;
        double c2 = a2 / b2;
        System.out.println(c2);

        byte by = 4;
        //by = by + 1; // <- error: incompatible types: possible lossy conversion from int to byte
        by += 1; // <- Compound Assignment Operator
        by++; // <- increment
        System.out.println(by);

        int a4 = 3;
        int b4 = a4++;
        System.out.println(a4);
        System.out.println(b4);

        int a5 = 4;
        int b5 = a5++ + a5; // 4 + 5
        int c5 = ++a5 + a5; // 6 + 6
        System.out.println(b5);
        System.out.println(c5);
    }
}
