package CollectionFramework.StreamsPractice.Easy;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamCreationMethods {

    public static void main(String[] args) {

//        .......Creating Streams........

////        1. List -> Stream
        List<String> list = Arrays.asList("Hello", "World", "...");
        Stream<String> stream = list.stream();

////        2. Array -> Stream
        String[] arr = {"Java", "Python", "C++"};
        Stream<String> stream1 = Arrays.stream(arr);

////        3. StreamOf
        Stream<Integer> integerStream = Stream.of(1, 2, 3, 4);

////        4. Stream generate
        Stream<Double> generate = Stream.generate(Math::random).limit(5); //()-> Math.random is replaced by Lambda expression
        Stream<Integer> limit = Stream.generate(() -> 1).limit(10);

    }

}
