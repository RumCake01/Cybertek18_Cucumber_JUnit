package Replits;
import java.util.Scanner;
public class Replit_064_Middle_One {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word = scan.next();

        int lengthOfWord = word.length();//return the length of the user input word
        int startIndex = 0;
        int midIndex = 0; // variable for the middle index when word length is odd
        int endIndex = 0; // variable for the ending index when word length is even
        String result = "";

        if (lengthOfWord >= 2) { // if word length is grater or equal to 2
            if (lengthOfWord % 2 == 0) { //if length is even return the middle two characters
                if (lengthOfWord ==2) {  // if its equal to 2
                    result = word + word;
            } else { // if length is greater than 2
                startIndex = (lengthOfWord / 2) - 1;  // get the first index of the middle two character
                endIndex = lengthOfWord / 2; //get the second index of the middle two character
                result = word.substring(startIndex, endIndex + 1);
            }
        } else { // if length is odd return the middle character
            midIndex = lengthOfWord / 2;
            result = word.charAt(midIndex) + "";// this is to change char to string
        }

        }else{ //if word lenth is less than 2
            result = word + word + word; //repit the word three times
        }

        System.out.println(result); //print result
    }
}