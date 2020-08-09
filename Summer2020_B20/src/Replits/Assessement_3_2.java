package Replits;
import java.util.Scanner;

public class Assessement_3_2 {
    public static void main(String[] args) {

    }


    public static boolean appearsTwice(String target, String sentence) {
        //write your codes here:

        String a = sentence.replace(target, "");
        if(a.length() == sentence.length()-2* target.length()){
            return true;

        }else{
            return false;
        }


    }
}