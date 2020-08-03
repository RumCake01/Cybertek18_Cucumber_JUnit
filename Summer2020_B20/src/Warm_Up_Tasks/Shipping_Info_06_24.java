package Warm_Up_Tasks;

import java.util.Scanner;

public class Shipping_Info_06_24 {
    public static void main(String[] args) {
        /*2. write a program for the shipping info that, the program should ask:
        building number
        Street address (Assume it has more than one word)
        city name
        state name
        zip code
        full name of the person:
        and prints the ship to info in the following format:
        ex output:
        Ship To:  Jimmy joe
        7925 Jones Branch Dr
        MCLean, VA 22102*/

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a building number: ");
        int buildingNumber = scan.nextInt();

        scan.nextLine();// to remove the extra ENTER key from the nextInt above

        System.out.println("Please enter the street address: ");
        String streetAddress = scan.nextLine();


        System.out.println("Please enter city name: ");
        String cityName = scan.nextLine();

        System.out.println("Please enter state: ");
        String state = scan.nextLine();

        System.out.println("Please enter zipcode: ");
        int zipcode = scan.nextInt();

        scan.nextLine();// to remove the extra ENTER key from the nextInt above

        System.out.println("please enter full name of the person: ");
        String fullName = scan.nextLine();

        System.out.println("Ship to: " + fullName+ "\n" + buildingNumber + " " + streetAddress + "\n" + cityName + "," + state + " " + zipcode);



    }
}
