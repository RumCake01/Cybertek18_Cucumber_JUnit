package Day12_Switch_Scanner;

import java.util.Scanner;

public class Sum_Of_TwoNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter first number");

        int a = scan.nextInt();
        System.out.println("Enter second number");
        int b = scan.nextInt();
        int total = a + b; // allows to reuse this variables.

        // or you can also do it this way:
        //System.out.println("This is your total: " + (a+b));
        // but it will not make the variables reusable.

        System.out.println("This is your total: " + total);



    }
}
