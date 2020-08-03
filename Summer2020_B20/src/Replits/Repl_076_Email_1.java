package Replits;
import java.util.Scanner;
public class Repl_076_Email_1 {

    public static void main(String[] args) {
        /*
        In this task, you need to swap first name with last name in the email. If email doesn't contains underscore - do not anything.

Example:
input: mike_tyson@gmail.com
output: tyson_mike@gmail.com

Example:
input: barakobama@gmail.com
output: barakobama@gmail.com
         */


                Scanner scan = new Scanner(System.in);
                String email = scan.next();

                if(email.contains("_")) {
                    int underscore = email.indexOf("_");
                    int at = email.indexOf("@");

                    String firstName = email.substring(0, underscore);
                    String lastName = email.substring(underscore + 1, at);
                    System.out.println(lastName +  "_" + firstName + "@gmail.com");
                }else{
                    System.out.println(email);
                }

            }
}
