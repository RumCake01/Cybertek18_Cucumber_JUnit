package Replits;
import java.util.Scanner;
public class Repl_043_Quiz_Question {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("what is the farthest planet in the solar system:" );
        System.out.println("a)venus" );
        System.out.println("b)pluto" );
        System.out.println("c)neptune" );

        String a = scan.nextLine();
        String result = "";

        if(a.equals("a")) {
            result = a+ " is wrong";
            }else if(a.equals("c")) {
            result = a + " is wrong";
            }else if(a.equals("b")) {
            result = a + " is correct";
        }else {
            result = " is not a valid answer";
        }
        System.out.println(result);

        /*
        Automated tests are the future.

in the given program you have a quiz question and a scanner to catch user input which will be stored on string a.

after the user inputs an answer (a, b or c) we need to check if its the correct, wrong, valid answer.

what is the farthest planet in the solar system:
a)venus
b)pluto
c)neptune
a
a is wrong

what is the farthest planet in the solar system:
a)venus
b)pluto
c)neptune
b
b is correct
what is the farthest planet in the solar system:
a)venus
b)pluto
c)neptune
c
c is wrong
what is the farthest planet in the solar system:
a)venus
b)pluto
c)neptune
z
z is not a valid answer
         */


    }
}

