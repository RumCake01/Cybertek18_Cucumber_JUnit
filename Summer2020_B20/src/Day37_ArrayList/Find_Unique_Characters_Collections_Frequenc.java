package Day37_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Find_Unique_Characters_Collections_Frequenc {

    /*
    Warmup Tasks:
        1. write a program that can find the unique characters from a string
                        DO NOT use nested loop
                        "ABABCDEE"
                        output: C D
        2. write a program that can find the frequency of character from a String
                        DO NOT use nested loop
                        "AABBCCDDEE"  ==> "ABCDE"
                        output: A2B2C2D2E2
     */

    public static void main(String[] args) {

        String str = "ABABCDEE";
        String uniques = "";
        ArrayList<String> list = new ArrayList<>();

       /*for(char each :str.toCharArray() ){// on the right is out data structure
            list.add(each); */
        // we could also use string here and split method to get each char from array list
        for (String each : str.split("")) {
            list.add(each);
        }
        System.out.println(list);
        for (String each : list) {
            int count = Collections.frequency(list, each); // find frequency of A
            if (count == 1) { // is equal then it is Unique and it should print out the letter A
                uniques += (each);
                System.out.println(uniques);
            }
        }

            System.out.println(uniques + " " );


    }
}
