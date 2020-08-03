package Day16_String;
import java.util.Scanner;
public class Practice_String_methods_Calculator {
    public static void main(String[] args) {

        /*
       write a program to ask the user enter two number and a math operator
       ex:
            10
            20
            *
        output:
            200
            10
            2
            /
        output:
            5
    valid math operators are: *, / , +, -, %
    Nested If */


        Scanner scan = new Scanner(System.in);
        System.out.println("enter your first number: ");
        double num1 = scan.nextDouble();

        System.out.println("enter your second number: ");
        double num2 = scan.nextDouble();

        System.out.println("enter your math operator: ");
        char operator = scan.next().charAt(0);// will return char as an operator

        // now we need declare a pre-condition

        boolean valid= operator=='*' || operator== '/' || operator == '%' || operator== '+' || operator == '-';// if operators equals to any of those operators

        // now we can give a pre-condtiotion

        if(valid){
            switch(operator){
                case '*':
                    System.out.println(num1*num2);
                    break;
                case '/':
                    System.out.println(num1/num2);
                    break;
                case '%':
                    System.out.println(num1%num2);
                    break;
                case '+':
                    System.out.println(num1+num2);
                    break;
                default:
                    System.out.println(num1-num2);// if none of the cases are mathcing then it will go to default, no need break statement
                 }
            } else{
            System.out.println("invalid operator");
            }


    }
}
