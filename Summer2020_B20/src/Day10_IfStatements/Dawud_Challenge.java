package Day10_IfStatements;
import java.util.Scanner;
public class Dawud_Challenge {
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        System.out.println("Please type a year to see if it's leap year");
        int year = sn.nextInt();
        if (year > 0 && year < 20000) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    System.out.println(true);
                } else {
                    System.out.println(false);
                }
            } else if (year % 4 == 0) {
                System.out.println(true);
            } else {
                System.out.println(false);
            }
        } else {
            System.out.println("invalid");
        }
    }
}