package CollectionFramework.StreamsPractice.Intermediate;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class _3PartitionEvenOdd {

    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        Map<Boolean, List<Integer>> output = list.stream()
                .collect(Collectors.partitioningBy(x -> x % 2 == 0));

        System.out.println("Even Numbers: " + output.get(true));
        System.out.println("Odd Numbers: " + output.get(false));

    }

}
