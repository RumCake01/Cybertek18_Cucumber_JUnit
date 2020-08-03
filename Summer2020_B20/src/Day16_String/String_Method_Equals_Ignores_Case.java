package Day16_String;
import com.sun.security.jgss.GSSUtil;

import java.util.Scanner;
public class String_Method_Equals_Ignores_Case {
    public static void main(String[] args) {

      // sometimes user might enter yes in many different ways:

      // Yes, YES, YEs, yEs,

      // that/s where we need to use this method because it will ignore the case sensitivity.

        Scanner scan = new Scanner(System.in);
        System.out.println("are u employed");

        // two ways to ignore the case sensitivity:


        String answer = scan.next().toLowerCase();// 1 way to ignore the case sensitivity, will take it as lower case

        // use only one of them.

        if(answer.equalsIgnoreCase("yes")){// 2 way to ignore case sensitivity. this is the best way.
            System.out.println("employed");
        }else{
            System.out.println("not employed");
        }




    }
}
