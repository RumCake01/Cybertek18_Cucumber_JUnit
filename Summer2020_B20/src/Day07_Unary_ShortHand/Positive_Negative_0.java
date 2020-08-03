package Day07_Unary_ShortHand;

import java.sql.SQLOutput;

public class Positive_Negative_0 {
    public static void main(String[] args) {
        // Task is to verify if number is positive, negative, and zero.
        // 120 is a positive number? true
        //  120 is negative number? false
        //  120 ii zero? false
        int num = 120;
        boolean result = num > 0;
        boolean result2 = num < 0;
        boolean result3 = num == 0;

        System.out.println(num + " is a positive number? " + result);
        System.out.println(num + " is a negative number? " + result2);
        System.out.println(num + " is zero ? " + result3);

        // Practice -- === > decrement

        // int a = 20;
        // a = a - 1; // result is 19, a = 19.
        // System.out.println(a);
        System.out.println("=======================");
        // the same calculation can be done using decrement operator below --.
         int a = 20;
         -- a; // if applied in front of the variable, it automatically dicreases the value of a
        System.out.println(a); // result will be 19.

        System.out.println("=======================");

        // using + + to increase automatically by 1
        int b = 10;
        ++ b;// automatically increases it by 1, so b = 11.
        System.out.println(b);

        System.out.println("=======================");

        int x = 100;
        System.out.println(++ x); /// increases the value immediately, the result is 101.

        int y = 200;
        System.out.println( -- y);// decreases the value immediately, the result is 199.














    }




}



