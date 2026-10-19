package CollectionFramework.StreamsPractice.Intermediate;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class _4GroupByStringLength {

    public static void main(String[] args) {

        List<String> list = Arrays.asList("Apple", "Bat", "Ball", "Cat", "Banana", "Dog");

        Map<Integer, List<String>> output = list.stream()
                .collect(Collectors.groupingBy(String::length));

        System.out.println(output);

    }

}
