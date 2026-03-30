package CollectionFramework.Streams;

import java.time.LocalDate;

public class _11LocalDate {
    public static void main(String[] args) {
//        LocalDate
        LocalDate today = LocalDate.now();
        LocalDate customDate = LocalDate.of(2025, 2, 13);


        System.out.println(today.getDayOfYear());
        System.out.println(today.getYear());

        System.out.println(today.getMonth());
        System.out.println(today.getDayOfMonth());
        System.out.println(today.getMonthValue());

        System.out.println(today.getDayOfWeek());


        LocalDate yesterday = today.minusDays(1);
        System.out.println("yesterday = " + yesterday);

        LocalDate pastDate = today.minusMonths(50);
        System.out.println("pastDate = " + pastDate);


        if(today.isAfter(yesterday)) {
            System.out.println("Yes");
        }
        else {
            System.out.println("No");
        }

        if (today.isLeapYear()){
            System.out.println("Yes");
        }
        else {
            System.out.println("No");
        }
    }
}
