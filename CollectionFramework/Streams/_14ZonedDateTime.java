package CollectionFramework.Streams;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Set;

public class _14ZonedDateTime {
    public static void main(String[] args) {
        ZonedDateTime indiaTime = ZonedDateTime.now();
        System.out.println(indiaTime);

        ZonedDateTime japanTime = ZonedDateTime.now(ZoneId.of("Japan"));
        System.out.println(japanTime);

        Set<String> availableZoneIds = ZoneId.getAvailableZoneIds();
//        availableZoneIds.forEach(System.out::println);
        long count = availableZoneIds.stream().count();
//        System.out.println(count);
    }
}
