package DAY15_String_All_Methods;

import java.util.Scanner;
public class Legnth_Practicw {

    public static void main(String[] args) {
        //write a program that asks user to enter sentence.
        //then print out the first and last characters

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a sentence");
        String sentence = scan.nextLine();

        System.out.println(sentence.charAt(0));
        System.out.println(sentence.charAt(sentence.length()-1));

        // we could also do it this way:
        //int lastIndexNum = sentence.length()-1;
        //sout(sentence,charAt(lastIndexNum))
        //System.out.println(""sentence.charAt(0) + sentence.charAt(lasIndexNum));














    }


}
