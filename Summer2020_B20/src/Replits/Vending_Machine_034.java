package Replits;
import java.sql.SQLOutput;
import java.util.Scanner;
public class Vending_Machine_034 {
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        System.out.println("Enter price in cents:");
        int itemPrice = scan.nextInt();

        int quarter = (100 - itemPrice) / 25;
        int dime = ((100 - itemPrice) - (quarter * 25)) / 10;
        int nickels = ((100 - itemPrice) - ((quarter * 25) + (dime * 10))) / 5;

        if (itemPrice <= 100 && itemPrice >= 25 && itemPrice % 5 == 0) {

            System.out.println("Your change is " + quarter +
                    " quarters, " + dime + " dimes, and " + nickels +
                    " nickels.");


        } else {
            System.out.println("Invalid price!");
        }

        System.out.println("============");
        String str = "boopity bop";
        int i = 10;

        System.out.println(str.charAt(5));
        System.out.println(str.charAt(8));
        System.out.println(str.charAt(1));



        System.out.println(str);
    }
}

