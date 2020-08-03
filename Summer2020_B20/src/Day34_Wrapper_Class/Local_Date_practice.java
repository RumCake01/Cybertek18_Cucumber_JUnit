package Day34_Wrapper_Class;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Local_Date_practice {
    public static void main(String[] args) {

        // use localDate & time to get the current date and time in the following format:

        // Sun, 10:32 AM, Jul/26/2020

        // we will use it only during our reports in the future.

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("EEE, hh:mm a, MMM/dd/yyyy");

        LocalDateTime today = LocalDateTime.now(); // returns us local date time

        System.out.println(today); // print in numeric format only, default format  ==> 2020-07-26T10:32:39.138975

        System.out.println(today.format(dtf) ); // the patter after it was formatted, the outcome is Sun, 10:32 AM, Jul/26/2020


    }
}
