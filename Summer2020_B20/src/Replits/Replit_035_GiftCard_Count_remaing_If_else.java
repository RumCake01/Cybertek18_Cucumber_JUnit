package Replits;
import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;
public class Replit_035_GiftCard_Count_remaing_If_else {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("please enter item name");
        String item = scan.nextLine();

        /*
        1. make sure only these items from the list are called
        2. assign price to each of the items in the if statement
        3. display remaining balance after each item selected
        4. display invalid item
        5. display not enough funds if the item is cost more than 100
                or if the amount is reached

         */

        boolean validItems = item.equalsIgnoreCase("Charger") || item.equalsIgnoreCase("USB cable")
                || item.equalsIgnoreCase("Headphones") || item.equalsIgnoreCase("Pants")
                || item.equalsIgnoreCase("Socks") || item.equalsIgnoreCase("Blanket")
                || item.equalsIgnoreCase("Pillow") || item.equalsIgnoreCase("Hat")
                || item.equalsIgnoreCase("Smartphone")
                || item.equalsIgnoreCase("Laptop");

        String result = "";
        String leftover = "";


        if (validItems) {
            if (item.equalsIgnoreCase("Headphones")) {
                int price = 30;
                result = "Thank you for your purchase!";
                leftover = "Your current balance is: " + (100 - price) + "$";
            } else if (validItems == item.equalsIgnoreCase("charger")) {
                int price = 15;
                result = "Thank you for your purchase!";
                leftover = "Your current balance is: " + (100 - price) + "$";
            } else if (item.equalsIgnoreCase("USB cable")) {
                int price = 10;
                result = "Thank you for your purchase!";
                leftover = "Your current balance is: " + (100 - price) + "$";
            } else if (item.equalsIgnoreCase("Pants")) {
                int price = 50;
                result = "Thank you for your purchase!";
                leftover = "Your current balance is: " + (100 - price) + "$";
            } else if (item.equalsIgnoreCase("Hat")) {
                int price = 25;
                result = "Thank you for your purchase!";
                leftover = "Your current balance is: " + (100 - price) + "$";
            } else if (item.equalsIgnoreCase("Socks")) {
                int price = 5;
                result = "Thank you for your purchase!";
                leftover = "Your current balance is: " + (100 - price) + "$";
            } else if (item.equalsIgnoreCase("Blanket")) {
                int price = 60;
                result = "Thank you for your purchase!";
                leftover = "Your current balance is: " + (100 - price) + "$";
            } else if (item.equalsIgnoreCase("Pillow")) {
                int price = 40;
                result = "Thank you for your purchase!";
                leftover = "Your current balance is: " + (100 - price) + "$";
            } else {
                result = "Sorry, not enough funds on your gift card!";
            }
        } else {
            result = "Invalid item!";
        }
            System.out.println(result);
            System.out.println(leftover);
        }
    }