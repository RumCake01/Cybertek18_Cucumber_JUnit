package DAY18_For_Loop_And_String_Methods_Practice;
import java.util.Scanner;
public class Warm_Up_Tasks {
    public static void main(String[] args) {
/*
 Ask user to enter a word. If the work contains starts with x, print the word without x.
                    Input:
                        xcode
                    Output:
                        code
 */
        Scanner scan = new Scanner(System.in);
        System.out.println("please enter a word");
        String word = scan.next();

               if(word.startsWith("x")){
                   System.out.println(word.substring(1));
               }










    }



}
