package CollectionFramework.Streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class _2StreamsIntroduction {
    public static void main(String[] args) {
        // Streams
        // Processing of collection of data in functional and declarative manner.
        // It was introduced in Java 8
        // It simplifies data processing (way of writing code).
        // Embrace functional programming.
        // Improve readability and maintainability.
        // Enable easy parallelism.

        // What is Streams ?
        // A sequence of elements supporting functional & declarative programming.

        // How to use Streams?
        // Source, intermediate operations & terminal operation.

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        // Traditional method
//        int count = 0;
//        for (int i : numbers){
//            if (i % 2 == 0){
//                count++;
//            }
//        }
//        System.out.println(count);

        // Using Streams
        System.out.println(numbers.stream().filter(x -> x % 2 == 0).count());
        // numbers --> source
        // filter() --> intermediate operation
        // count() --> terminal operation

        // Creating Streams
        // 1.From Collections
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        Stream<Integer> s1 = list.stream();
        // 2.From Arrays
        String[] string = {"a", "b", "c"};
        Stream<String> s2 = Arrays.stream(string);
        // 3.From Stream (direct)
        Stream<Integer> s3 = Stream.of(1, 2, 3, 4, 5);
        // 4.Infinite Stream
        Stream<Integer> s4 = Stream.generate(() -> 1).limit(100);

        // Converting Stream into List
        List<Integer> list1 = Stream.iterate(1, x -> x + 1).limit(100).collect(Collectors.toList());
        System.out.println(list1);
    }
}
