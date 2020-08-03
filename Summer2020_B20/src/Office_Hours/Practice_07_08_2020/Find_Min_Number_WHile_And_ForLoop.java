package Office_Hours.Practice_07_08_2020;
import java.util.Scanner;
public class Find_Min_Number_WHile_And_ForLoop {
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);

        int min = 2147483647; // whatever user enters it will always be less than this number
        // this is the largest number int data type can have.

        for (int i = 0; i <5; i ++){
            System.out.println("enter a number");
            int num = scan.nextInt();

            if(num<min);// the first user input will be assignger to min,
            // and the final smallest number will be assigned here at the end.
            min=num;
        }

        System.out.println("min: " + min);



    }
}
