package Day22_Nested_Loop;
import java.util.Scanner;
public class Occurancys_of_Char_using_whileLoop {
    public static void main(String[] args) {

        // write a program that asks user to enter one string and one char and then returns the frequency
        // ex: input AABAAAC  then A output:4

        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        char ch = scan.next().charAt(0);//
        // scan.next returns us a string, but we need a char, thats why we added charAt(0) to the scan.next
        // so it can convert it to the char. for the assignment we needed one char and one string by the user.


        int index = 0;// this is out initialization
        while (index <= str.length() - 1) {
            char eachCharacter = str.charAt(index); // this will retreive a b a b c

            if (eachCharacter == ch) { // if its true this given char is occured in the string
                // now we need a variable that will help us find the frequency
                index++;
            }

            System.out.println(index);
        }
    }
}