package CollectionFramework.StreamsPractice.Intermediate;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class _11FirstNonRepeatingCharacterInString {

    public static void main(String[] args) {

        String s = "Bananab";

        Optional<Character> first = s.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(
                                Function.identity(),
                                LinkedHashMap::new, // To maintain original insertion order
                                Collectors.counting()
                ))
                .entrySet().stream()
                .filter(e -> e.getValue() == 1)
                .map(e -> e.getKey())
                .findFirst();

        System.out.println("First non-repeating character in a string: " + first.get());

    }

}
