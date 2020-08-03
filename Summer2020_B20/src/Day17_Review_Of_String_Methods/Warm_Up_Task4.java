package Day17_Review_Of_String_Methods;
import java.util.Scanner;
public class Warm_Up_Task4 {
    public static void main(String[] args) {

       /*write a program that asks user's first and last name, then prints out the initials of the user

        input:
        cybertek
                batch18
        output:
        your initial is: CB
        DO NOT use charAt method*/


        Scanner scan = new Scanner(System.in);
        System.out.println("please enter first name");
        String word1 = scan.next();
        System.out.println("please enter last name");
        String word2 = scan.next();

        System.out.println(word1.substring(0, 1).concat(word2.substring(0, 1)));





















    }
}
