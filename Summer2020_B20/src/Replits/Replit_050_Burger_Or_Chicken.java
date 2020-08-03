package Replits;
import java.util.Scanner;
public class Replit_050_Burger_Or_Chicken {
    public static void main(String[] args) {
        /*a fast food company has two main order types, burger meal and chicken meal.
        both have the same prices.
                so if a cashier enters "burger" or "chicken " he will get the same price

        a float : 10.0
        this test can be done with one if.
        check if in (string variable) equals "burger" or "chicken"  and output the price 10.0
        also if input is "soda" output 2.0 (do this with another if)
        for example:
        in = "burger"
        output: 10.0
        in = "chicken "
        output: 10.0
        in = "soda"
        output: 2.0
        hint or operator in java is  ||*/

        Scanner scan  = new Scanner(System.in);
        String word = scan.next();


        boolean cashiersEntry = word.equalsIgnoreCase("burger") || word.equalsIgnoreCase("chicken");
        boolean cashiersEntry2 = word.equalsIgnoreCase("soda");

        String output = "";
       if(cashiersEntry) {
           output = "10.0";
       }if(cashiersEntry2){
           output = "2.0";
       }
        System.out.println(output);


















    }
}
