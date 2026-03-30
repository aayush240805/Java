package CollectionFramework.Streams;

import javax.sql.rowset.Predicate;
import java.util.*;
import java.util.function.IntBinaryOperator;
import java.util.stream.Collectors;

public class _7Collectors {
    public static void main(String[] args) {
        // Collectors is a utility class
        // Provides a set of methods to create common collectors

        // 1.Collecting to a List
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie");
        List<String> collect1 = names.stream().collect(Collectors.toList());
        System.out.println(collect1);

        // 1.Collecting to a Set
        List<Integer> nums = Arrays.asList(1, 2, 2, 3, 4, 4, 5);
        Set<Integer> collect2 = nums.stream().collect(Collectors.toSet());
        System.out.println(collect2); // return only unique elements

        // 3.Collecting to a specific collection
        ArrayDeque<String> collect3 = names.stream().collect(Collectors.toCollection(() -> new ArrayDeque<>()));
        System.out.println(collect3);

        // 4.Joining Strings
        String collect4 = names.stream().map(String::toUpperCase).collect(Collectors.joining(" $ "));
        System.out.println(collect4);

        // 5.Summarizing Data
        // Generates Statistical summary (count, sum , average, min, max)

        List<Integer> numbers = Arrays.asList(5,3,5,9,2);
        IntSummaryStatistics collect5 = numbers.stream().collect(Collectors.summarizingInt(x -> x));
        System.out.println(collect5);
        System.out.println("Count : " + collect5.getCount());
        System.out.println("Sum : " + collect5.getSum());
        System.out.println("Average : " + collect5.getAverage());
        System.out.println("Min : " + collect5.getMin());
        System.out.println("Max : " + collect5.getMax());

        // 6.Calculating Averages
        Double collect6 = numbers.stream().collect(Collectors.averagingInt(x -> x));
        System.out.println(collect6);

        // 7.Counting Elements
        Long collect7 = numbers.stream().collect(Collectors.counting());
        System.out.println(collect7);

        // 8.Grouping Elements
        List<String> words = Arrays.asList("java", "hello", "world", "streams", "collections");
        Map<Integer, List<String>> collect8 = words.stream().collect(Collectors.groupingBy(x -> x.length()));
        System.out.println(collect8);

        Map<Integer, String> collect9 = words.stream().collect(Collectors.groupingBy(String::length, Collectors.joining(", ")));
        System.out.println(collect9);

        Map<Integer, Long> collect10 = words.stream().collect(Collectors.groupingBy(String::length, Collectors.counting()));
        System.out.println(collect10);

        TreeMap<Integer, Long> collect11 = words.stream().collect(Collectors.groupingBy(String::length, TreeMap::new, Collectors.counting()));
        System.out.println(collect11);

        // 9.Partioning Elements
        // Partitions elements into two groups based on predicate (true or false)
        Map<Boolean, List<String>> collect12 = words.stream().collect(Collectors.partitioningBy(x -> x.length() > 5));
        System.out.println(collect12);

        // 10.Mapping & Collecting
        // Applies a mapping function before collecting
        List<String> collect13 = words.stream().collect(Collectors.mapping(x -> x.toUpperCase(), Collectors.toList()));
        System.out.println(collect13);


        // PRACTICE QUESTIONS
        // Example 1 : Collecting names by length
        List<String> list = Arrays.asList("Anna", "Bob", "Alexander", "Brian", "Alice");
        Map<Integer, List<String>> collect14 = list.stream().collect(Collectors.groupingBy(String::length));
        System.out.println(collect14);

        // Example 2 : Counting word occurrences
        String sentence = "hello world hello java world";
        Map<String, Long> collect15 = Arrays.stream(sentence.split(" ")).collect(Collectors.groupingBy(x -> x, Collectors.counting()));
        System.out.println(collect15);

        // Example 3 : Partitioning even and odd numbers
        List<Integer> list1 = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
        Map<Boolean, List<Integer>> collect16 = list1.stream().collect(Collectors.partitioningBy(x -> x % 2 == 0));
        System.out.println(collect16);

        // Example 4 : Summing values in a map
        Map<String, Integer> items = new HashMap<>();
        items.put("Apple", 45);
        items.put("Banana", 25);
        items.put("Orange", 30);
        System.out.println(items.values().stream().reduce(Integer::sum).get());
        System.out.println(items.values().stream().collect(Collectors.summingInt(x -> x)));

        // Example 5 : Creating a map from stream elements
        List<String> list2 = Arrays.asList("Apple", "Grapes", "Pineapple");
        Map<String, Integer> collect17 = list2.stream().collect(Collectors.toMap(String::toUpperCase, String::length));
        System.out.println(collect17);

        // Example 6 :
        List<String> list3 = Arrays.asList("apple", "banana", "apple", "orange", "banana", "apple");
        Map<String, Long> collect18 = list3.stream().collect(Collectors.groupingBy(x -> x.toUpperCase(), Collectors.counting()));
        System.out.println(collect18);
        // Using toMap()
        Map<String, Integer> collect19 = list3.stream().collect(Collectors.toMap(k -> k, v -> 1, (x, y) -> x + y));
        System.out.println(collect19);
    }
}
