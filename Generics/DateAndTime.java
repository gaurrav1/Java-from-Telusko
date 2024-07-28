import java.time.LocalDate;
import java.time.LocalTime;
import java.time.temporal.TemporalAdjusters;

public class DateAndTime {
    public static void main(String[] args) {

        java.util.Date date = new java.util.Date();
        System.out.println(date);

        long time = date.getTime();
        System.out.println(time);

        java.sql.Date date1 = new java.sql.Date(time);
        System.out.println(date1);
        // Use javap java.sql.Date in terminal to see the methods available in java.sql.Date

        LocalDate date2 = LocalDate.now();
        System.out.println(date2);
        System.out.println(date2.getDayOfMonth());
        System.out.println(date2.with(TemporalAdjusters.firstDayOfMonth()));
        // Use javap java.time.LocalDate in terminal to see the methods available in java.time.LocalDate

        LocalTime time2 = LocalTime.now();
        System.out.println(time2);

    }
}
