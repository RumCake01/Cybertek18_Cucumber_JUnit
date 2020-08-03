package Day23_Arrays;

import java.util.Scanner;

public class Calculator_All_Operators_Nested_Loop_SwitchStatement {
    public static void main(String[] args) {

         /*
         1. write a program that ill ask user to enter two numbers and calculates the sum of those two numbers. then it asks the user if he/she wants to continue
                    if the answer is yes, repeat the whole process again
                    if the answer is no, only return the addition
                    but while the anser is not a valid answer (not yes or no), the the program should repeatedly ask the user re-enter
            HINT: nested loop task, outter loop need to be an infinite loop

         */

        Scanner input = new Scanner(System.in);

        while(true) {


            System.out.println("enter two numbers");
            double num1 = input.nextDouble();
            double num2 = input.nextDouble();
            System.out.println("enter the math operator");// user will enter a character
            char operator = input.next().charAt(0);

            // we can user ternary here below:

           // double result = (operator=='+')? num1+num2 : (operator=='-')? num1-num2 : (operator=='*')? num1*num2
                    //: (operator=='/')? num1/num2 : (operator=='%')? num1%num2 : 0;//

           // System.out.println(result);//


            // or we can do in switch statement:

            switch(operator){
                case '+':
                    System.out.println(num1+num2 );
                    break;
                case '-':
                    System.out.println(num1-num2 );
                    break;
                case '*':
                    System.out.println(num1*num2 );
                    break;
                case '/':
                    System.out.println(num1/num2 );
                    break;
                case '%':
                    System.out.println(num1%num2 );
                    break;

                default:
                    System.out.println("invalid operator");
            }

            System.out.println("do u want to continue?");
            String a = input.next().toLowerCase(); // to convert user input to lower case

            while (!(a.equals("yes") || a.equals("no")) ) {// we use while loop here because while the answer
                // is not valid it will repeatedly continue asking
                System.out.println("Invalid Answer, please enter yes or no");
                System.out.println("do u want to continue?");
                a = input.next().toLowerCase(); // to turn everything to lower case
            }
            if(a.equals("no")) {
                break;
            }
        }
        System.out.println("thanks for using cybertek's calculator");















    }
}
