package Warm_Up_Tasks;
import java.util.Scanner;
public class Warm_up_0628_NoFirst_Char_Rest_Printed {

    public static void main(String[] args) {

        /*warmup tasks:
        1. Ask user to enter two words. Print first word without its first character then print the second word without its first character.
        Input:
        apple
                banana
        Output:
        ppleanana*/

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter two words");
        String word1 = scan.next();
        String word2 = scan.next();

        String word1No1 = word1.substring(1);
        String word2No1 = word2.substring(1);

        System.out.println(word1No1 + word2No1);





    /*Ask user to enter a word. Print true is the first and last characters of the string are same characters, print false otherwise.
            Input:
                abba
            Output:
                true
         */








    }
}
