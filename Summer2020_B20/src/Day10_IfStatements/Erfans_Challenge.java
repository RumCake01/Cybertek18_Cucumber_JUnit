package Day10_IfStatements;
import jdk.swing.interop.SwingInterOpUtils;
import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;
public class Erfans_Challenge {
    public static void main(String[] args) {

    /*
    Use if statement with all the kinds you know to write a program about leap year.

When user enter a year from 1 to 9999, and if it is a leap year, your output should be “true”.  if not, then out put should be “false”.
 If someone enter negative or over 9999 as a year, the output should be “invalid”.
The biggest challenge is you have to find out what are the steps to identify the leap year. Lol.
Sorry, I know @Adam Rochwick would give more details....
I am sure you can do it and give it a shot.

Example: 2020 is a leap year, so it is “true”
1924 is a leap year, so it is “true”
2019 is not a leap year so it is “false”
-1 is “invalid”
     */
        Scanner sc = new Scanner(System.in);
        int year = 1996;
        System.out.println(" \nTo continue press ENTER");
        String nextStep = sc.nextLine();
        System.out.println("Enter a year: ");
        year = sc.nextInt();

        String outcome = "";
        if (year % 4 == 0) {
            outcome = year + " True. This is a leap year.";
            if (year % 400 == 0) {
                outcome = year + " True. This is a leap year.";
                } else {
                outcome = year + " False. This is not a leap year.";
            }
        } else if (year % 100 == 0){
                outcome = year + " false";
                }else{
                {
                outcome = year + " This is invalid entry ";
                 }
            System.out.println(outcome);
        }
    }
}

/*
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
 */


/*
System.out.println("" +
                "       NEW DATING APP");
        System.out.print("to continue pls press ENTER");
        String nextStep=scanner.nextLine();
        System.out.print("Lets start with your  age(years): ");
        int age=scanner.nextInt();
        System.out.print("What about hight(inches): ");
        int hight=scanner.nextInt();
        System.out.print("What about your weight(lb): ");
        int weight=scanner.nextInt();
        System.out.print("Gender preference (pls type 1 for male, 2 for female and 3 for else): ");
        int gender=scanner.nextInt();
        System.out.print("Are you smoking?( pls type 1 for yes and 2 for no) ");
        int smokig=scanner.nextInt();
​
        System.out.println("SYSTEM MACH PROCCESING...");
        System.out.println("LOOKS LIKE U GOT INCOMING MESSAGE.\n \n");

 */