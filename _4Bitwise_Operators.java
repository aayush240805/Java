public class _4Bitwise_Operators {
    public static void main(String[] args){

//AND &
//OR |
//XOR ^
//NOT ~
//RIGHT SHIFT >>
//LEFT SHIFT <<



        int a = 5;
        int b = 4;

        System.out.println(Integer.toBinaryString(a));
        System.out.println(Integer.toBinaryString(b));

        System.out.println(a & b);
        System.out.println(a | b);
        System.out.println(a ^ b);
        System.out.println(~a);
        System.out.println(a>>1); // divide by 2 once.
        System.out.println(a<<1); // multiply by 2 once.

        int c = 30;
        System.out.println(c>>3); // divide by 2 thrice.
        System.out.println(c<<3); // multiply by 2 thrice.
    }
}
