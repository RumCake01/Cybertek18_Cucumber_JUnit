package Day07_Unary_ShortHand;

import java.util.Scanner;

public class ShortHand {

    public static void main(String[] args) {
        int a = 100;
            a*=a;
        System.out.println(a);
        int b = 2;
        b*=3;

        System.out.println(b);
        System.out.println("==============");
        int c = 300;
        c-=100;

        System.out.println(c);
        System.out.println("==========================");

        // practice the addition assignment  +=

        int z = 300;
        z+=200;
        System.out.println(z);
        System.out.println("==============");

        // adding addition operator to the string

        String schoolName = "Cybertek";
        schoolName = schoolName + "School ";// old way of doing it, nothing wrong with it

        schoolName +=" School"; // faster way to assign valeu to the string using +=
        System.out.println(schoolName);

        System.out.println("==============");

        String fullName = "Rumiya";
        fullName += " Hasnutdinova";
        System.out.println(fullName);
        System.out.println("==================================");

        //String firstName = "Aaron Daniel";
                //firstName -= " Daniel";// substraction doesnt work with String variables. only addition does.


        //Division

        int budget = 1000000;
        budget/=4; // first divides and then assigns value to the variable .
        System.out.println(budget);

        int q = 100;
            q/=2; // the value is 50.
        System.out.println(q);
            q*=2; // this multiplies and brings the value back
        System.out.println(q);

        System.out.println("================================");

        //%= Remainder practice

        int num1 = 100;
            num1 %= 3;
        System.out.println(num1);

        double num2 = 400.5; // decimal will return with a decimal
            num2 %= 2;
        System.out.println(num2);







    }
}
