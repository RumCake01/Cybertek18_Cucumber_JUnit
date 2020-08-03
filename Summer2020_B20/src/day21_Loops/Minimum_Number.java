package day21_Loops;
import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;
public class Minimum_Number {
    public static void main(String[] args) {


        // write a program that asks user to enter 5 numbers and returns the minimum  number
        Scanner scan = new Scanner(System.in);
        int min = 999999999;// we can put this number if we are sure the user will not enter this number

        for (int i = 1; i <= 5; i++) { // i <= 5 stands for number of for loops, so it will be printed 5 times

            System.out.println("enter a number");
            int num = scan.nextInt(); // example: 10, 20, 30, 40,50

            if (num < min) { // this will always be less than the min number
                min = num;
            }
        }
        System.out.println("minimum number: " + min);

        // even if the user enters two same number, it will still select it if is still minimum.

    }
}


