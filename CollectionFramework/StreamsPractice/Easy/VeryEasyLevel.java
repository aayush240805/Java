package CollectionFramework.StreamsPractice.Easy;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class VeryEasyLevel {

    public static void main(String[] args) {

        //        List<Integer> list = Stream
        //                .iterate(1, x -> x + 1).limit(20)
        //                .toList();

        List<Integer> list = Arrays.asList(8, 4, 17, 7, 9, 14, 2, 20);

//        Even Numbers
        List<Integer> collect = list.stream()
                .filter(x -> x % 2 == 0)
                .collect(Collectors.toList());

        System.out.println("Even Numbers: " + collect);

//        Square
        List<Integer> collect1 = list.stream()
                .map(x -> x * x)
                .collect(Collectors.toList());

        System.out.println("Square: " + collect1);

//        Square Even Numbers
        List<Integer> collect2 = list.stream()
                .filter(x -> x % 2 == 0)
                .map(x -> x * x)
                .collect(Collectors.toList());

        System.out.println("Square of Even Numbers: " + collect2);

//        Find first element greater than 10
        Optional<Integer> first = list.stream()
                .filter(x -> x > 10) // 17 14 20
                .sorted() // 14 17 20
                .findFirst(); // 14

        System.out.println("First element greater than 10: " + first.get());

//        Count numbers greater than 5
        long count = list.stream()
                .filter(x -> x > 5)
                .count();

        System.out.println("Number of elements greater than 5: " + count);

//        Sum of all list elements
        Optional<Integer> reduce = list.stream()
                .reduce(Integer::sum);

        System.out.println("Sum: " + reduce.get());

//        Product of all list elements
        Optional<Integer> reduce1 = list.stream()
                .reduce((x, y) -> x * y);

        System.out.println("Product: " + reduce1.get());

//        Find the greatest element in a list
        Optional<Integer> reduce2 = list.stream()
                .reduce(Integer::max);

        System.out.println("Max: " + reduce2.get());

//        Find Sum of even numbers in a list
        Optional<Integer> reduce3 = list.stream()
                .filter(x -> x % 2 == 0)
                .reduce(Integer::sum);

        System.out.println("Sum of even numbers in a list: " + reduce3.get());

//         Sum of squares of even numbers in a list
        Optional<Integer> reduce4 = list.stream()
                .filter(x -> x % 2 == 0)
                .map(x -> x * x)
                .reduce(Integer::sum);

        System.out.println("Sum of squares of even numbers: " + reduce4.get());

    }

}
