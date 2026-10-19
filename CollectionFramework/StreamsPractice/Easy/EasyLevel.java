package CollectionFramework.StreamsPractice.Easy;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class EasyLevel {

    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(5, 2, 8, 2, 3, 5, 9, 3);

//        Find all distinct elements
        List<Integer> collect = list.stream()
                .distinct()
                .collect(Collectors.toList());
        System.out.println("Distinct elements: " + collect);

//        Find average of all numbers
        double average = list.stream()
                .mapToInt(Integer::intValue) // converting to primitive data type
                .average()
                .orElse(0.0);

        System.out.println("Average: " + average);

//        Sort -> Ascending & Descending
        List<Integer> asc = list.stream()
                .distinct()
                .sorted()
                .collect(Collectors.toList());

        List<Integer> dsc = list.stream()
                .distinct()
//                .sorted((a, b) -> b - a)
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());

        System.out.println("Sorted in ascending order: " + asc);
        System.out.println("Sorted in descending order: " + dsc);


        List<String> list1 = Arrays.asList("", "Apple", "Banana", "Avocado", "Mango", "Apricot", "amla");

//        Find strings starts with A
        long count = list1.stream()
                .filter(x -> x.startsWith("A"))
                .count();

        System.out.println("Count starts with A: " + count);

//        Joining all String in a list into a single comma separated string
        String collect1 = list1.stream()
                .collect(Collectors.joining(", ", "[", "]"));

        System.out.println(collect1);

//        Check if all elements positive in a list
        boolean b = list.stream()
                .allMatch(x -> x > 0);

        System.out.println("Check if all +ve: " + b);

//        Check if any element divisible by 3
        boolean b1 = list.stream()
                .anyMatch(x -> x % 3 == 0);

        System.out.println("Check if any divisible by 3: " + b1);


        List<List<Integer>> list2 = Arrays.asList(
                Arrays.asList(1, 2, 3),
                Arrays.asList(4, 5),
                Arrays.asList(6, 7, 8)
        );

//        Flatten the list of list
        List<Integer> collect2 = list2.stream()
                .flatMap(List::stream)
                .collect(Collectors.toList());

        System.out.println("Flatten list: " + collect2);

//        Find first non-empty element in a list
        Optional<String> first = list1.stream()
                .filter(x -> !x.isEmpty())
                .findFirst();

        System.out.println("first non-empty: " + first.get());

//        Find second-highest number in a list
        Optional<Integer> first1 = list.stream()
                .sorted(Comparator.reverseOrder())
                .skip(1)
                .findFirst();

        System.out.println("second-highest :" + first1.get());


    }

}
