package Day16_String;
import java.util.Scanner;
public class All_Methods_Practice_06_29 {
    public static void main(String[] args) {
        /*
        write a program that can check if the two string are equal or not.
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("enter first word");
        String word1 = scan.next();

        System.out.println("enter second word");
        String word2 = scan.next();

        // compare visible part of the words entered
        /*
        if(word1.equals(word2)){
            System.out.println("theyre are equal");
        }else{
            System.out.println("not equal");
        }*/


        // use ternary
        String result = (word1.equalsIgnoreCase(word2))? "Equal"  : "Not equal";

        System.out.println(result);

    }

}
