package _39StringStringBuilderStringBuffer;


// Key Features:
//              1. Immutable
//              2. Thread Safe
//              3. Slow Performance( due to immutability)


public class string {

    public static String  print() {

        String result = "";
        for (int i = 0; i < 1000; i++) {
            result += "newText ";
        }
        return result;
    }

    public static void main(String[] args) {
        String str = "hello";
        str.concat("world");
        System.out.println(str); // Can't change

        String str1 = str.concat("world");
        System.out.println(str1); // Can be reassign to new memory

        System.out.println(print()); // Poor performance due creating new string every time to update the string and excessive memory usage.
    }
}
