package Replits;
import java.util.Scanner;
public class Repl_034_Vending_Machine {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter price in cents:");
        // 1. find first whats the outcome of quarter  = 100- itemprice/25
        // 2. then find outcome of dimes = 100- item price - (quarter*25)/10;
        // 3, find outcome of nickles = 100 = item price - (quarter*25)/5;
        //4. declare boolean


        int itemPrice = scan.nextInt();

        int quarter = (100-itemPrice)/25;
        int dime = ((100-itemPrice) - (quarter*25))/10;
        int nickle = ((100-itemPrice) - ((quarter*25) + (dime*10)))/5;

        if(itemPrice<=100 && itemPrice>=25 && itemPrice%5==0){
            System.out.println("Your change is " + quarter + " quarters " + dime + " dimes  amd " + nickle + " nickles");
        }else{
            System.out.println("Invalid price!");
        }







        /*
        Write a program that determines the change to be dispensed from a vending
machine. An item in the machine can cost between 25 cents and 1 dollar, in 5-cent
increments (25, 30, 35, . . . , 90, 95, or 100), and the machine accepts only a single
dollar bill to pay for the item.

- int variable itemPrice
- int variables quarters, dimes, nickels
- Scanner object

The program accepts itemPrice, which is a price for the item you would like to purchase.

Positive behavior:

Please follow the example in the image. dots mean empty space.
-Since the item price was entered 95, change is 1 nickel

Negative behavior:

If itemPrice is less than 25 or more than 100 cents, then display an error message:
Invalid price!

If itemPrice is not divisible by 5, then also display an error message:
Invalid price!

use (itemPrice % 5 == 0) expression to find it is divisible by 5.

Do not display anything else.
         */
    }
}
