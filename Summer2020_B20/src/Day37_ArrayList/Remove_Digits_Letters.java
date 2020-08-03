package Day37_ArrayList;

import Library.Util;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Remove_Digits_Letters {

    public static void main(String[] args) {

        ArrayList<Character> chars = new ArrayList<>();

        chars.addAll(Arrays.asList('a', 'a', '2', '!', '5', 'b', 'W', '7', '$'));
// remove if character is digit or letter
        chars.removeIf( p-> Character.isDigit(p) || Character.isLetter(p) );
        // Character.isDigit(p) --> if character is digit then it will get removed.
       //  Character.isLetter(p) --> if character is letter the it will get removed
        System.out.println(chars);

        System.out.println("=====================");
        ArrayList<Character> list = new ArrayList<>(); // [2, 5, 7]
        list.addAll(Arrays.asList('a', 'a', '2', '!', '5', 'b', 'W', '7', '$') ) ;

        ArrayList<Character> digits = new ArrayList<>(); // [2, 5, 7]
        digits.addAll(list);
        digits.removeIf( p -> !Character.isDigit(p) ); // removes if elements are not digit, everything that is not digit.
        System.out.println("digits " + digits );
        System.out.println("=====================");


        ArrayList<Character> letters = new ArrayList<>(); // [a, b, W]
        letters.addAll(list);
        letters.removeIf(p -> !Character.isLetter(p)); // removes character that are not letter
        System.out.println("letters " + letters);
        System.out.println("=====================");


        ArrayList<Character> specilChars = new ArrayList<>(); // [! #]
        specilChars.addAll(list);
        specilChars.removeAll(letters);  // removes letters
        specilChars.removeAll(digits); // removes digits

        System.out.println("special characters " + specilChars);
        System.out.println("=====================");

    }
}
