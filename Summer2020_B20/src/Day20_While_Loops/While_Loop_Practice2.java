package Day20_While_Loops;
import java.util.Scanner;
public class While_Loop_Practice2 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String password = "Cybertek123";

        System.out.println("enter ur password");
        String input = scan.nextLine();

        while( !input.equals(password) ){// while password is incorrect, it will keep asking to re-enter it
            System.out.println("Please re-enter your password");
            input = scan.nextLine();
        }// it stops only if user provides valid password
        System.out.println("logged in");
    }
}
