package Replits;
import java.util.Scanner;
public class Seconds_Converter_Scanner {

        public static void main(String[] args) {
            /*
            Write a program that outputs the number of hours, minutes, and seconds that
corresponds to input total seconds.

-create a Scanner object
- declare int variables inputSeconds, hours, minutes, seconds
-Ask user enter seconds by printing:
"Enter seconds:"

-Using %(remainder) and / operators, find out how many whole hours, minutes and seconds are in inputSeconds.
-Assign values to the hours, minutes, seconds variables
-Display the result.
             */

            Scanner scan = new Scanner(System.in);
            System.out.println("Enter seconds:");

            int inputSeconds = scan.nextInt();

            int hours = inputSeconds / 3600;
            int minutes = (inputSeconds / 60) % 60;
            int seconds = inputSeconds % 60;

            System.out.println(hours + " hours, " + minutes + " minutes, and " + seconds +" seconds");

        }
    }

