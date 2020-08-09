package Replits;
import java.util.Arrays;


public class Rplt_204 {
    public static void main(String[] args) {
    }


    public static boolean isAnagram(String word1, String word2) {

        if (word1.length() != word2.length()) return false;


        char[] word1Char = word1.toCharArray();
        char[] word2Char = word1.toCharArray();

        Arrays.sort(word1Char);
        Arrays.sort(word2Char);

        return Arrays.equals(word1Char, word2Char);


      /*  import java.util.Arrays;
        class Main {
            public static void main (String args[]) {
                System.out.println(isAnagram("iceman","cinema"));
            }
            public static boolean isAnagram(String word1, String word2) {
                char[]ch1=word1.toLowerCase().toCharArray();
                char[]ch2=word2.toLowerCase().toCharArray();
                Arrays.sort(ch1);
                Arrays.sort(ch2);
                return (Arrays.toString(ch1).equals(Arrays.toString(ch2)));
            }
        }*/
    }
}
