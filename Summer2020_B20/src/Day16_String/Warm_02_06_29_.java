package Day16_String;
import java.util.Scanner;
public class Warm_02_06_29_ {
    public static void main(String[] args) {
        /*
        Ask user to enter a word. Print true is the first and last characters of the string are same characters, print false otherwise.
            Input:
                abba
            Output:
                true
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("enter a word");
        String word = scan.next();

        char firstChar =  word.charAt(0);// to get the first character
        char lastChar = word.charAt(word.length()-1);// to fist get the entri length and then substract one from it
        System.out.println(firstChar == lastChar);// will return true or false;
        // if equal will print true, otherwise will be false.

        // we can also use If statement here:

        /*f(firstChar == lastChar) {
            System.out.println(true);
        }else{
            System.out.println(false);
        }*/

    }
}
