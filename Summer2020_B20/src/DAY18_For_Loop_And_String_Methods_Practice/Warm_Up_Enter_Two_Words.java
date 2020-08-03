package DAY18_For_Loop_And_String_Methods_Practice;
import java.util.Scanner;
public class Warm_Up_Enter_Two_Words {
    public static void main(String[] args) {
        /*
        Ask user to enter two words. Then add them together and print. But if the last letter if
the first word and the first letter of the last letter is the same, print that character once.
                    Input:
                        one
                        eight
                    Output:
                        oneight
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("enter a word");
        String word1 = scan.next();
        System.out.println("enter a second word");
        String word2 = scan.next();


        if(word1.charAt(word1.length()-1) == word2.charAt(0)) {
            System.out.println(word1.concat(word2.substring(1)));
        }else{
            System.out.println(word1 + " " + word2);
        }


    }
}
