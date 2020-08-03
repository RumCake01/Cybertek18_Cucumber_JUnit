package Replits;
import java.util.Scanner;
public class Replit_065_Duplicate {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String word1 = scan.next();
        String word2 = scan.next();
        String concat = word1.concat("".concat(word2));
        String concat1 = word2.concat("".concat(word1));
        String concat3 = concat.concat("".concat(concat1));
        System.out.println(concat3);
    }
}
