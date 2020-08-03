package Day14_Recap;
import java.util.Scanner;
public class Next_Line_VS_Other_Scanner_Methods {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("enter your age");
        int age = input.nextInt();

        String str = input.nextLine();

        System.out.println("Enter your full name");
        String fullName = input.nextLine();

    }
}
