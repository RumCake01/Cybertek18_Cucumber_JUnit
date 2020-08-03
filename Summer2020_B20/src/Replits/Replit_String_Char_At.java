package Replits;
import java.util.Scanner;
public class Replit_String_Char_At {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        String txt = s.next();
        //your code here
        char ch1 = (txt.charAt(2));
        char ch2 = (txt.charAt(4));
        char ch3 = (txt.charAt(5));

        /* foabar - this is the word inserted by the user. So the third letter will be
        referencing to the second index starting from zero,
        the 5th letter will will be
        referencing to the forth index, and the letter 6
        will be referencing the fifth index.*/

        System.out.print(ch1);
        System.out.print(ch2);
        System.out.print(ch3);

    }
}

