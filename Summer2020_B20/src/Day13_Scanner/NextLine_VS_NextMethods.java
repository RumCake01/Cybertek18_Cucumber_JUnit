package Day13_Scanner;

import java.util.Scanner;

public class NextLine_VS_NextMethods {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("enter you salary: ");
        double salary = scan.nextDouble();

        scan.nextLine();// we use this to take out the Enters that are left in the scanner, so that we can use the next line
        // by entering this method we can avoid the bug due to 2 scanner methods together:
        // the method scan.nextDouble & the method  scan.nextLine


        System.out.println("enter your full name: ");
        String fullName= scan.nextLine();

        System.out.println("Salary: " + salary);
        System.out.println("Full name: " + fullName);
    }
}
