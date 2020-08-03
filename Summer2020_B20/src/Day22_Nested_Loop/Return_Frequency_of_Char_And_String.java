package Day22_Nested_Loop;
import java.util.Scanner;
public class Return_Frequency_of_Char_And_String {
    public static void main(String[] args) {

            Scanner scan = new Scanner(System.in);
            //Write a program that can asks user to enter one string and one char and then returns the frequency of str2 in str1
            //Ex
            //Input: AABAAC
            //        A
            //Output: 4
            //Input: ABCC
            //        C
            //Output: 2
            System.out.println("Enter in a string please!");
            String user = scan.nextLine();
            char ch = user.charAt(0);
            char ch1 = user.charAt(user.length() - 1);
            if (ch >= 'A' && ch <= 'Z' && ch1 >= 'a' && ch1 <= 'z') {
                System.out.println("True");
            } else {
                System.out.println("False");
            }
        }

    }
