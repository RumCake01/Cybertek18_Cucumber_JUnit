package Day20_While_Loops;
import java.util.Scanner;
import java.util.Scanner;

public class Until_Negative_Infinit_loop {
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        int sum = 0;
        for (int i = 0; true;){ // this is infinite loop, will be executed infinite times until I enter negative number
            System.out.println("enter a number");
            int num = scan.nextInt();
            if(num<0){
                break;
            }
            sum +=num;
        }
        System.out.println("sum is: " + sum);
    }
}
