package Replits;
import java.util.Scanner;
public class Repl_191_Reverse_String_Methods {

    public static void main(String[] args) {


                Scanner scan = new Scanner(System.in);
                String input = scan.next();
                String result = "";
                System.out.println(reverse(input));

            }
            public static String reverse(String input)
            {
                String result = "";
                for(int i = input.length()-1; i>=0; i--){
                    result+= input.charAt(i);
                }
                return result;


            }
        }
