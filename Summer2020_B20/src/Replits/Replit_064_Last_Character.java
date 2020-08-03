package Replits;
import java.util.Scanner;
public class Replit_064_Last_Character {

    public static void main(String[] args) {

        //DO NOT CHANGE
        Scanner scan = new Scanner(System.in);
        String word = scan.next();
        //WRITE YOUR CODE HERE

        int wordLength = word.length();
        char lastCharacter = word.charAt(wordLength - 1);
        System.out.println(lastCharacter);


    }
}
