package WarmUp_Tasks_All.WarmUp_Tasks_All_July4th;
import java.util.Scanner;
public class Warm_Up_Task7 {
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
        System.out.println("input: ");
        int number = scan.nextInt();
        int total = 0;
        int a;
        for (a=1; a<=number; a ++){
            total = a + total;
        }
        System.out.println("input: " + number + "\noutput: " + total);







    }
}
