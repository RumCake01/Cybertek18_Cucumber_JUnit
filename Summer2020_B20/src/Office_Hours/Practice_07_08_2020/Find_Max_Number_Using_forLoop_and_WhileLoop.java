package Office_Hours.Practice_07_08_2020;
import java.util.Scanner;
public class Find_Max_Number_Using_forLoop_and_WhileLoop {
    public static void main(String[] args) {


        // find the max number entered by the user

        // get user input for 5 imes and then compare it for five times, use loop


        // example with the for loop:



        Scanner scan = new Scanner(System.in);

        /*int max = -2147483648; // the first users input will be assigned to this. then we can compare to this one and replace with bigger user input
        // whatever user enter it will always be more than the current min integer in the max integer


        for(int i = 1; i<=5; i++){ // this statement will be repated 5 times i<=5

            System.out.println("enter a number"); // this needs to be in the loop body so it can be repeated 5 times.
            int num = scan.nextInt(); // this needs to be in the loop body so it can be repeated 5 times.
            // any number that user enters will be bigger than the current max int. we only need to find the largest number of all.



            if(num>max){
                max=num;// this will update and assign the biggest number from the all previous numbers and then assign it to the max.
            }

        }

        System.out.println("max: " + max);// in the end it will assign the biggest number of all to the max */



        // find max number with WHILE statement:

        int j = 1;
        int max = -2147483648;

        while (j<=5){
            System.out.println("enter a number");
            int n = scan.nextInt();

            if(n>max){
                max = n;
            }
            j++;
        }
        System.out.println("max: " +max);




    }
}
