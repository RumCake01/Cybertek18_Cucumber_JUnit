package Day33_LocalDateName;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
public class Time_Formatting {


    public static void main(String[] args) {

        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern(" E, MM/dd/yyyy");
        // E stands for the name of the week daya, and EEEE will print out the entire sat word.
        LocalDate ld = LocalDate.of(2020, 7, 25);

        System.out.println(ld);
        System.out.println(ld.format(dateTimeFormatter));



        DateTimeFormatter timeFormat = DateTimeFormatter.ofPattern("hh:mm:ss a");

        // we want to apply this above time formatter to our local time below

        LocalTime now = LocalTime.now();
        System.out.println(now);
        System.out.println(now.format(timeFormat));



    }
}
