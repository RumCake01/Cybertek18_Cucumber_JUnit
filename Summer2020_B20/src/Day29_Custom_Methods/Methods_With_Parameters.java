package Day29_Custom_Methods;

import java.util.Scanner;

public class Methods_With_Parameters {

    public static void main(String[] args) {


        printHello(5); // just enter the numbers here,
        System.out.println("=========================================");

        Scanner scan = new Scanner (System.in);
        System.out.println("enter birth year and current year");


        age(scan.nextInt(), scan.nextInt()  ); // just enter the numbers here, or age year
    }


    public static void printHello(int numberOfTimes) { // this method has a parameter in ()

        for (int i = 0; i < numberOfTimes; i++) { // we pass the N parameter in the method above as well, so we can use scanner
            System.out.println("hello World");
        }
        System.out.println();
    }


    // another task to calculate the age of a person based on their year of birth


    public static void age(int birthYear, int curentYear) {

        if (curentYear < birthYear) {
            System.out.println("invalid entry");
        } else {
            int age = curentYear - birthYear;
            System.out.println("you are " + age + " years old");

            System.out.println();
        }
    }
}
