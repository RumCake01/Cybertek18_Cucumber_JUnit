package Replits;
import java.util.Scanner;
public class Repl_062_First_And_Last_Char {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String word = scan.next();
        //WRITE YOUR CODE HERE

        String ch1 = word.substring(0, 1);
        String ch2 = word.substring(word.length() - 1);

        System.out.print(ch1 + ch2);

    }
}

