package CollectionFramework.Streams;

import org.w3c.dom.ls.LSOutput;

import java.time.LocalDate;
import java.time.LocalTime;

public class _12LocalTime {
    public static void main(String[] args) {
        LocalTime now = LocalTime.now();
        LocalTime customTime = LocalTime.of(2, 50, 43);
        LocalTime parseTime = LocalTime.parse("13:20:23");
        LocalTime beforeOneHour = now.minusHours(1);

        System.out.println(now);
        System.out.println(customTime);
        System.out.println(parseTime);
        System.out.println(beforeOneHour);

        if (beforeOneHour.isBefore(now)){
            System.out.println("Yes");
        }
        else {
            System.out.println("No");
        }

    }
}
