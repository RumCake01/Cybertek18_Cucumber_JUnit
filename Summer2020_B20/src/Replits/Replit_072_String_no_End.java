package Replits;
import java.util.Scanner;
public class Replit_072_String_no_End {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("please enter a word");
        String txt = scan. next();

        int last = txt.length()-1;

        String firstChar = txt.substring(0,last);
        System.out.println(firstChar);



        /*
        in this exercise you get a string called txt .

output txt without its last letter.
for example:
txt = "foo"
output will be:
fo
hint
use substring() and length() togather to solve this.
substring will start at 0 and will end at txt length -1
         */



    }
}
