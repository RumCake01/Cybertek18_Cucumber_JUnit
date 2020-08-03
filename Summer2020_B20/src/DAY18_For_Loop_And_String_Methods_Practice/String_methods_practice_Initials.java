package DAY18_For_Loop_And_String_Methods_Practice;
import java.util.Scanner;
public class String_methods_practice_Initials {
    public static void main(String[] args) {

        // get the first letter of eahc words below:
        Scanner scan = new Scanner(System.in);
       String firsName = scan.next();
       String lastName = scan.next();

        String initial = firsName.substring(0,1) + lastName.substring(0,1);
        initial = initial.toUpperCase();
        // if user entered in lower case , we can do the following:
        // declare a separate String initial and provide this firsName.substring(0,1) + lastName.substring(0,1))
        //then initial.initial.toUpperCase();
        System.out.println(initial);
        System.out.println("===============================================");

        // do the same thing using charAt method.

        char s1 = firsName.charAt(0);
        char s2 = lastName.charAt(0);

        String s3 = ("" + s1 + s2).toUpperCase(); // to print initials in upper case
        // we can also create a separate string initial2.intiials2.toUpperCase();

        System.out.println(s3); // to return it as a string, assign to an empty string













    }
}

