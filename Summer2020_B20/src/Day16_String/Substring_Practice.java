package Day16_String;
import java.util.Scanner;
public class Substring_Practice {

    public static void main(String[] args) {
        /*warmup tasks:
        1. Ask user to enter two words. Print first word without its first character then print the second word without its first character.
        Input:
        apple
                banana
        Output:
        ppleanana*/
// better to use substring with one index only.

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your first word");
        String str1 = scan.next();// we create a string because we want to reuse it to create a substring

        System.out.println("Enter your second word");// we create a string because we want to reuse it to create a substring
        String str2 = scan.next();

        //substring should be created starting from index1 and then concat them.

        String result = str1.substring(1).concat(str2.substring(1));//using concat method directly.

        // we can also concat this way:
        //String result = str1.substring(1) + str2.substring(1);

        System.out.println(result);

        // extra task:

        String str = "I like to drink Pepsi";
        String drink = str.substring(16);// to get only the last word of the sentence above
        System.out.println(drink);// result is pepsi

        String action = str.substring(10, 15); // to get the word drink from the sentence
        System.out.println(action);//result is drink






    }
}
