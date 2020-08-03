package Day27_Recap;

import java.util.Arrays;
import java.util.Scanner;

public class Practice_Arrays_1 {

    public static void main(String[] args) {

        // declare all ur classmates names and iterate indexes:

        String[] classmates = {"RumCake", "John", "Jack", "Aalia"};
        // indexes =                0         1      2       3

        System.out.println(classmates[1]);

        // use for loop to iterate all the names:
        System.out.println("========================");
        for (int i = 0; i <= classmates.length - 1; i++) {

            // if( classmates[i].charAt(0) != 'A' ) { // give it as a char
            // { // we want check if names contains A then we need to print it out using charAt method

            // or we can also use the startsWith Method
            if (!classmates[i].startsWith("A")) { // give it as a string
                continue;
            }
            System.out.println(classmates[i]); // this will print out all names without brackets,
            // so prints out only the string elements

        }
        System.out.println("========================");

        int [] numbers = new int[5]; // integer default value is zero

        numbers[3] = 25; // this will change index 3 from zero to 25.
        numbers[1] = 300;
        numbers[4] = 77;

        System.out.println(Arrays.toString(numbers));// Arrays.ToString () used only for single dimensional arrays


        System.out.println("========================");

        //ask user to enter five names and store in one variable


        Scanner scan = new Scanner(System.in);
        String[] names = new String[5];// to initialize the data type,
        // which means we are asking how many numbers of things we require String[5]
        // so enter 5 times, it will be the size of the array

        // or if we want the user to decide how many names he wants to enter we can put it this way:
        // sout (how many names do you want to enter)
       //  String[] names = new String[scan.nextInt()];

       for(int i =0; i<=names.length-1; i++) {


           System.out.println("enter a name");
           names[i] = scan.nextLine(); // here one word will be assigned at array
           // at each of the indexes in the same order it was provided by the user.
       }


        System.out.println(Arrays.toString(names)); // will print out a string





    }
}