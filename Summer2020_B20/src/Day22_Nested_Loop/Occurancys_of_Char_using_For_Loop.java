package Day22_Nested_Loop;
import java.util.Scanner;
public class Occurancys_of_Char_using_For_Loop {
    public static void main(String[] args) {

        // write a program that asks user to enter one string and one char and then returns the frequency
        // ex: input AABAAAC  then A output:4

        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        char ch =scan.next().charAt(0);//
        // scan.next returns us a string, but we need a char, thats why we added charAt(0) to the scan.next
        // so it can convert it to the char. for the assignment we needed one char and one string by the user.

       // String str = // this was used initially without a scanner class
        // char ch = 'a';// this was used initially without a scanner class// this is the character we are trying to find how many number it has been printed.

        int count = 0; // will provide the frequency of ch in the str

        // create a loop that can iterate every single inder of the character in the string

        for(int i = 0; i <=str.length()-1; i++){
            // by using i we can retrieve each character from the string.

           char eachCharacter =  str.charAt(i); // this will retreive a b a b c

            if( eachCharacter == ch){ // if its true this given char is occured in the string
                // now we need a variable that will help us find the frequency

                // we can use int count = 0 for that purpose above

                 count +=1;


            }
        }
        System.out.println(count);

    }
}
