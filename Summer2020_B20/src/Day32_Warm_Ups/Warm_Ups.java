package Day32_Warm_Ups;
import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;
import java.util.Scanner;
public class Warm_Ups {
    public static void main(String[] args) {


      /*  1. write a method that can return the full name of a person in reugral format
        ex:
        fullName("cYbErTeK", "SCHOOL"); ==> "Cybertek School"
        2. write a return method that accepts two numbers and an operator, then returns calculation result.
        if the oerator is invalid, return zero
        otherwise return the result
        3. write a method that can add element to an array, the method accepts an array and and a number, then returns the new array by appending the number to the last index of the given array
        Ex:
        int[] arr = {1,2,3};
        int num = 4;
        addElement(arr, num); ===> {1,2,3,4} */


        /* 1. write a method that can return the full name of a person in reugral format
        ex:
        fullName("cYbErTeK", "SCHOOL"); ==> "Cybertek School" */

        //System.out.println(fullName("cYbErTeK", "SCHOOL"));

       /* Scanner scan = new Scanner(System.in);
        System.out.println("enter a number");
        int a = scan.nextInt();

        System.out.println("enter an operator");
        int b = scan.nextInt();

        System.out.println("enter a second number");
        int c = scan.nextInt();

        System.out.println(Calculation(a, b, c));*/
        int [] arr = {1, 2, 3};
        addElement(arr, 4);

    }

   /* public static String fullName(String firstName, String lastname) {


        String result = "";

        String firstName2 = firstname.substring(0, 1).toUpperCase() + firstname.substring(1).toLowerCase();

        String lastname2 = lastname.substring(0, 1).toUpperCase() + lastname.substring(1).toLowerCase();

        result = firstName2 + " " + lastname2;

        return result; */


    //
   /* 2. write a return method that accepts two numbers and an operator, then returns calculation result.
        if the operator is invalid, return zero
    otherwise return the result */


   /* public static double Calculation(double num1, char opp, double num2) {
        double result = 0;

        switch (opp) {
            case '+':
                result = (num1 + num2);
                break;
            case '-':
                result = (num1 - num2);
                break;
            case '*':
                result = (num1 * num2);
                break;
            case '/':
                result = (num1 / num2);
                break;
            case '%':
                result = (num1 % num2);
                break;
            default:
                result = 0;
        }
        return result; */


      /*   3. write a method that can add element to an array,
      the method accepts an array and and a number,
       then returns the new array by appending the number
       to the last index of the given array

        Ex:
        int[] arr = {1,2,3};
        int num = 4;
        addElement(arr, num); ===> {1,2,3,4}  */


        public static int[] addElement(int arr[], int number){
            int newArrayPirate[] = new int[arr.length + 1];
            for(int i =0; i<= arr.length-1; i++){
                newArrayPirate[i] += arr[i];
            }

            newArrayPirate[arr.length] = number;
            System.out.println(Arrays.toString(newArrayPirate));
            return newArrayPirate;

        }
    }