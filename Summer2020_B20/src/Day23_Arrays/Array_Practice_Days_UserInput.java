package Day23_Arrays;
import java.util.Scanner;
public class Array_Practice_Days_UserInput {
    public static void main(String[] args) {


        String days[] = {"Mon", "Tuesd", "Wednes", "Thursd", "Frid", "Sat", "Sunday"};
        Scanner scan = new Scanner(System.in);
        System.out.println("enter a number");
        int num = scan.nextInt();

        for(int i = 0; i<=days.length-1; i++){
            System.out.println(days[i] + " ");
        }
        System.out.println();


    }
}
