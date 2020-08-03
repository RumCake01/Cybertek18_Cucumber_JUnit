package Day12_Switch_Scanner;

import java.util.Scanner;

public class Replit_028 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int day = scanner.nextInt();

        String result = "";

        if (day == 1) {
            result = "It's a Monday!";
        } else if (day == 2) {
            result = "It's a Tuesday";
        } else if (day == 3) {
            result = "It's a Wednesday";
        } else if (day == 4) {
            result = "It's a Thursday";
        } else if (day == 5) {
            result = "It's a Friday";
        } else if (day == 6) {
            result = "It's a Saturday";
        } else if (day == 7) {
            result = "It's a Sunday";
        } else {
            result = "There is no such a day!";
        }
        System.out.println(result);











    }
}

