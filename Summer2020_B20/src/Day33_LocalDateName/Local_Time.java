package Day33_LocalDateName;

import java.time.LocalDateTime;
import java.time.LocalTime;

public class Local_Time {

    public static void main(String[] args) {

// time gets collected from my computer

       LocalTime t1 =  LocalTime.of(15, 61, 5);
       //nanoOfSeconds is not used anywhere in my job
        System.out.println(t1);

        // when we create a report we need to give the exact current time
        // from the localTime we need to call now method .. below


        LocalTime t2 = LocalTime.now();
        System.out.println(t2);


        LocalDateTime t3 = LocalDateTime.of(2020, 7, 25, 15, 25);
        System.out.println(t3);
        LocalDateTime t4 = LocalDateTime.now();
        System.out.println(t4);

    }
}
