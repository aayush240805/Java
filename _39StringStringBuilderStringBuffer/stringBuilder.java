package _39StringStringBuilderStringBuffer;

// Overcomes the limitations of string immutablity

// Key Features:
//               1. Mutable
//               2. Method Chaining
//               3. No Thread Safe
//               4. Fast Performance(due to no synchronization overhead)


public class stringBuilder {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Hello");
        sb.append("World").append(" !");
        System.out.println(sb);


        StringBuilder sb1 = new StringBuilder();
        System.out.println(sb1.append("Java"));
        System.out.println(sb1.insert(1, "aa"));
        System.out.println(sb1.replace(3, 4,"..."));
        System.out.println(sb1.delete(1, 2));
        System.out.println(sb1.reverse());
        System.out.println(sb1.charAt(2));
        System.out.println(sb1.length());
        System.out.println(sb1.substring(1, 4));


        StringBuilder sb2 = new StringBuilder();
        sb2.append(1).append(" + ").append(2).append(" always 3 ").insert(6, "+ 0 --> ").replace(6, 7, "-");
        System.out.println(sb2); // Mutable
    }
}
