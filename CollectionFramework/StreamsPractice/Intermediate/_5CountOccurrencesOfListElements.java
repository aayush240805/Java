package CollectionFramework.StreamsPractice.Intermediate;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class _5CountOccurrencesOfListElements {

    public static void main(String[] args) {

        List<String> list = Arrays.asList("Apple", "Orange", "Apple", "Banana", "Banana", "Orange", "Banana");

        Map<String, Long> collect = list.stream()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        System.out.println(collect);

    }

}
