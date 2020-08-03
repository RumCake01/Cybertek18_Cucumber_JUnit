package DAY15_String_All_Methods;
import java.util.Scanner;

public class String_Practice1 {

    public static void main(String[] args) {
        //write a program that ask the user enter first name and then last name.
        //print the initials of the person.

        Scanner input = new Scanner(System.in);
        System.out.println("Enter your first name");
        String firstName = input.next();
        char ch1 = firstName.charAt(0);// allows to retreat character one by one

        System.out.println("enter you last name");
        String lastName = input.next();
        char ch2 = lastName.charAt(0);// allows to retreat character one by one

        System.out.println("Your initial is " + ch1+"." + ch2 + ".");














    }
}
