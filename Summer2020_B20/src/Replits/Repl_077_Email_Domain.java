package Replits;
import java.util.Scanner;
public class Repl_077_Email_Domain {
    public static void main(String[] args) {
        /*
        Write a program that will print out information about user based on email. Print first and last name from the upper case.
Example:
Input: craig_federighi@apple.com
Output:
First name: Craig
Last name: Federighi
Domain: apple
Top-Level Domain: com
         */
                Scanner scan = new Scanner(System.in);
                String email = scan.next();

                int underscore = email.indexOf("_");
                int at = email.indexOf("@");
                int dot = email.indexOf(".");

                String firstName = email.substring(0, 1).toUpperCase() + email.substring(1, underscore);
                String lastName  = email.substring(underscore+1, underscore+2).toUpperCase() + email.substring(underscore+2, at);
                String domain = email.substring(at+1, dot);
                String topLevel = email.substring(dot+1);

                System.out.println("First Name: " + firstName + "\nLast Name: " + lastName + "\nDomain: " + domain+
                        "\nTop-Level Domain: "  + topLevel);

            }
}
