package DAY15_String_All_Methods;
import java.util.Scanner;
public class Concat_Method {
    public static void main(String[] args) {



        String schoolName = "Cybertek";

        schoolName = schoolName.concat(" School");// this will return Cybertek School.

        System.out.println(schoolName);
        System.out.println("==========================");

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your first name");
        String firstName = scan.next();

        System.out.println("enter you last name");
        String lastName = scan.next();

        String fullName = firstName.concat(" ".concat(lastName));
        System.out.println("Your full name is ".concat(fullName));// we can also use a Plus operator.
        //in the future I will be using + operator a lot.

        System.out.println("==========================");




    }
}
