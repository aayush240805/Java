package CollectionFramework.Streams;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static java.util.stream.IntStream.range;
import static java.util.stream.IntStream.rangeClosed;

public class _8PrimitiveStreams {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        IntStream stream = Arrays.stream(numbers);

        Integer[] numbs = {6, 7, 8, 9, 10};
        Stream<Integer> stream1 = Arrays.stream(numbs);


        System.out.println(range(1, 5).boxed().collect(Collectors.toList())); // 1-4 (exclude)
        System.out.println(rangeClosed(1, 5).boxed().collect(Collectors.toList())); // 1-5 (include)

        IntStream.of(1, 2, 3);

        DoubleStream doubles = new Random().doubles(5);
//        System.out.println(doubles.sum());
//        System.out.println(doubles.summaryStatistics());
        System.out.println(doubles.mapToInt(x -> (int) (x + 1)));
//        System.out.println(doubles.boxed().toList());

        IntStream ints = new Random().ints(5);
        System.out.println(ints.boxed().toList());
    }
}
