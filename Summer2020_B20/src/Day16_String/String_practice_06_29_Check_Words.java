package Day16_String;

public class String_practice_06_29_Check_Words {
    public static void main(String[] args) {
        /*
        write a method that asks user to enter a string.
        if the string is empty, print: string is empty
        if the string has more than 3 characters, print the last three characters
        if the string has less than 3 characters, print the string itself

         */

        String str = "ABC";

        //last index = length -1
        //second last index = length -1 - 1 or -2
        // third last index = length -1 -1 -1 or just put - 3

        if (str.length() == 0){// check to see if the string is empty;
        System.out.println("empty string");
        }else if(str.length()>3){// if greater than three print the last three characters
            System.out.println(str.substring(str.length()-3));// substring from third last index till the end of the entire string.
        }else{
            System.out.println(str);// below see same result using ternary method:
        }

        // WE CAN ALSO use Ternary here to use only one print statement instead of many:

        // String result = (str.length()==0) ? "empty string" : (str.length()>3) ? str.substring(str.length()-3)  : str;
       // and then,
        // System.out.println(result);


    }
}
