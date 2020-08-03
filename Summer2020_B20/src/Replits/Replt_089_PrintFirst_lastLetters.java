package Replits;
import java.util.Scanner;
public class Replt_089_PrintFirst_lastLetters {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String word = scan.next();
        //WRITE YOUR CODE HERE
        String result = "";
        for (int i = 0; i <=word.length()-1; i++) {
          result   = word.substring(0, word.length() - 1);


        }
        System.out.println(result);
    }
}
