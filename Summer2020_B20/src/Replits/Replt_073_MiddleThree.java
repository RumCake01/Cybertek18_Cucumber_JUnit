package Replits;
import java.util.Scanner;
public class Replt_073_MiddleThree {

    public static void main(String[] args) {

        // You have a word, do the following:
        //
        //If the word has odd number of characters
        //and has 5 or more characters, print the middle three
        //characters of the word.
        //
        //Otherwise print "invalid".
        //
        //fifteen ==> fte
        //apple ==> ppl
        //hey ==> invalid
        //java ==> invalid
        //whatsup ==> ats
        //$ ==> invalid



        Scanner scan = new Scanner(System.in);
        System.out.println("enter a word");
        String word = scan.next();
        //YOUR CODE HERE

        String result = "";


        if(word.length()%2!=0 && word.length()>5) {
            result = word.substring(word.length() / 2 - 1, word.length() / 2 + 2);
        }else{
           result = "invalid";
        }
        System.out.println(result);

        }
    }

