package Day19_For_Loop;
import java.util.Scanner;
public class for_Loop_reverse_any_word {
    public static void main(String[] args) {

        // write a program that can reverse any string

        Scanner scan  = new Scanner(System.in);
        System.out.println("enter a word");
        String word = scan.next();

        String reverseString = "";
            for (int i = word.length() - 1; i >= 0; i--) {
                // starting from last character (word.length-1 (because the index starts w zero, thats we do -1)) it will get each character till index 0.

                // we can also declare the above loop another way below:
                // for (int i =4; i >= 0; i--) { // number of characters/letter in the word is 4.
                reverseString += word.charAt(i);
            }
        System.out.println(reverseString);

        System.out.println();
        System.out.println("=======================================");

            // we can also declare it this way, longer way, if we know the length of the string

        String str = "Cyber";
                //    01234
        String result = "" + str.charAt(str.length()-1) + str.charAt(3) + str.charAt(2) + str.charAt(1) + str.charAt(0);

        System.out.println(result);

        System.out.println("=======================================");










    }
}
