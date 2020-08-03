package day21_Loops;

import java.util.Scanner;
import java.util.Scanner;
public class MaxNumber {

    public static void main(String[] args) {


        // write a program that asks user to enter 5 numbers and returns the max number

        Scanner scan = new Scanner(System.in);
       int max = -2147483648;// this is the smallest int value.  this temporary value will always be less than the the ac, any number compared
        // to this number will be greater, therefore it will be assigned to the max.

        for(int i  = 10; i <= 50; i +=10){
            System.out.println("enter a number");
            int num = scan.nextInt();

            if(num>max) {// if the next entered number is greater than the previos then it will be assigned.
                max = num;// assigned user entered number to the max.
                // the first number that user entered will be assigned to the max., only the greater number will
                // be assigned to the max variable

                // we are comparing this five numbers to each other, and eventually the max variable wiil contain the max value
            }
        }

        System.out.println("max number: " + max);

    }



}
