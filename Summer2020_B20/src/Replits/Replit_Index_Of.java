package Replits;
import java.util.Scanner;
public class Replit_Index_Of {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String txt = scan.next();
        /*using indexOf method output the position of b inside txt string.
                then output the index of "foo"
foo bar
        use System.out.println() to output each index of requested.*/

        System.out.println(txt.indexOf("b"));
        System.out.println(txt.indexOf("foo"));





    }
}
