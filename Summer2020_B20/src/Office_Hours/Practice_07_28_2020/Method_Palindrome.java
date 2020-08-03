package Office_Hours.Practice_07_28_2020;

import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;

public class Method_Palindrome {

    public static void main(String[] args) {

        String palindrome = "Kayak";

        System.out.println(isPalindrome(palindrome));

        // this is statement for void method
        // IsPalindrom (str."Level");
        // IsPalindrome(name);

        System.out.println("===================================");


        String[] names = {"Aslan", "Ramazan", "Alex", "Erfan"};
        ArrayList<String> nameList = new ArrayList<>();

        for (String each : names) {
          //  System.out.println(reverseString(each));
            // isPalindrome(each);

            nameList.add(reverseString(each));
        }
        System.out.println(nameList);
    }


    public static String isPalindrome(String str) {
        String reversed = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reversed += str.charAt(i);
        }
        return reversed;
    }

    public static String reverseString(String str) {
        String result = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            result += str.charAt(i);
        }

        return result;
     /* this is with void method
public static void isPalindrome(String str){
        String reversedStr  = reverseStr(str);
        boolean palindrome = str.equalsIgnoreCase(reverseStr);
        System.out.println( (palindrome)? str +  " Is Palindrome" : "Is not Palindrome");
 */

    }

}