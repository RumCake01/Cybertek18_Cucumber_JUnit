package day21_WarmUp_Tasks;
import javax.xml.crypto.dsig.spec.HMACParameterSpec;
import java.util.Scanner;
public class WarmUp_1 {
    public static void main(String[] args) {
      /*
        1. write a program that asks user to enter 5 numbers and retuns the maximum number
        2. write a program that asks user to enter 5 numbers and returns the minimum number
        3. write a program that can divide two numbers without using / & % operators and returns the division and remainder
        ex:
        input:  10
        3
        0utput: 3 with a remainder of 1 */


        Scanner scan = new Scanner(System.in);
        System.out.println("enter your number: ");
        int yourNumber = scan.nextInt();
        int maxNumber = 0;
        int minNumber = 0;
        int i = 1;
        while (yourNumber!=0) {
            System.out.println("enter your number: ");
            if (yourNumber > maxNumber) {
                maxNumber = yourNumber;
            } else if (yourNumber < minNumber) {
                minNumber = yourNumber;
            }
        }
        System.out.println("This is ur max number:  " + maxNumber);
        System.out.println("this is ur min number: " + minNumber);
    }
}
