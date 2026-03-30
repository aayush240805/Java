package CollectionFramework.Streams;

import java.time.LocalDate;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class _18DateTimeFormatter {
    public static void main(String[] args) {
        // Throws Exception
//        String date = "30/02/2004";
//        LocalDate parse = LocalDate.parse(date);
//        System.out.println(parse);

//        String date = "12/02/2004";
//        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
//        LocalDate parse = LocalDate.parse(date, dateTimeFormatter);
//        System.out.println(parse);

        String date1 = "2007-07-17 01:43:32+05:30";
        DateTimeFormatter dateTimeFormatter1 = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ssXXX");
        ZonedDateTime parse1 = ZonedDateTime.parse(date1, dateTimeFormatter1);
        System.out.println(parse1);
    }
}
