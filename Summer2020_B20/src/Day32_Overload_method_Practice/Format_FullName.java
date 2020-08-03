package Day32_Overload_method_Practice;
import java.util.Scanner;
public class Format_FullName {

    /*1. write a method that can return the full name of a person in regular format
    ex:
    fullName("cYbErTeK", "SCHOOL"); ==> "Cybertek School"*/


    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        String first = "cYbeErTeK";
        String last = "SCHOOL";

        String result = formatFullName(first, last);
        System.out.println(result);
    }


    public static String formatFullName( String first, String last){
        first =  first.substring(0, 1).toUpperCase() + first.substring(1).toLowerCase(); // converts first letter to Upper the rest to lower case
        last = last.substring(0, 1).toUpperCase() + last.substring(1).toLowerCase(); // converts first letter to Upper the rest to lower case
        String result = first + " " + last;
        return result;
    }
}
