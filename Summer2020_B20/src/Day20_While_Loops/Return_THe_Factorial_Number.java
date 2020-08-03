package Day20_While_Loops;
import java.util.Scanner;
public class Return_THe_Factorial_Number {
    public static void main(String[] args) {


       /* Write a program that can return the factorial number of any given number
        Ex:
        input:
        5
        output:
        120*/
        Scanner scan = new Scanner(System.in);
        System.out.println("enter a number");

        int n = scan.nextInt();
        int result = 1;

        for (int i =n; i >=1; i--){
            result*=1;
        }

        System.out.println(result);
    }
}
