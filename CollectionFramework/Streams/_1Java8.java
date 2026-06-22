package CollectionFramework.Streams;

//Runnable -> functional interface
//class Task implements Runnable {
//
//    @Override
//    public void run() {
//        System.out.println("Message");
//    }
//}

import java.util.Arrays;
import java.util.List;
import java.util.function.*;
import java.util.stream.Collectors;

interface mathOperation {
    public int add(int a, int b);
}
class sumOperation implements mathOperation {
    @Override
    public int add(int a, int b) {
        return a + b;
    }
}


public class _1Java8 {
    public static void main(String[] args) {
        // Java 8 features
        // Minimal Code, Functional Programming,
        // Streams, Date & Time API

        // Lambda Expression : It is an anonymous function (no name, no return type, no access modifier).
        //                     It provides a concise way to implement a functional interface.
//        Thread T1 = new Thread(new Task());
//        T1.start();

        // Using Lambda Expression : remove name, return type, access modifier.
        Thread T2 = new Thread(() -> {
            System.out.println("Message");
        });
        T2.start();

        mathOperation sum = (a, b) -> a + b;
        mathOperation sub = (a, b) -> a - b;
        int ans1 = sum.add(2,4);
        System.out.println(ans1);

        int ans2 = sum.add(20,4);
        System.out.println(ans2);


        // Predicate --> functional interface --> (boolean valued function) --> checks condition
        // <input>,  return boolean

        Predicate<Integer> isEven = x -> x % 2 == 0; //
        System.out.println(isEven.test(3));

        Predicate<String> isWordStartsWithA = x ->x.toLowerCase().startsWith("a");
        Predicate<String> isWordendsWithH = x ->x.endsWith("h");
        Predicate<String> and = isWordStartsWithA.and(isWordendsWithH);

        System.out.println(isWordStartsWithA.test("Aayush"));
        System.out.println(isWordendsWithH.test("Aayush"));
        System.out.println(and.test("Aayush"));

        //Function --> works
        //<input type, return type>

        Function<Integer, Integer> doubleIt = x -> x * 2;
        Function<Integer, Integer> tripleIt = x -> x * 3;
        System.out.println(doubleIt.apply(40));
        System.out.println(doubleIt.andThen(tripleIt).apply(30)); // same
        System.out.println(doubleIt.compose(tripleIt).apply(30)); // same

        Function<Integer, Integer> identity = Function.identity();
        int result = identity.apply(44);
        System.out.println(result);

        // Consumer : only takes input, return nothing. It is used to print something.
        // <input type>

        Consumer<Integer> consumer = x -> System.out.println(x);
        consumer.accept(99);

        List<Integer> list = Arrays.asList(1, 2, 3);
        Consumer<List<Integer>> listConsumer = x ->{
            for (int i : list){
                System.out.println(i);
            }
        };

        listConsumer.accept(list);


        // Supplier : only returns, no takes any input
        // <return type>
        Supplier<String> stringSupplier = () -> "Hello World";
        System.out.println(stringSupplier.get());



        // Combined Example

        Predicate<Integer> predicate = x -> x % 2 == 0;
        Function<Integer, Integer> function = x -> x * x; // square
        Consumer<Integer> consumer1 = x -> System.out.println(x);
        Supplier<Integer> supplier = () -> 100;

        if(predicate.test(supplier.get())){
            consumer1.accept(function.apply(supplier.get()));
        }


        // BiPredicate, BiConsumer, BiFunction

        // BiPredicate -> <input type, input type>
        BiPredicate<Integer, Integer> isSumEven = (x, y) -> (x + y) % 2 == 0;
        System.out.println(isSumEven.test(3, 5));

        // BiConsumer -> <input type, input type>
        BiConsumer<Integer, String> biConsumer = (x, y) -> {
            System.out.println(x);
            System.out.println(y);
        };

        biConsumer.accept(100, "Hundred");

        //BiFunction -> <input type, input type, return type>
        BiFunction<String, String, Integer> biFunction = (x, y) -> (x + y).length();
        System.out.println(biFunction.apply("Aayush", "Sharma"));

        // Unary & Binary Operator : for comfort , used when input, return type is same.

        UnaryOperator<Integer> unaryOperator = x -> x * 2;
        System.out.println(unaryOperator.apply(4));
        BinaryOperator<Integer> binaryOperator = (x, y) -> x + y;
        System.out.println(binaryOperator.apply(4, 6));


        // Method Reference : Use method without invoking & using inplace of lambda expression
        List<String> list1 = Arrays.asList("Ram", "Shyam", "GhanShyam");

        // To print a list by writing single line of code.
//        list1.forEach(x -> System.out.println(x)); // lambda expression
        list1.forEach(System.out::println); // lambda expression replaced with method reference
                                            // method -> println() passed as parameter


        // Constructor Reference

        // converting a list of names to mobile phones
        class mobilePhone {
            private String name;

            public mobilePhone(String name) {
                this.name = name;
            }
        }
        List<String> names = Arrays.asList("A", "B", "C");
//        names.stream().map(x -> new mobilePhone(x)).collect(Collectors.toList()); // using lambda expression
        names.stream().map(mobilePhone::new).collect(Collectors.toList()); // using constructor reference


    }


}
