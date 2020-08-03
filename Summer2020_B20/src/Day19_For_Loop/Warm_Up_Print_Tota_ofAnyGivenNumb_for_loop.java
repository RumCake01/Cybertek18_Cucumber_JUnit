package Day19_For_Loop;
import java.util.Scanner;
public class Warm_Up_Print_Tota_ofAnyGivenNumb_for_loop {

    public static void main(String[] args) {

        /*
    write a program that can calculate the sum of all numbers between 1 to any given number
        ex:
            input: 100
            output: 5050
            input: 50
            output: 1275
            input : 200
            output : 20100
     */

        Scanner scan = new Scanner(System.in);
        System.out.println("enter a number");
        int num = scan.nextInt();

        int sum = 0;

        if (num > 0) {
            for (int i = 1; i <= num; i++) {
                // sum = sum + 1
                sum += i;
            }
            System.out.println(sum);
        } else {
            System.out.println("invalid entry");
        }
        System.out.println();
        System.out.println("============================");




        }

    }

