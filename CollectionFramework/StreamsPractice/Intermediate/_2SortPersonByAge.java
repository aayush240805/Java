package CollectionFramework.StreamsPractice.Intermediate;

import java.util.Arrays;
import java.util.List;

public class _2SortPersonByAge {

    public static void main(String[] args) {

        List<Person> persons = Arrays.asList(
                new Person("Alice", 25),
                new Person("Bob", 30),
                new Person("Charlie", 28),
                new Person("David", 35)
        );

//        Double avg = persons.stream()
//                .collect(Collectors.averagingInt(Person::getAge));

        double avg = persons.stream()
                .mapToInt(Person::getAge)
                .average()
                .orElse(0.0);

        System.out.println("Average age: " + avg);

    }

}
