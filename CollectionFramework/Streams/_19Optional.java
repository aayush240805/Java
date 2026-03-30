package CollectionFramework.Streams;

import java.util.NoSuchElementException;
import java.util.Optional;

public class _19Optional {
    public static Optional<String> getName(int id) {
//        return "Ram";
//        return null; // --> throws nullPointer Exception

//        String name = null;
//        return Optional.ofNullable(name);

        return Optional.empty();
    }

    public static void main(String[] args) {
        Optional<String> name = getName(1);

        // Bad Practice
//        if(name != null) {
//            System.out.println(name.toUpperCase());
//        }

//        if (name.isPresent()){
//            System.out.println(name.get());
//        }
//        name.ifPresent(System.out::println);

//        String nameToBeUsed = name.isPresent() ? name.get() : "NA";
//        String nameToBeUsed = name.orElse("NA");
//        String nameToBeUsed = name.orElseGet(() -> "NA");
        String nameToBeUsed = name.orElseThrow(NoSuchElementException::new);
        System.out.println(nameToBeUsed);

    }
}
