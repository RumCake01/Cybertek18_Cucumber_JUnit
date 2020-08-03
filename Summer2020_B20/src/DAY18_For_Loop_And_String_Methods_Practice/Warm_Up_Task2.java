package DAY18_For_Loop_And_String_Methods_Practice;
import java.util.Scanner;
public class Warm_Up_Task2 {
    public static void main(String[] args) {
/*
/*2. Ask user to enter a word. If the first or second or both letter of the word is x, print the word without x(s).
                If x is the third letter it should be printed. If the first and second are x, both should be ignored.
                Input:
 */
        Scanner scan = new Scanner(System.in);
        System.out.println("enter a word");
        String word = scan.next();

        if(word.startsWith("x") || (word.charAt(1) == 'x')) {
            System.out.println(word.substring(2));
        }else{
            System.out.println(word);
        }























    }
}
