package DAY15_String_All_Methods;
import java.util.Scanner;
public class Practice_01 {
    public static void main(String[] args) {
        /*
        write a program to ask user to enter first and last names
        then print the full name in all upper case

         */

        Scanner input = new Scanner(System.in);
        System.out.println("enter you first name: ");
        String firstName = input.next().toUpperCase();//automatically converted to upper case

        System.out.println("enter your last name: ");
        String lastName = input.next().toUpperCase();//automatically converted to upper case

        String fullName = firstName+""+lastName;

        fullName = fullName.toUpperCase();

        System.out.println(fullName);

    }
}
