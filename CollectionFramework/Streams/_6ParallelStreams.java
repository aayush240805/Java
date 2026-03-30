package CollectionFramework.Streams;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Stream;

public class _6ParallelStreams {
    public static long factorial(int n) {
        long result = 1;
        for (int i = 1; i < n; i++){
            result *= i;
        }
        return result;
    }

    public static void main(String[] args) {
        // A type of stream that enables parallel processing of elements
        // Allowing multiple threads to process parts of the stream simultaneously
        // This can significantly improve performance for large data sets
        // workload is distributed across multiple threads

//        long startTime = System.currentTimeMillis();
//        List<Integer> list = Stream.iterate(1, x -> x + 1).limit(20000).toList();
//        List<Long> factorialsList = list.stream().map(x -> factorial(x)).toList();
//        long endTime = System.currentTimeMillis();
//
//        System.out.println("Time taken with sequential stream : " + (endTime - startTime) + "ms"); // Takes around 175ms



        // Parallel Streams are most effective for CPU-Intensive or large datasets where tasks are independent.
        // They may add overhead for simple tasks or small datasets.
        long startTime = System.currentTimeMillis();
        List<Integer> list = Stream.iterate(1, x -> x + 1).limit(20000).toList();
        List<Long> factorialsList = list.parallelStream().map(x -> factorial(x)).toList();
        long endTime = System.currentTimeMillis();

        System.out.println("Time taken with parallel stream : " + (endTime - startTime) + "ms"); // Takes around 70ms

        // Example for why parallelStream() shouldn't use for dependent tasks.

        //Cumulative Sum
        List<Integer> list1 = Arrays.asList(1, 2, 3, 4, 5);
        AtomicInteger sum = new AtomicInteger(0);
//        List<Integer> list2 = list1.parallelStream().map(x -> sum.addAndGet(x)).toList();
        List<Integer> list2 = list1.parallelStream().map(x -> sum.addAndGet(x)).toList();
//        List<Integer> list2 = list1.parallelStream().map(x -> sum.addAndGet(x)).sequential().toList();

        System.out.println("Expected Output : [1, 3, 6, 10, 15]");
        System.out.println("Actual Output(wrong) : " + list2);
    }
}
