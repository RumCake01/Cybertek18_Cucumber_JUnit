package Warm_Up_Tasks;

import java.util.Scanner;

public class Next_Line_Car_Info06_23 {
    public static void main(String[] args) {
        /*1. write a program that asks the user enter his car info:
        brand
                model
        year
                color
        mileage
                price
        ex: output format should be:
        2012 Toyota Corolla white, 120000 miles, 12000 dollars*/


        Scanner input = new Scanner(System.in);
        System.out.println("Pleas enter brand: ");
        String brand = input.nextLine();

        System.out.println("Pleas enter model: ");
        String model = input.next();

        System.out.println("Pleas enter year: ");
        int year = input.nextInt();

        System.out.println("Pleas enter color: ");
        String color = input.next();

        System.out.println("Pleas enter mileage: ");
        double mileage = input.nextDouble();

        System.out.println("Pleas enter price: ");
        double price = input.nextDouble();

        System.out.println(year + " " + brand + " " + model + " " + color + ", "+ (int) mileage + " miles, " + (int) price + " dollars");

    }
}
