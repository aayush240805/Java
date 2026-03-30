package _38Generics;

public class genericMethod {

    public static <T> void print(T[] arr){
        for (T element : arr){
            System.out.println(element + " ");
        }
        System.out.println();
    }

    public static <T> void display(T element){
        System.out.println("Generic Display : " + element);
    }

    public static <T> void display(Integer element){
        System.out.println("Integer Display : " + element);
    }

    enum Operations{
        ADD, SUB, MUL, DIV;

        public <T extends Number> double apply(T a, T b){
            switch (this){ // <- this indicates an instance
                case ADD -> {
                    return a.doubleValue() + b.doubleValue();
                }
                case SUB -> {
                    return a.doubleValue() - b.doubleValue();
                }
                case MUL -> {
                    return a.doubleValue() * b.doubleValue();
                }
                case DIV -> {
                    return a.doubleValue() / b.doubleValue();
                }
                default -> {
                    System.out.println("Unknown Operation" + this);
                }
            }
            return 0;
        }
    }

    public static void main(String[] args) {
        Integer[] num = {1, 2, 3, 4, 5};
        String[] str = {"hello", "world"};
        print(num);
        print(str);

        //Function Overloading
        display(12);
        display(4.4);


        System.out.println(Operations.ADD.apply(20, 4));
        System.out.println(Operations.SUB.apply(20, 4));
        System.out.println(Operations.MUL.apply(20, 4));
        System.out.println(Operations.DIV.apply(20, 4));
    }

}


