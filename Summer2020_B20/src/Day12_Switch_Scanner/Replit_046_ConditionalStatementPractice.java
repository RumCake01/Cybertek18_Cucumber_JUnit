package Day12_Switch_Scanner;

import java.util.Scanner;

public class Replit_046_ConditionalStatementPractice {
    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);
        System.out.print("In:");
        int num = inp.nextInt();
        //DO NOT CHANGE ABOVE CODE!  Write your code below:

        String num1 = (num>=1)? num +" is positive" : (num<0)? num +" is negative" : "";
        System.out.println(num1);

    }
}
