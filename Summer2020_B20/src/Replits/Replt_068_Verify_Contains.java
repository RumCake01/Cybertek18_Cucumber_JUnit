package Replits;
import java.util.Scanner;
public class Replt_068_Verify_Contains {
    public static void main(String[] args) {


//Write a program that will verify if word contains in
// the sentence.
// Print out the result as boolean value.

        Scanner scan = new Scanner(System.in);
        String word = scan.nextLine();
        String sentence = scan.nextLine();
        String result = "";

        if(sentence.contains(word)){
            result="true";
        }else{
            result= "false";
        }
        System.out.println(result);
    }
}
