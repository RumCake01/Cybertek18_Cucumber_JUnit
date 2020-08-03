package Replits;
import javax.sound.midi.Soundbank;
import java.util.Scanner;
public class Repl_083_String_Substring {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String txt = scan.next();

        /*
        using substring method output the first two letters of txt string
for examole:
String txt = "foo"
the first two letters are "fo"
use print not println.

         */
        String first = txt.substring(0,2);
        System.out.println(first);
    }
}
