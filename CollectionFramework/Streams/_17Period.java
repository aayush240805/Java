package CollectionFramework.Streams;

import java.time.LocalDate;
import java.time.Period;

public class _17Period {
    public static void main(String[] args) {
        // Duration -> used for time between two points of time.
        // Period -> used for time between two dates.

        LocalDate now = LocalDate.now();
        LocalDate then = LocalDate.of(2005, 8, 24);
        Period p1 = Period.between(then, now);
        System.out.println(p1);
    }
}
