package Day23_Arrays;
import java.sql.SQLOutput;
import java.util.Scanner;
public class Addition_Nested_Loop {
    public static void main(String[] args) {

        /*
         1. write a program that ill ask user to enter two numbers and calculates the sum of those two numbers. then it asks the user if he/she wants to continue
                    if the answer is yes, repeat the whole process again
                    if the answer is no, only return the addition
                    but while the anser is not a valid answer (not yes or no), the the program should repeatedly ask the user re-enter
            HINT: nested loop task, outter loop need to be an infinite loop

         */

        Scanner input = new Scanner(System.in);

        while(true) {


            System.out.println("enter two numbers");
            int num1 = input.nextInt();
            int num2 = input.nextInt();
            int result = num1 + num2;

            System.out.println(result);

            System.out.println("do u want to continue?");
            String a = input.next().toLowerCase(); // to convert user input to lower case

            while (!(a.equals("yes") || a.equals("no")) ) {// we use while loop here because while the answer
                // is not valid it will repeatedly continue asking
                System.out.println("Invalid Answer, please enter yes or no");
                System.out.println("do u want to continue?");
                a = input.next().toLowerCase(); // to turn everything to lower case
            }
                if(a.equals("no")) {
                break;
            }
        }
        System.out.println("thanks for using cybertek's calculator");



    }

}
