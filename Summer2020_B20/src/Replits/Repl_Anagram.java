package Replits;
import java.util.Arrays;
public class Repl_Anagram {

    public static void main(String[] args) {
    }
        public static boolean isAnagram(String word1, String word2) {

            if(word1.length() != word2.length() ) return false;


            char [] word1Char = word1.toCharArray(); //
            char [] word2Char = word2.toCharArray();

            Arrays.sort(word1Char);
            Arrays.sort(word2Char);

            return  Arrays.equals(word1Char, word2Char); // compare array equality compare exact sequence



        }
    }

