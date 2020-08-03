package day21_Loops;

public class Divide_Two_Numbers {

    public static void main(String[] args) {


        // write a program that will divide two numbers without using % and / operators
        // 10/3 = 3
        //10- 3= 7
        //7 - 3 = 4
        // 4 - 3 = 1/ this will be our remainder, whatever we have left in numerator

        int a = 20;
        int b = 6;// always make sure that this be is always less than be, and that is more than zero


        /*if(b==0){
            System.out.println("invalid input");
            System.exit(0);// will exit out system so the loop will never get executed.*/
        //}


        int count = 0;// mandatory to provide this variable in order to get the correct result

        while(a>=b){
            a-=b;
            count++;// every time the loop is executed , used to count how many times we substracted numerator from denominator
        }

        System.out.println(count + " with a remainder of " + a);// count will provide the number
        // for how many times it has beed substracted and the "a" will provide us with remainder
    }
}
