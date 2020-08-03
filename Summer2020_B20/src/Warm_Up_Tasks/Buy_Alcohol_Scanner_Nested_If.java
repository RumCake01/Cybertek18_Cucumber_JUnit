package Warm_Up_Tasks;

import java.util.Scanner;

public class Buy_Alcohol_Scanner_Nested_If {
    /*
     3. write a program that asked the user enter the age and based on the input the program should be able to check if
     the person is eligible to buy alcohol
                if age is > 21 , print "here is your wine"
                if age is < 21, print "get out kid"
                if age is invalid, print "Invalid Entry"
                MUST use Scanner and nested IF
     */
    public static void main(String[] args) {

                Scanner scan = new Scanner(System.in);
                System.out.println("Enter a number");
                int age = scan.nextInt();
                String result = "";

                if(age>0 && age <=110){
                if(age <21){
                    result = "get out kid";
                }else{
                    result = "here is your wine";
                }
                }else{
                result = "Invalid Entry";
                }
                System.out.println(result);
    }

}