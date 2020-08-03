package Replits;
import java.util.Scanner;
public class Repl_048_Conditional_Practice {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String name = scan.next();
        String result = "";

        if(name.equals("Chen")){
            result = "teacher";
        }else{
            result = "student";
        }
        System.out.println(result);
    }
}
