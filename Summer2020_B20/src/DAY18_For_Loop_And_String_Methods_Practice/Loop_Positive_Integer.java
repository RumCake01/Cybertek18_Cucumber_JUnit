package DAY18_For_Loop_And_String_Methods_Practice;
import java.util.Scanner;

public class Loop_Positive_Integer {
    public static void main(String[] args) {

         /*Write a program that the user to declare a positive integer.
        It should then print the multiplication table of that number.*/


        Scanner scan = new Scanner(System.in);

        System.out.println("enter a positive integer below: ");

        int positiveInteger;
        int a = 0;

        for (positiveInteger = scan.nextInt(); positiveInteger * ++a <= positiveInteger*10;) {
        System.out.println(positiveInteger*a);


        }
    }
}


















