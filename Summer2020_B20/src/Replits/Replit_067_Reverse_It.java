package Replits;
import java.util.Scanner;
public class Replit_067_Reverse_It {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String word = scan.next();

        int length = word.length();
        String result = "";

        if(length<5){
            result = "Too short!";
        }else if(length>5){
            result ="Too long!";
        }else{
            result= "" + word.charAt(4) + word.charAt(3) + word.charAt(2) + word.charAt(1) + word.charAt(0);
        }
        System.out.println(result);





    }
}
