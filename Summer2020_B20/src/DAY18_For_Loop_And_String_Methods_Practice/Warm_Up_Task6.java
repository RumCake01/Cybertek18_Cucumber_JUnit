package DAY18_For_Loop_And_String_Methods_Practice;

import java.util.Scanner;

public class Warm_Up_Task6 {
    public static void main(String[] args) {

        /*
        write a program that will return the domain of an email address:
            Ex:
                input: test@gmail.com
                output: the domain of the email is: gmail
                inputL: Cybertek@yahoo.com
                output: the domain of the email is: yahoo
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("please enter a email");
        String email1 = scan.next();


        String result = "";
        if(email1.contains("gmail")){
            result = " the domain of the email is: gmail";
        }else{
            result = " the domain of the email is: yahoo";
        }
        System.out.println(result);












    }
}
