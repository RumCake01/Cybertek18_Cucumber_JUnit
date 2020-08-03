package Day08_LogicalOperators;

import java.sql.SQLOutput;

public class Practice4 {

    public static void main(String[] args) {


        double num1 = 20;
        double num2 = 80;
        double result = (num1 + num2) * 25;// 2500
        double remainder = result % 40; // its not evenly divisible by 40, so there will be some remainder
        boolean r = remainder <= 20;
        System.out.println(r);


        double num = 20;
        double num01 = 80;
        double num02 = (num + num01) * 25 % 40;
        boolean result01 = num02 <= 20;

        System.out.println(result01);

        int a = 10;
        int b = 20;

        if (a > b) {
            System.out.println(a + " is the largest number");
        }
        if (b > a) {
            System.out.println(b + " is the max number");
        }
        if (a == b) {
            System.out.println(a + " and " + b + " equal numbers");
        }

        int friend1 = 20;
        int friend2 = 21;
        if (friend1 >= 21) {
            System.out.println(friend1 + " is eligible age to buy alcohol.");
        }
        if (friend2 <= 21) {
            System.out.println(friend2 + " is eligible age to buy alcohol");
        }

        int c = 10;
        int d = 20;
        if (c < d) {
            System.out.println(c + " is the smallest number");
        }
        if (d < c) {
            System.out.println(d + " is the smallest number");
        }

        boolean workOutTime = false;
        if (workOutTime == true) {
            System.out.println("Ask Rumiya to work out");
        }
        if (workOutTime == false) {
            System.out.println("Rumiya must continue to work out");
        }

        double Angel1 = 60;
        double Angel2 = 100;
        double Angel3 = 20;
        boolean valid = Angel1 + Angel2 + Angel3 == 180;
        boolean Invalid = !valid;
        if (valid) {
            System.out.println("valid triangle");
        }
        if (Invalid) {
            System.out.println("invalid triangle");
        }






    }




}
