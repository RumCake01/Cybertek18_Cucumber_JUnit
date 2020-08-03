package Warm_Up_Tasks;

import java.util.Scanner;

public class Next_Line_User_Info06_23 {
    public static void main(String[] args) {
        /*2. write a program that asks the user enter the:
        1. company name
        2. first name
        3. last name
        4. Job title
        5. salary*/

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter company name: ");
        String companyName = input.nextLine();

        System.out.println("Please enter your name: ");
        String firstName = input.nextLine();

        System.out.println("Please enter your last name: ");
        String lastName = input.next();

        String fullName = firstName + " " + lastName;
        input.nextLine();

        System.out.println("Please enter your job title: ");
        String jobTitle = input.nextLine();

        System.out.println("Please enter your salary: ");
        double salary = input.nextDouble();

        System.out.println("Full Name is: " + fullName +"\nWorks at: " + companyName + "\nJob Title is: "  + jobTitle + "\nSalary is: " + (int) salary+ " dollars" );
        input.close();
    }
}
