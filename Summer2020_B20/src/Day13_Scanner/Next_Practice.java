package Day13_Scanner;

import java.util.Scanner;

public class Next_Practice {
    public static void main(String[] args) {
        // ask user to enter users first and last name using next scanner

        Scanner scan = new Scanner(System.in); // declare ur class\

        System.out.println("Please enter your first name: ");
        String firstName = scan.next(); // user will be able to enter their first name only, one word

        scan.next();
        System.out.println("Please enter your last name: ");
        String lastName = scan.next();// allows user to enter only one word, only last name


        String fullName = firstName + " " + lastName;
        System.out.println("Full name is: " + fullName);
    }
}
