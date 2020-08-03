package Day33_LocalDateName;
import java.util.Scanner;
import java.time.LocalDate;

public class Dates {
    public static void main(String[] args) {

        LocalDate DOB = LocalDate.of(2020, 7, 24);
        //year-month-days

        System.out.println(DOB);

        LocalDate today =LocalDate.now();
        System.out.println(today);

        // find out if its a leap year

        LocalDate y = LocalDate.of(2020, 1, 1);
        boolean result = y.isLeapYear();
        System.out.println(result);

        // ask user to enter a year and verify if its a leap year

        Scanner scan = new Scanner(System.in);
        System.out.println("enter a year");
        int year = scan.nextInt();

        boolean result2 = LocalDate.of(year, 1 , 1).isLeapYear();

        System.out.println(result2);
        System.out.println("===========================");
        System.out.println("enter birth year, birth month, birth day");


        LocalDate d = LocalDate.of(scan.nextInt(), scan.nextInt(), scan.nextInt() ) ;
        System.out.println(d.isLeapYear());
    }
}
