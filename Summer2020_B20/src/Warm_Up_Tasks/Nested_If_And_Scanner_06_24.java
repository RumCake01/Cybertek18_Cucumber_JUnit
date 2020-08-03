package Warm_Up_Tasks;

import java.util.Scanner;

public class Nested_If_And_Scanner_06_24 {
    public static void main(String[] args) {
        /*
        warmup tasks:
        1. write a java program that can convert any given numbers between 0 ~ 9 to words,
         if the number is greater than 9 or less than zero,
        out put should be "Invalid".
            MUST use Scanner and nested IF



        4. Write a program that asks user to enter the month number and returns the number of days in given month month (Assume that Feb has 28 days)
                30 days: 4,6,9,11
                31 days: 1,3,5,7,8,10,12

                MUST use Scanner and nested IF
         */
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number");

        int num = input.nextInt();
        String result = "";

        if(num>=0 && num <=9){
            if(num == 0){
                result = "zero";
            }else if(num == 1){
                result = "one";
            }else if(num == 2){
                result = "two";
            }else if(num == 3){
                result = "three";
            }else if(num == 4){
                result ="four";
            }else if(num == 5){
                result = "five";
            }else if(num == 6){
                result = "six";
            }else if(num == 7){
                result = "seven";
            }else if(num == 8){
                result = "eight";
            }else{
                result = "nine";
            }
        }else{
            result = "Invalid";
        }
        System.out.println(result);
    }
}
