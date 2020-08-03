package Warm_Up_Tasks;

import java.util.Scanner;

public class Next_Line_UserInfo06_23 {
    public static void main(String[] args) {

 /*
 3. write a program that asks the user to enter:
        1. building number
        2. street name (assume it has one word only)
        3. road name (assume it has one word only)
        4. city name (assume it has one word only)
        5. state
        6. zipcode
        and then print out the full address
        ex:
        input:
        7925
        JonesBranch
                Dr
        McLean
                VA
        22000
        output:
        addrees:    7925 JonesBranch Dr, McLean VA, 22000*/

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter building number: ");
        int buildingNumber = input.nextInt();
        input.nextLine();
        System.out.println("Please enter street name: ");
        String streetName = input.nextLine();
        System.out.println("Please enter city name: ");
        String cityName = input.next();
        input.nextLine();
        System.out.println("Please enter state: ");
        String state = input.next();
        System.out.println("Please enter zipcode: ");
        int zipcode = input.nextInt();
        String fullAddress = buildingNumber + " " + streetName + ", " + cityName + " " + state + "," + zipcode;
        System.out.println("Full address is: " + fullAddress);
        input.close();


    }
}
