package Day16_String;
import java.util.Scanner;
public class String_Methods_Fizz_Buzz_Exercise {
    public static void main(String[] args) {

        /*Write a program StartEndWords:
        you have 2 words that must be 5 characters, and check if last letter of first word and first letter of second work are same.
        if either one not 5 chars length:    print "need to be exactly 5 chars length"
        if last letter of 1st word and first letter of 2nd word match:  print "Fizz"
        if they do not match:  print "Buzz - did not match"
        NOTE: you will need nested If/*

         */
        Scanner scan = new Scanner(System.in);
        System.out.println("enter your first word");
        String word1 = scan.next();

        System.out.println("enter your second word");
        String word2 = scan.next();

        // have to make sure that both words are equal to 5 characters

        boolean result = word1.length()==5 && word2.length()==5;

        // we can apply nested If because we have a pre-condition

        if(result) {

            char ch1 = word1.charAt(word1.length() - 1);// in order to retrieve the last character we first need to get last index number,
            char ch2 = word2.charAt(0);// gets the first character of the second word.

            if(ch1 == ch2){
                System.out.println("fizz");// if they are same the output is FIZZ
            }else{
                System.out.println("buzz");
            }
        }else{

            System.out.println("need to be exactly 5 chars length");
        }


        // there's also another solution to solve this problem


        Scanner output = new Scanner(System.in);
        System.out.println("enter your first word");
        String word3 = output.next();

        System.out.println("enter your second word");
        String word4 = output.next();

        // have to make sure that both words are equal to 5 characters

        boolean result2 = word3.length()==5 && word4.length()==5;

        if(result2){
            if(word3.endsWith("" + word4.charAt(0)) && word4.startsWith(""+ word3.charAt(word3.length()-1))){ // if word 3 ends with the character of the first character of the word 4
            System.out.println("fizz");
          }else {
                System.out.println("buzz");
            }
        }else{
            System.out.println("need to be exactly 5 chars length.");

        }


        // we can also just use boolean to make it shorter

       /*boolean b1 = word3.endsWith("" + word4.charAt(0)); // ends with first character of word 4
        boolean b2 = word4.startsWith(""+ word3.charAt(word3.length()-1));// starts with last character of word 3


         if (b1 && b2){
        System.out.println();("fizz")}
        else {
            System.out.println("buzz");

        }else{

            System.out.println("need to be exactly 5 chars length");
        }
        }*/










    }
}
