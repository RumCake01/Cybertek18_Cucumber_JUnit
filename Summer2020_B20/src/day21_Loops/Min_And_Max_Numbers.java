package day21_Loops;
import java.util.Scanner;
public class Min_And_Max_Numbers {

    public static void main(String[] args) {

        // write a program that asks user to enter 5 numbers and returns the max and minimum  number

        Scanner scan = new Scanner(System.in);

        int max = -9999999; // any user entered input will be grater than this number
        int min  = 9999999;// any user entered number will be smaller than this number
        for(int i = 1; i <=5; i++){

            System.out.println("enter a number");
            int userNumber = scan.nextInt();

            if (userNumber>max){ //  will get a max number and assigned it to min
                max=userNumber;
            }

            if(userNumber<min){ // will get a min number and assigned it to min
                min = userNumber;
            }
        }
        System.out.println(min + " " + max+ " ");



    }
}
