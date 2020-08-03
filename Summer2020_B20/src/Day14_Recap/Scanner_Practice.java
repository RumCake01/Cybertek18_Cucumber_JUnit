package Day14_Recap;
import java.util.Scanner;
public class Scanner_Practice {
    public static void main(String[] args) {
        /*
        task with 5 inputs:
        1. gender(next())
        2. age (nextInt)
        3. country name
        4. zipcode(nextInt)
        5. full name (NextLine)
        6. full company name
         */

        Scanner input = new Scanner(System.in);
        System.out.println("enter your gender");
        String gender = input.next();

        System.out.println("enter your age");
        int age = input.nextInt();

        input.nextLine(); // we call this method so it can take out the ENTER keys from the two previous inputs by user

        System.out.println("enter your country name");
        String countryName = input.nextLine();

        System.out.println("Enter your zipcode");
        int zipcode = input.nextInt();

        input.nextLine();// using this one againg to get read of the ENTER key after the nextInt method.

        System.out.println("enter your full name");
        String fullName = input.nextLine();

        System.out.println("enter your company name");
        String companyName = input.nextLine();

    }
}
