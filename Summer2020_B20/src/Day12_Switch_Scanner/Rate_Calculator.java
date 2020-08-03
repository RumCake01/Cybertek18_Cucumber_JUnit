package Day12_Switch_Scanner;

import java.util.Scanner;

public class Rate_Calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your salary");

        double salary = input.nextDouble();
        System.out.println("How many hours do you work in a week?");
        int weeklyHours = input.nextInt();
        int totalHours = weeklyHours * 52; // hours * weeks a year.// to get hours you worked in one year or 52 weeks.

        double hourlyRate= salary/totalHours;

        System.out.println("Your hourly rate is: $" +hourlyRate );





    }


}
