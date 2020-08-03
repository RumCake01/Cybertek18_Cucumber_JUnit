package Replits;
import java.util.Scanner;
public class Repl_069_Print_half_Twice {
    public static void main(String[] args) {
        /*
        Write a program that will print out first half of the word twice.
Example:
input: java
output: jaja
         */

        /*
        1. We need to find a middle index of the word, middleIndex = word.lenth()/2
        2. Assign it to the result
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("please enter a word");
        String word = scan.next();

        int middleIndex = 0;

        String firstHalf ="";
        String result = "";

        middleIndex = word.length()/2; /// we are getting the mddle index here
        firstHalf = word.substring(0, middleIndex); // we are getting the first half of the
        // word,starting from 0 to the middIndex.

        result = firstHalf + firstHalf; // we concat first half of the word twice.

        System.out.println(result);










    }
}

