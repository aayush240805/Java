public class _1Primitive_Datatypes {
    public static void main(String[] args){
        //Integral Numbers
        //byte
        byte b = 3;
        System.out.println(Byte.MIN_VALUE);
        System.out.println(Byte.MAX_VALUE);
        //short
        short s = 44;
        System.out.println(Short.MIN_VALUE);
        System.out.println(Short.MAX_VALUE);
        //int
        int i = 33879990;
        System.out.println(Integer.MIN_VALUE);
        System.out.println(Integer.MAX_VALUE);
        //long
        long l = 435678899877897678l;
        System.out.println(Long.MIN_VALUE);
        System.out.println(Long.MAX_VALUE);

        //Decimal Numbers
        //float  -> low precision range
        float f = 33.3564345434443f;
        System.out.println(f);
        //double -> high precision range
        double d = 34.5654565454345654345445;
        System.out.println(d);

        //Character
        char ch = 'A';
        System.out.println((int) ch);
        System.out.println((int)Character.MIN_VALUE);
        System.out.println((int)Character.MAX_VALUE);
        char heart = 10084; //<-ASCII CODE
        char hindi = '\u2764'; //<-UNICODE
        System.out.println(heart);
        System.out.println(hindi);

        for(int j = 0; j < 127; j++){
            System.out.println((char)j);
        }
        //Boolean
        boolean bool = false;
        System.out.println(bool);
    }
}
