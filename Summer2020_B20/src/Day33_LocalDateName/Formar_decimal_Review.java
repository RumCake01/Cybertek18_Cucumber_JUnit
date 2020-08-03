package Day33_LocalDateName;
import jdk.swing.interop.SwingInterOpUtils;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class Formar_decimal_Review {

    // declare birthday
    public static void main(String[] args) {


        LocalDate DOB = LocalDate.of(1990, 9, 7);
        System.out.println(DOB);
        LocalDate DOB1 = LocalDate.of(1956, 11, 28);
        System.out.println(DOB1);
        LocalDate today = LocalDate.now();
        System.out.println(today);

        // find out if its a leap year

        System.out.println("======================");
        LocalDate y = LocalDate.of(1956, 7, 30);
        boolean leapYear = y.isLeapYear();
        System.out.println(leapYear);
        System.out.println("======================");

        Scanner scan = new Scanner(System.in);
        //System.out.println("enter ur birth year, month, and date");

        //LocalDate urDates = LocalDate.of(scan.nextInt(), scan.nextInt(), scan.nextInt());
        // System.out.println(urDates);


        // declare time now

        LocalTime t1 = LocalTime.of(22, 54, 59);
        System.out.println(t1);

        // get local current time from mac

        LocalTime t2 = LocalTime.now();
        System.out.println(t2);


        String[] students = {"M", "L", "K", "Y"};
        LocalDate [] theirDOB = {
                LocalDate.of(1956, 12, 13),
                LocalDate.of(1987, 10, 14),
                LocalDate.of(1967, 3, 22),
                LocalDate.of(1980, 9, 27) };

        for (int i = 0; i<=theirDOB.length-1; i++){
            System.out.println(students [i] + ": " + theirDOB[i]);
        }

        System.out.println("========");
        // Local Date Formatter:

        /*
        year: yy, yyyy
        months: MM(number), MMM(three lettters), MMMM
        days: dd
         */
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("MM/dd/YYYY");
        LocalDate t01 = LocalDate.now();

        System.out.println(t01);
        System.out.println( t01.format(dateTimeFormatter));
        System.out.println("=========================");
        DateTimeFormatter d1 = DateTimeFormatter.ofPattern("MM/dd/YY");
        LocalDate td = LocalDate.of(2020, 8, 1);
        System.out.println(d1.format(td));
        System.out.println(d1.format(td));

        // local time formatter

        LocalTime time01= LocalTime.of(1, 22, 28);
    }
}
