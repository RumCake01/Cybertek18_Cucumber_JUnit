package WarmUp_Tasks_All.WarmUp_Tasks_All_July4th;

public class Warm_Up_Task5 {
    public static void main(String[] args) {
        /*
        5. write a program that can calculate the sum of all the even numbers between 1 ~ 100
         */

        int a;
        int sumOfEven = 0;
        for (a = 1; a <= 100; a++) {// we can also declare it this way: for (a = 1; a <= 100; a+=2)
            if (a % 2 == 0) {
                sumOfEven += a;
            }
        }
        System.out.println("\nthe sum of even numbers between 1 to 100 is " + sumOfEven + "\n");
        }
    }

