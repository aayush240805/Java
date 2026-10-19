package CollectionFramework.StreamsPractice.Intermediate;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class _10MostFrequentCharacterInString {

    public static void main(String[] args) {

        String s = "Banana";

        Map.Entry<Character, Long> output = s.chars()
                .mapToObj(x -> (char) x)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet().stream()
                .max(Map.Entry.comparingByValue())
                .orElseThrow();

        System.out.println("\nMost frequent character in a string: " + output);


    }

}
