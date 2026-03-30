package CollectionFramework.Streams;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class _13LocalDateTime {
    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();
        System.out.println(now);
        LocalDateTime custom = LocalDateTime.parse("2005-08-24T11:08:33");
        System.out.println(custom);
    }
}
