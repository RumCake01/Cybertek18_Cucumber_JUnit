package Day22_Nested_Loop;
import java.util.Scanner;
public class Upper_Lower_Char_String_Fint_First_AndLast {

        public static void main (String[]args){

            //Write a program that can asks user to enter one string and one char and then returns the frequency of str2 in str1
            //Ex
            //Input: AABAAC
            //        A
            //Output: 4
            //Input: ABCC
            //        C
            //Output: 2


            Scanner scan = new Scanner(System.in);
            System.out.println("enter a string");
            String word  = scan.next();

            // if it start w upper case we print true, otherwise we print false below

            char ch1 = word.charAt(0); // we need to get the first letter by it first index
            char ch2 = word.charAt(word.length()-1); // we will get last characters by using length-1 will return last index.

            // we need to make sure the started character is within the range of uppercase Aski table characters

            boolean startingChar = ch1 >='A' && ch1<='Z'; // condition for upper case characters
            boolean endingChar = ch2>='a' && ch2<='z';// condition for lower case characters


            System.out.println(startingChar && endingChar);

            // we can also do it using the if/else statement


            if(startingChar && endingChar){
                System.out.println("true");
            }else{
                System.out.println("false");
            }









        }
    }
