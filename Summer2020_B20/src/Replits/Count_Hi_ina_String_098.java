package Replits;
import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;
public class Count_Hi_ina_String_098 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine().toLowerCase();

        int countHi = 0;


        for(int i = 0; i<=str.length()-1; i++){
            if (str.substring(i).startsWith("hi")){
                countHi++;
        }
        }

        System.out.println(countHi);








    }
}
