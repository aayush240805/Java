package CollectionFramework.Streams;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Stream;

public class _3IntermediateOperations {
    public static void main(String[] args) {
        // Intermediate Operations transforms a Stream into another Stream.
        // They are lazy, meaning they don't execute until a terminal operation is invoked.

        // 1.Filter
        List<String> list = Arrays.asList("Arun Kumar", "Manoj","Arjun", "Kuldeep", "Arjun");
        Stream<String> s1 = list.stream().filter(x -> x.startsWith("A"));
        // No filtering is done at this point
        long result1 = list.stream().filter(x -> x.startsWith("A")).count();
        System.out.println(result1);

        // 2.Map
//        Stream<String> s2 = list.stream().map(x -> x.toUpperCase());
        Stream<String> s2 = list.stream().map(String::toUpperCase); // method reference

        // 3.Sorted
        Stream<String> s3 = list.stream().sorted();
        Stream<String> s4 = list.stream().sorted((a, b) -> a.length() - b.length());

        // 4.Distinct
        long result2 = list.stream().filter(x -> x.startsWith("A")).distinct().count();
        System.out.println(result2);

        // 5.Limit
        System.out.println(Stream.iterate(1, x -> x + 1).limit(100));

        // 6.Skip
        System.out.println(Stream.iterate(1, x -> x + 1).skip(10).limit(100)); // 11 to 110

        // 7.Peek
        // Performs an action on each element as it is consumed.
        Stream.iterate(1, x -> x + 1).skip(10).limit(100).peek(System.out::println).count();

        // 8.FlatMap
        // Handles streams of collections, list or arrays where each element is itself a collection.
        // Flatten nested structures (e.g. lists within lists) so that they can be processed as a single sequence.
        // Transform and flatten elements at the same time.

        List<List<String>> listOfLists = Arrays.asList(
                Arrays.asList("Apple", "Banana"),
                Arrays.asList("Orange", "Kiwi"),
                Arrays.asList("Pear", "Grape")
        );
//                                                      FLATTEN                  TRANSFORM
//        System.out.println(listOfL ists.stream().flatMap(x -> x.stream()).map(x -> x.toUpperCase()).toList());
        System.out.println(listOfLists.stream().flatMap(Collection::stream).map(String::toUpperCase).toList());

        List<String> sentences = Arrays.asList(
                "Hello World",
                "Java Streams Are Powerful",
                "FlatMap Is Useful"
        );

        System.out.println(sentences.stream().flatMap(x -> Arrays.stream(x.split(" "))).map(String::toUpperCase).toList());


    }
}
