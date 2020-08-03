package Day23_Arrays;

import java.util.Scanner;

public class Array_Practice_Class {
    public static void main(String[] args) {

String months[] = {"Jan", "Feb", "March", "April", "May", "June", "July", "August", "September", "October", "November", "Dec"};
        Scanner scan = new Scanner(System.in);
        System.out.println("enter a number");
        int num = scan.nextInt();// whatever user enter we need to sustract one from it for the correct index.

        System.out.println(months[num-1]);// number 5 entered and this will provide us month May.







    }
}
