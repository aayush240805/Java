package CollectionFramework.Streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class _4TerminalOperators {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3);

        // 1.Collect
        list.stream().skip(1).collect(Collectors.toList());
        list.stream().skip(1).toList();

        // 2.ForEach : (in random order)
        list.stream().forEach(x -> System.out.println(x));

        // 3.Reduce : combines elements to produce a single result.
//        Optional<Integer> reduce = list.stream().reduce((x, y) -> x + y);
        Optional<Integer> reduce = list.stream().reduce(Integer::sum);
        System.out.println(reduce.get()); // 6

        // 4.Count
        long count = list.stream().count();
        System.out.println(count);

        // 5.anyMatch, allMatch, noneMatch
        boolean b = list.stream().anyMatch(x -> x % 2 == 0);
        System.out.println(b);
        boolean b1 = list.stream().allMatch(x -> x > 0);
        System.out.println(b1);
        boolean b2 = list.stream().noneMatch(x -> x < 0);
        System.out.println(b2);

        // 6.findFirst, findAny
        System.out.println(list.stream().findFirst().get());
        System.out.println(list.stream().findAny().get());

        // 7.toArray()
        Object[] array = Stream.of(1, 2, 3).toArray();

        // 8.Min/Max
        System.out.println("Max : " + Stream.of(12, 2, 45, 33).max(Comparator.naturalOrder()).get());
        System.out.println("Max by sorting in descending order (return Min) : " + Stream.of(12, 2, 45, 33).max((o1, o2) -> o2 - o1).get());
        System.out.println("Min : " + Stream.of(12, 2, 45, 33).min(Comparator.naturalOrder()).get());

        // 9.ForEachOrder : ( in order if using parallelStream)
        List<Integer> list3 = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        System.out.println("Using ForEach with parallel stream : ");
        list3.parallelStream().forEach(System.out::println);
        System.out.println("Using ForEachOrder with parallel stream : ");
        list3.parallelStream().forEachOrdered(System.out::println);


        // Example : filtering and collecting names
        List<String> names = Arrays.asList("Anna", "Bob", "Charlie", "David");
        System.out.println(names.stream().filter(x -> x.length() > 3).toList());

        // Example : squaring and sorting
        List<Integer> list1 = Arrays.asList(5, 9, 2, 1, 6);
        System.out.println(list1.stream().map(x -> x * x).sorted().toList());


        // Example : summing values
        List<Integer> list2 = Arrays.asList(1, 2, 3, 4, 5);
        System.out.println(list2.stream().reduce(Integer::sum).get());

        // Example : counting occurrence of character
        String str = "Hello World";
        System.out.println(str.chars().filter(x -> x == 'l').count());

        //Example : Stream can't be used after terminal operation has been called.
        Stream<String> stream = names.stream();
        stream.forEach(System.out::println); // terminal operation called
//        List<String> list3 = stream.map(String::toUpperCase).toList(); // Throw Exception


        // Stateful & Stateless Operations
        // Stateful -> sorted()  <-- all element should have known in advance
        // & Stateless -> map()  <-- can operate on single element


    }
}
