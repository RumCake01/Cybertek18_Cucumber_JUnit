package Day25_Practices_Arrays_Loops_String;

import java.util.Scanner;

public class Frequency_of_Characters_String {
    public static void main(String[] args) {


    /*
    find frequency of characters of the string - AAABBBBCCCC - result A3 B3 C4 - how many times each character is listed
     */

        // first approach, we can remove the duplicates
        // and then find the frequency, and then combine the first character+ its frequency and etc.


        Scanner scan = new Scanner(System.in);
        System.out.println("enter a word: ");
        String word = scan.next();

        String result = "";
        String character = "";

        String nonDup = "";

        int i = 0;

        while (i <= word.length() - 1) {
            character = "" + word.charAt(i);
            i++;

            if (!result.contains(character)) {
                result += character;
            }
        }
        System.out.println(result);


        System.out.println("===================");


        // the same thing using FOR LOOP

        String result2 = "";
        for (int a = 0; a <= word.length() - 1; a++) {
            character = "" + word.charAt(a);


            if (nonDup.contains(character)) { // if the character is contained in the string,
                continue; // skip and move to the next one
            } else { // otherwise, assign to a string a result
                nonDup += character;
            }
        }
        System.out.println(result2);
        // find how many times each char apperared in the string

        char ch1 = nonDup.charAt(0);
        int count = 0;

        for (int c = 0; c <= word.length() - 1; c++) { // counting the frequency of the char
            char each = word.charAt(c);
            if(each == ch1){
                count+=1;
            }

            System.out.println(result2);
        }
    }
}