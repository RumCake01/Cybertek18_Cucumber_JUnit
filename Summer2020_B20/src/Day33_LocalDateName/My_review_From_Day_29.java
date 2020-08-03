package Day33_LocalDateName;

import java.util.Scanner;

public class My_review_From_Day_29 {

    public static void main(String[] args) {
        vote("RumCake", 30, true, "biden");

        vote("James", 17, false, "Mike");

        vote("Dan", 21, true, "Trump");


        eligibleToBuy(true, 17);

        /*Scanner scan = new Scanner(System.in);
        System.out.println("enter a number");
        int a = scan.nextInt();

        System.out.println("enter an operator");
        char operator = scan.nextCh;
        System.out.println("enter a number");
        int a = scan.nextInt(); */

        calculate(100, '*' , 200);


    }


    public static void vote (String name, int age, boolean citizenship, String candidatesName){
        boolean eligibleToVote = age>=18 && citizenship==true;

        if(eligibleToVote) {
            System.out.println(name + " is eligible to vote for " + candidatesName);
        }else{
                System.out.println(name + " not eligible to vote ");
            }


        }



        // eligible to buy alcohol or not

public static void eligibleToBuy(boolean hasId, int age){
        if(hasId && age>=21){
            System.out.println("eligible");
        }else{
            System.out.println("eligible to buy mik");
        }
    }

    // create a method that can calculate 2 numbers

    public static void calculate (int a, char operator, int b){

        switch(operator){
                case '+':
                    System.out.println("addition" + (a+b));
                    break;
                case '-':
                System.out.println("addition" + (a+b));
                break;
                case '/':
                System.out.println("addition" + (a+b));
                break;
                case '%':
                System.out.println("addition" + (a+b));
                break;
                case '*':
                System.out.println("multiplication: " + (a+b));
                break;
                case '0':
                System.out.println("invalid");
                break;

        }
    }
}
