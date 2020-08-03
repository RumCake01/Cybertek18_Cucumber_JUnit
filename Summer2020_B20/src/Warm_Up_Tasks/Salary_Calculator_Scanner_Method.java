package Warm_Up_Tasks;
import java.util.Scanner;

public class Salary_Calculator_Scanner_Method {
    public static void main(String[] args) {
        /*
        2. write a program that can calculate the tax based on the annual salary
                    1. ask the user enter the annual salary
                    2. ask user to enter the full name
                    3. ask user enter marrid status (use nextBoolean() method this time)
                    assume that the normal tax rate for a person is set to 25 %. if he/she is married tax rate will be set to 20%
                    the program should display all the informations in teh output
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("enter the annual salary");
        double annualSalary = scan.nextDouble();

        System.out.println("enter your full name");
        String fullName = scan.nextLine();

        System.out.println("enter your marital status");
        boolean maritalStatus = scan.nextBoolean();

        double taxRate = 0.25;

        /*
        System.out.println("Are you married? True or False: ");
        boolean maritalStatus = keyboard.nextBoolean();
        double taxRate, taxDeduction, salaryAfterDeduction = 0;
        if(maritalStatus == true){
            taxRate = .20;
            taxDeduction = annualSalary * taxRate;
            salaryAfterDeduction = annualSalary - taxDeduction;
        }else{
            taxRate = .25;
            taxDeduction = annualSalary * taxRate;
            salaryAfterDeduction = annualSalary - taxDeduction;
        }
        System.out.println("Dear " +fullName+ ", \n\tBased on your annual salary of "+annualSalary+ " and marital status;" +
                " \n\tyour tax rate is: " +taxRate+" \n\tand the total amount of tax deduction for this year is: "
                +taxDeduction+ ". " + "\n\tYour salary after the tax deduction is: "+salaryAfterDeduction);

         */







    }

}
