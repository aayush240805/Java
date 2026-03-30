package CollectionFramework.Streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class _5LazyEvaluation {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "David");
        Stream<String> stream = names.stream().filter(name -> {
            System.out.println("Filtering : " + name);
            return name.length() > 3;
        });

        // filter() <-- intermediate operation don't execute until terminal operation invoked
        System.out.println("Before Terminal Operation");

        List<String> result = stream.collect(Collectors.toList());
        // Can execute now

        System.out.println("After Terminal Operation");
        System.out.println(result);
    }
}
