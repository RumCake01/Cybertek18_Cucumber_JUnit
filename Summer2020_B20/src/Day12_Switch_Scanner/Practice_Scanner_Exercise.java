package Day12_Switch_Scanner;


import java.util.Scanner;

public class Practice_Scanner_Exercise {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a number");
        double num1 = scan.nextDouble();
        String result = (num1 %2 == 0) ? num1+ " is even number" : num1+ " is odd  number";

        System.out.println(result);





    }
}
