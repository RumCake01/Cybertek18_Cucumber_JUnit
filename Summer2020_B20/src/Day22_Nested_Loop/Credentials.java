package Day22_Nested_Loop;
import java.util.Scanner;

public class Credentials {

    public static void main(String[] args) {

        //if user enters invalid username or password, ask user to re-enter it,
        // provided he has 4 chances to re-enter the correct information, after that he will get blocked
        //username: cyber
        //password: tek123

        Scanner scan = new Scanner(System.in);
        System.out.println("enter your user name");
        String username= scan.next();

        System.out.println("enter your password name");
        String password = scan.next();

        // we will use while loop here

        int attempt = 1;

        while( !(username.equals("cyber") && password.equals("tek123"))) { // while the username pass and username are NOT valid,
            // next mess will come out below

            if(attempt >2) {
                System.out.println("your account is locked");
                System.exit(0);
            }
            System.out.println("Invalid user name or password, Please re-enter");
            System.out.println("enter your user name");
            username = scan.next();//

            // ask user name enter the password again

            System.out.println("enter your password again");
            password = scan.next();

            attempt++;
        }
        System.out.println("logged in");


    }
}
