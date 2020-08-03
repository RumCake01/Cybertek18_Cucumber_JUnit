package Office_Hours.Practice_07_01_2020;

import java.util.Scanner;

public class Combine_Two_Strings {
    public static void main(String[] args) {

        String str1 = "One";
        String str2 = "eight";


        // first approach:

        // by using charAt - we can get the last letter of the first word
        /*char ch1 = str1.charAt(str1.length()-1); // last letter from the first word

        char ch2 = str2.charAt(0);// we will get first letter from the second word

        if(ch1==ch2){
            System.out.println(str1 + str2.substring(1)); // result will be Oneight
        }else {
            System.out.println(str1 + str2);*/


        // second approach:

        // we cal also do it another way by using substring

        String s1 = str1.substring(str1.length() - 1); // we only want last letter
        String s2 = str2.substring(0, 1); // we just want letter e
        if (s1.equals(s2)) {
            System.out.println(str1 + str2.substring(1));

        } else {
            System.out.println(str1 + str2);
        }

        // third solution:

        String t1 = "" + str1.substring(str1.length() - 1);
        String t2 = "" + str2.substring(0, 1);

        if (t1.equals(t2)) {
            System.out.println(str1 + str2.substring(1));
        } else {
            System.out.println(str1 + str2);
        }
    }
}
